package com.springCore.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String, String>answer;
	
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
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
	public void display()
	{
		System.out.println("Question id : "+id);
		System.out.println("Question Name : "+name);
		System.out.println();
		System.out.println("Answer are : ");
		System.out.println();
		Set<Entry<String, String>>set = answer.entrySet();
		Iterator<Entry<String, String>>itr = set.iterator();
		
		while (itr.hasNext()) {
				Entry<String, String>entry=itr.next();
				System.out.println("Answer :"+entry.getKey());
				System.out.println("Posted By :"+entry.getValue());
		}
	}
}
