package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Riya");
		nameList.add("Rada");
		nameList.add("Mona");
		nameList.add("Ram");
		 
		//using iterator
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//using for each loop
		for(String name:nameList) {
			System.out.println(name);
		}
	}

}
