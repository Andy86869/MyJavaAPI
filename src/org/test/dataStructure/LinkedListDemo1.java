package org.test.dataStructure;

import java.util.LinkedList;

/**
 * @author Andy 实例演示了使用 top() 和 pop() 方法来获取链表的元素：
 */
public class LinkedListDemo1 {

	private LinkedList list = new LinkedList();

	public void push(Object v) {
		list.addFirst(v);
	}

	public Object top() {
		return list.getFirst();
	}

	public Object pop() {
		return list.removeFirst();
	}

	public static void main(String[] args) {
		LinkedListDemo1 stack = new LinkedListDemo1();
		for (int i = 30; i < 40; i++) {
			stack.push(new Integer(i));
		}
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
