package com.springCore.Collection;

import java.util.Iterator;
import java.util.List;

public class Question {

		private int id;
		private String name;
		private List<String>answer;
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
		public List<String> getAnswer() {
			return answer;
		}
		public void setAnswer(List<String> answer) {
			this.answer = answer;
		}
		
		void display()
		{
			System.out.println(id+"  "+name);
			System.out.println("Answer are : ");
			Iterator<String> itr = answer.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
}
