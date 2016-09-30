package org.test.connection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListApi1 {
	
	public static void main(String[] args) {
		list4();
	}
	/**
	 * 通过for 循环遍历list
	 */
	public static void list1(){
		
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("ccc");
		for(int i = 0;i<list.size();i++){
			String str_list = list.get(i);
			System.out.println(str_list);
		}
	}
	/**
	 * 通过for each 循环 遍历list
	 */
	public static void list2(){
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("ccc");

		for(String obj:list){
			System.out.println(obj);
		}
	}
	public static void list4(){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> iterator =  list.iterator();
		while(iterator.hasNext()){
			Integer i = iterator.next();
			System.out.println(i);
		}
	}
	/**
	 * 通过list 的方法 listIterator 来实现循环,listIterator 还有添加,修改,删除元素的方法
	 */
	public static void list3(){
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		ListIterator<String> li = list.listIterator();
		while(li.hasNext()){
			String obj = (String) li.next();
			System.out.println(obj);
		}
	}
}
