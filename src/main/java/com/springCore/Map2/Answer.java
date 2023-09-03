package com.springCore.Map2;

import java.util.Date;

public class Answer {

	private int id;
	private String ans;
	private Date postedDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", ans=" + ans + ", postedDate=" + postedDate + "]";
	}
	
	
}
