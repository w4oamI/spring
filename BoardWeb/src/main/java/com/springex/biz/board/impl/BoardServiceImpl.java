package com.springex.biz.board.impl;

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
}
