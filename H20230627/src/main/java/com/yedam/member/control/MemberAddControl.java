package com.yedam.member.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.member.service.MemberService;
import com.yedam.member.service.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class MemberAddControl implements Control {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		
		String id = req.getParameter("uid");
		String pw = req.getParameter("upw");
		String name = req.getParameter("uname");
		String phone = req.getParameter("uphone");
		String addr = req.getParameter("uaddr");
		String birth = req.getParameter("ubirth");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		MemberService svc = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setUserId(id);
		vo.setUserPw(pw);
		vo.setUserName(name);
		vo.setUserPhone(phone);
		vo.setUserAddr(addr);
		try {
			vo.setUserBirth(sdf.parse(birth));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		svc.addMember(vo);
		
		Gson gson = new GsonBuilder().create();
		return gson.toJson(vo) + ".json";
	}

}
