package org.test.dataStructure;

import java.util.LinkedList;

/**
 * @author Andy 实例演示了如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		main2();
	}
	
	/**
	 * 实例演示了使用 Clear() 方法来删除链表中的元素：
	 */
	 public static void main2() {
	      LinkedList<String> lList = new LinkedList<String>();
	      lList.add("1");
	      lList.add("8");
	      lList.add("6");
	      lList.add("4");
	      lList.add("5");
	      System.out.println(lList);
	      lList.subList(2, 4).clear();
	      System.out.println(lList);
	   }
	/**
	 * 实例演示了如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
	 */
	public static void main1() {
		LinkedList<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
		list.addFirst("0");
		System.out.println(list);
		list.addLast("4");
		System.out.println(list);
	}
}
