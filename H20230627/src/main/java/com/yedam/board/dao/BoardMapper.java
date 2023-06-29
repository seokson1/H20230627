package com.yedam.board.dao;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> listBoard ();
	
	public BoardVO getBoard(long id);
	
}
