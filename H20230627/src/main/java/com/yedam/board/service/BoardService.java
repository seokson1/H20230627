package com.yedam.board.service;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> boardList(int page);
	public int totalCount();
	public BoardVO getBoard(long brdNo);
	public boolean clickCnt(long brdNo);
}
