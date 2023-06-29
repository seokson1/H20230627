package com.yedam.calendar.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.calendar.service.CalendarService;
import com.yedam.calendar.service.CalendarServiceImpl;
import com.yedam.calendar.vo.CalendarVO;
import com.yedam.common.Control;

public class RemoveEventControl implements Control {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
			
		CalendarService service = new CalendarServiceImpl();
		CalendarVO vo = new CalendarVO();
		
		String title = req.getParameter("title");
		
		vo.setTitle(title);
		boolean result = service.removeEvent(vo);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(vo);
		if(result) {
			json ="{\"retCode\":\"Success\"}";
		} else {
			json = "{\"retCode\" : \"Fail\"}";
		}
		
		return json+".json";
	}

}
