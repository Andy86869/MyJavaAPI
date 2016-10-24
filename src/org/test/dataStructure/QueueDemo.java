package org.test.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Andy Queue 实现
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		//添加元素
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		
		for (String q : queue) {
			System.out.println(q);
		}
		
		System.out.println("====");
		System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
		for (String q : queue) {
			System.out.println(q);
		}
		System.out.println("===");
		System.out.println("element="+queue.element()); // 返回第一个元素
		for (String q : queue) {
			System.out.println(q);
		}
		
		System.out.println("===");
		System.out.println("peek="+queue.peek()); // 返回第一个元素
		for (String q : queue) {
			System.out.println(q);
		}
	}
}
