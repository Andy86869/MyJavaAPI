package org.test.map;

import java.util.Hashtable;

public class HashtableApi {
	public static void main(String[] args) {
		hashTable1();
	}
	public static void hashTable1(){
		Hashtable<String, Object> num = new Hashtable<>();
		num.put("1", 1);
		num.put("2", 2);
		num.put("3", 3);
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
		
	}
}
