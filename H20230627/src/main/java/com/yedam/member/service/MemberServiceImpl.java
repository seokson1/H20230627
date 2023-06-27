package com.yedam.member.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.member.dao.MemberMapper;
import com.yedam.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	SqlSession session = DataSource.getInstance().openSession(true);
	MemberMapper mapper = session.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> members() {
		
		return mapper.memberList();
	}

	@Override
	public MemberVO login(String id, String pw) {
		
		return mapper.login(id, pw);
	}

	@Override
	public List<Map<String, Object>> getData() {

		return mapper.chartData();
	}

}
