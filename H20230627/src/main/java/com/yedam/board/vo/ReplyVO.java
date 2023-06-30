package com.yedam.board.vo;

import java.util.Date;

import lombok.Data;

@Data

public class ReplyVO {

	private long replyNo;
	private String reply;
	private long brdNo;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
	
}
