package com.yedam.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.board.dao.ReplyMapper;
import com.yedam.board.vo.ReplyVO;
import com.yedam.common.DataSource;

public class TestMain {

	public static void main(String[] args) {
		SqlSession session = DataSource.getInstance().openSession();
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		
		ReplyVO vo = new ReplyVO();
		
		vo.setBrdNo(182);
		vo.setReply("새로 수정");
		vo.setReplyer("uiser5");
		
		mapper.insertReply(vo);
		//mapper.updateReply(vo);
		//mapper.deleteReply(2);
		
		List<ReplyVO> list = mapper.selectList(182);
		for(ReplyVO re : list) {
			System.out.println(re.toString());
		}
	
		
		
	}

}
