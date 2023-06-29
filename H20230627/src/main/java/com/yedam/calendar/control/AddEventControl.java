package com.yedam.calendar.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.calendar.service.CalendarService;
import com.yedam.calendar.service.CalendarServiceImpl;
import com.yedam.calendar.vo.CalendarVO;
import com.yedam.common.Control;

public class AddEventControl implements Control {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		
		String title = req.getParameter("title");
		String start = req.getParameter("start");
		String end = req.getParameter("end");
		
		CalendarVO vo = new CalendarVO();
		vo.setTitle(title);
		vo.setStartDate(start);
		vo.setEndDate(end);
		
		
		CalendarService service = new CalendarServiceImpl();
		
		boolean result = service.addEvent(vo);
		
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(vo);
		if(result) {
			json = "{\"retCode\":\"Success\"}";
		} else {
			json = "{\"retCode\" : \"Fail\"}";
		}
		// 성공{"retCode":"Success"}/ 실패 {"retCode":"Fail"}
		return json+".json";
	}

}
