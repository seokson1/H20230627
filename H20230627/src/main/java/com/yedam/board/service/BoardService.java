package com.yedam.board.service;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardService {

		public List<BoardVO> brdList();
		
		public BoardVO brdSearch(long brdNO);
}
