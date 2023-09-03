package com.springCore.Collection2;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<Answer>answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	public void display()
	{
		System.out.println(id+"  "+name);
		System.out.println("Answer are ");
		Iterator<Answer> itr = answer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
