package com.springCore.Map2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jdk.nashorn.internal.ir.WhileNode;

public class Question {

	private int id;
	private String name;
	private Map<Answer, User> answer;
	
	
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
	public Map<Answer, User> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Answer, User> answer) {
		this.answer = answer;
	}
	
	public void display()
	{
		System.out.println("Question id :"+id);
		System.out.println("Question Name : "+name);
		System.out.println();
		System.out.println("Answer.....");
		System.out.println();
		
	Set<Entry<Answer,User>>set = answer.entrySet();
	Iterator<Entry<Answer, User>>itr = set.iterator(); 
			
	while (itr.hasNext()) {
		Entry<Answer, User>entry = itr.next();
		Answer ans = entry.getKey();
		User user = entry.getValue();
		
		System.out.println("Answer information");
		System.out.println(ans);
		System.out.println("Posted By");
		System.out.println(user);
		
	}
	
	}
}
