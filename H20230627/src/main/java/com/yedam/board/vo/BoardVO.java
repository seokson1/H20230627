package com.yedam.board.vo;

import java.util.Date;

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
	private String userName;
	private String brdContent;
	private Date createDate;
	private int clickCnt;
	
	
}
