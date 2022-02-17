package com.springex.biz.board;

import java.util.List;

public interface BoardService {
	void insertBoard(BoardVO vo);
	void deleteBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	void updateBoard(BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
}
