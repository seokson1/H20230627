package com.yedam.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.board.dao.BoardMapper;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.DataSource;

public class BoardServiceImpl implements BoardService {
	SqlSession session = DataSource.getInstance().openSession(true);
	BoardMapper mapper = session.getMapper(BoardMapper.class);

	@Override
	public List<BoardVO> boardList(int page) {
		return mapper.selectList(page);
	}

	@Override
	public BoardVO getBoard(long brdNo) {
		BoardVO brd = mapper.selectOne(brdNo);
		mapper.clickCount(brdNo);
		return brd;
	}

	@Override
	public int totalCount() {
		return mapper.selectCount();
	}

	@Override
	public boolean clickCnt(long brdNo) {
		return mapper.clickCount(brdNo) == 1;
	}

}
