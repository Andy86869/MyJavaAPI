package com.jueshu.test;

import java.util.Date;

public class StringBufferAndString {
	
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		String str = new String();
		Date date = new Date();
		for (int i = 0; i < 10000; i++) {
			sbf.append(i);
		}
		
		for (int i = 0; i < 10000; i++) {
			str =str+i;
		}
	}
}
