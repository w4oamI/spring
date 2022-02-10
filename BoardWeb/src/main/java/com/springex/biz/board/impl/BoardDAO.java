package com.springex.biz.board.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springex.biz.board.BoardVO;
import com.springex.biz.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String INSERT = "insert into board(seq, title, writer, content) values ((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String UPDATE = "update board set title=?, content=?, where seq=?";
	private final String DELETE = "delete board where req=?";
	private final String GET = "select * from board where ewq=?";
	private final String LIST = "select * from board order by seq desc";
	
	public void insertBoard(BoardVO vo) {
		System.out.println("insert");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.close(stmt,conn);
		}
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("delete");
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println(" getBoard ");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, stmt ,conn);
		}
		return board;
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("update");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("getBoardList");
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardList;
	}
}
