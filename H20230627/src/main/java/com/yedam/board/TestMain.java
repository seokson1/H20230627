package com.yedam.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.board.dao.BoardMapper;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.DataSource;

public class TestMain {

	public static void main(String[] args) {
		SqlSession session = DataSource.getInstance().openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		
		List<BoardVO> list = mapper.listBoard();
		
		for(BoardVO brd : list) {
			System.out.println(brd);
		}
		
		
	}

}
