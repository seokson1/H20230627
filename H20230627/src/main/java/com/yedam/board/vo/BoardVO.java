package com.yedam.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoardVO {
	
	private long brdNo;
	
	private String brdTitle;
	
	private String brdWriter;
	
	private String brdContent;
	
	private String regDate;
	
	private int clickCnt;
	
	
}
