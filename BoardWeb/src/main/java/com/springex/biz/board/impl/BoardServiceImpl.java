package com.springex.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springex.biz.board.BoardService;
import com.springex.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	public BoardDAO boardDAO;
	
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}
	
	public void getBoard(BoardVO vo) {
		boardDAO.getBoard(vo);
	}
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo){
		return boardDAO.getBoardList(vo);
	}
}
