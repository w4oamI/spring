package com.springex.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springex.biz.board.BoardService;
import com.springex.biz.board.BoardVO;
import com.springex.biz.common.Log4jAdvice;
import com.springex.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	public BoardDAO boardDAO;
//	public LogAdvice log;
//	
//	public BoardServiceImpl() {
//		log = new LogAdvice();
//	}
	public Log4jAdvice log;
	
	public BoardServiceImpl() {
		log = new Log4jAdvice();
	}
	public void insertBoard(BoardVO vo) {
//		log.printLog();
		log.printLogging();
		boardDAO.insertBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {
//		log.printLog();
		log.printLogging();
		boardDAO.deleteBoard(vo);
	}
	
	public void getBoard(BoardVO vo) {
//		log.printLog();
		log.printLogging();
		boardDAO.getBoard(vo);
	}
	public void updateBoard(BoardVO vo) {
//		log.printLog();
		log.printLogging();
		boardDAO.updateBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo){
//		log.printLog();
		return boardDAO.getBoardList(vo);
	}
}
