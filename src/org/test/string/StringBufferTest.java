package org.test.string;

public class StringBufferTest {
	
	public static void main(String[] args) {
		String tempstr = "abcdefghijklmnopqrstuvwxyz";   
		 int times = 5000;   
		 long lstart1 = System.currentTimeMillis();   
		 String str = "";   
		 for (int i = 0; i < times; i++) {   
		     str += tempstr;   
		 }   
		 long lend1 = System.currentTimeMillis();   
		 long time = (lend1 - lstart1);   
		 System.out.println(lstart1);
		 System.out.println(lend1);
		 System.out.println(time); 
		 
	}
	
}
