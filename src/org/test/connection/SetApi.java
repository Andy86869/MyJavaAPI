package org.test.connection;

import java.util.HashSet;
import java.util.Set;

/**
 * Set 无序 不可重复
 */
public class SetApi {
	public static void main(String[] args) {
		
	}
	
	public static void set1(){
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(3);
		
	}
}
