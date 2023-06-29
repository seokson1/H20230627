package com.yedam.calendar;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.calendar.dao.CalendarMapper;
import com.yedam.calendar.vo.CalendarVO;
import com.yedam.common.DataSource;

public class TestMain {
	public static void main(String[] args) {
		SqlSession session = DataSource.getInstance().openSession();
		CalendarMapper mapper = session.getMapper(CalendarMapper.class);
		
		CalendarVO vo = new CalendarVO();
		vo.setTitle("여행가자");
		vo.setStartDate("2023-06-22");
		vo.setEndDate("2023-06-23");
		
		mapper.delete(vo);
		
		List<CalendarVO> list = mapper.getList();
		for(CalendarVO cal : list) {
			System.out.println(cal);
		}
		
	}
}
