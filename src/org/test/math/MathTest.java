package org.test.math;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math.round(11.5);
		Math.round(-11.5);
		System.out.println(Math.round(11.3));
		System.out.println(Math.round(-12.7));
		System.out.println(Math.round(Math.random()*9000+1000));
	}

}
