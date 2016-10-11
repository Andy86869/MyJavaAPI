package org.test.thread;

/**
 * @author Andy 线程 actor
 *
 */
public class Actor extends Thread {

	public void run() {
		System.out.println(getName()+"是一个演员");
		int count = 0;
		boolean keepRuning = true;
		while(keepRuning){
			System.out.println(getName()+"登台演出了"+(++count));
			if (count==100) {
				keepRuning = false;
			}
			if (count%10==0) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("演出结束了!");
	}
	public static void main(String[] args) {
		Thread thread1 = new Actor();
		thread1.setName("Chuck");
		thread1.start();
		Thread thread = new Thread(new Actress(), "Ms.Gao");
		thread.start();
	}
}
