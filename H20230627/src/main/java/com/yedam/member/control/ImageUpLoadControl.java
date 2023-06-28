package com.yedam.member.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yedam.common.Control;
import com.yedam.member.service.MemberService;
import com.yedam.member.service.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class ImageUpLoadControl implements Control {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		String savePath = req.getServletContext().getRealPath("/images");
		String enc = "UTF-8";
		int maxSize = 1024 * 1024 * 10;
		String json = "";
		try {
			MultipartRequest multi = 
					new MultipartRequest(req, savePath, maxSize, enc, new DefaultFileRenamePolicy());
			String id = multi.getParameter("id");
			String fileName = multi.getFilesystemName("image");
			
			MemberVO vo = new MemberVO();
			vo.setUserId(id);
			vo.setUserImg(fileName);
			
			MemberService service = new MemberServiceImpl();
			
			if(service.modifyImage(vo)) {
				// {"retCode":"Success", "path":"fileName"}
				json = "{\"retCode\":\"Success\", \"path\":\""+fileName+"\"}";
			} else {
				json = "{\"retCode\":\"Fail\"}";
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return json + ".json";
		
	}

}
