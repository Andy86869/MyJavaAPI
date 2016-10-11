package org.test.thread;

public class Student extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"开始了");
	}
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Student(), "chuck");
		thread1.start();
	}
}
