package org.test.connection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListApi {

	public static void main(String[] args) {
		// arrayList();
		// 使用 for-each 循环
		iteraterListByForEach();
		// 使用iterator 遍历list 集合
//		iteratorListByIterator();
		//使用list 的Listiterator()方法遍历
//		listByListIterator();
	}

	/**
	 * 使用 for-each 循环 遍历list 集合
	 */
	public static void iteraterListByForEach() {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("b");
		strList.add("c");
		// 使用 for-each 循环
		for (String obj : strList) {
			System.out.println("strList:" + obj);
		}
	}

	/**
	 * 使用迭代器遍历list更加安全,因为它可以确保,在当前遍历的集合元素被更改的时候,
	 * 会抛出ConcurrentModificationException
	 */
	public static void iteratorListByIterator() {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("b");
		strList.add("c");
		Iterator<String>it = strList.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			System.out.println("obj:" + obj);
		}
	}
	/**
	 * 通过list 的Listiterator()方法遍历
	 */
	public static void listByListIterator() {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("b");
		strList.add("c");
		ListIterator<String> li = strList.listIterator();
		// 正向遍历
		while(li.hasNext()){
			System.out.print(li.next());
		}
		System.out.println("");
		//反向遍历
		while (li.hasPrevious()) {
			System.out.print(li.previous());
		}
	}

	/**
	 * 截取string 字符串,并将其添加到ArrayList中
	 */
	public static void arrayList() {
		String str1 = "chuck//vip//css//html//js//nodejs";
		String str2[] = str1.split("//");

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str2.length; i++) {
			list.add(str2[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
