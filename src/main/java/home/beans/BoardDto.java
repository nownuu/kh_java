package home.beans;

import java.sql.Date;

public class BoardDto {
	private int boardNo;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private Date boardTime;
	private int boardRead;
	private int boardReply;
	private int boardSuperNo;
	private int boardGroupNo;
	private int boardDepth;
	public BoardDto() {
		super();
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getBoardTime() {
		return boardTime;
	}
	public void setBoardTime(Date boardTime) {
		this.boardTime = boardTime;
	}
	public int getBoardRead() {
		return boardRead;
	}
	public void setBoardRead(int boardRead) {
		this.boardRead = boardRead;
	}
	public int getBoardReply() {
		return boardReply;
	}
	public void setBoardReply(int boardReply) {
		this.boardReply = boardReply;
	}
	public int getBoardSuperNo() {
		return boardSuperNo;
	}
	public void setBoardSuperNo(int boardSuperNo) {
		this.boardSuperNo = boardSuperNo;
	}
	public int getBoardGroupNo() {
		return boardGroupNo;
	}
	public void setBoardGroupNo(int boardGroupNo) {
		this.boardGroupNo = boardGroupNo;
	}
	public int getBoardDepth() {
		return boardDepth;
	}
	public void setBoardDepth(int boardDepth) {
		this.boardDepth = boardDepth;
	}
	// 추가 : 댓글이 존재하는지?
	public boolean isReplyExist() {
		return this.boardReply > 0;
	}
	//추가 : 답변글인지 확인 메소드
		public boolean hasDepth() {
			return this.boardDepth > 0;
		}
	@Override
	
	public String toString() {
		return "BoardDto [boardNo=" + boardNo + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardTime=" + boardTime + ", boardRead=" + boardRead + ", boardReply=" + boardReply
				+ ", boardSuperNo=" + boardSuperNo + ", boardGroupNo=" + boardGroupNo + ", boardDepth=" + boardDepth
				+ "]";
	}
}
