package org.test.thread;

/**
 * @author Andy
 * actress 线程 通过runable 来实现
 */
public class Actress implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"是一个演员");
		int count = 0;
		boolean keepRuning = true;
		while(keepRuning){
			System.out.println(Thread.currentThread().getName()+"登台演出了"+(++count));
			if (count==10000) {
				keepRuning = false;
			}
//			if (count%10==0) {
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
		System.out.println("演出结束了!");
		
	}
	public static void main(String[] args) {
//		Thread thread = new Thread(new Actress(), "Ms.Gao");
//		thread.start();
	}
}
