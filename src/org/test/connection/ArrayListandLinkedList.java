package org.test.connection;

import java.util.ArrayList;

public class ArrayListandLinkedList {
	static long start = System.currentTimeMillis();
	static ArrayList<Object> list = new ArrayList<>();
	public static void main(String[] args) {
		
		Object obj = new Object();
		for (int i = 0; i < 5000000; i++) {
			list.add(obj);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
