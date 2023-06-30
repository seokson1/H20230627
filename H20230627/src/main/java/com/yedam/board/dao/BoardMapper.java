package com.yedam.board.dao;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardMapper {

	public List<BoardVO> selectList(int page);
	public int selectCount();
	public BoardVO selectOne(long brdNo);
	public int clickCount(long brdNo);

}
