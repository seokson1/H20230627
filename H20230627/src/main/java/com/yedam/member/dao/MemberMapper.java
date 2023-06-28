package com.yedam.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yedam.member.vo.MemberVO;

public interface MemberMapper {
	
	public List<MemberVO> memberList();
	
	public MemberVO login(@Param("id")String id, @Param("pw")String pw);
	
	public int insert(MemberVO member);
	
	public List<Map<String, Object>> chartData();
	
	public MemberVO select(@Param("id") String id);
	
	public int update(MemberVO member);
	
	public int updateImage(MemberVO member);
}
	
	
