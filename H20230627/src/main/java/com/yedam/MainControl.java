package com.yedam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class MainControl implements Control {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String page = "";
		page="main/main.tiles";
//		page = "prod/sample.tiles";
		return page;
	}

}
