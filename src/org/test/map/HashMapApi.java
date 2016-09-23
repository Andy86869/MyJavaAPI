package org.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * HashMap 遍历
 */
public class HashMapApi {
	public static void main(String[] args) {
		// 方法#1 使用For-Each迭代entries
		hashMap1();
		hashMap2();
		hashMap3();
	}

	/**
	 * 方法#1 使用For-Each迭代entries
	 */
	public static void hashMap1() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + ",value =" + entry.getValue());
		}
	}

	/**
	 * 方法#2 使用For-Each 迭代 只需要用到map的keys或values时，可以遍历KeySet或者values代替entrySet
	 * 这个方法比entrySet迭代具有轻微的性能优势(大约快10%)并且代码更简洁
	 */
	public static void hashMap2() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		for (Integer key : map.keySet()) {
			System.out.println("key = " + key);
		}
		for (Integer value : map.values()) {
			System.out.println("value = " + value);
		}
	}

	/**
	 * 使用Iterator 迭代
	 */
	public static void hashMap3() {
		// 使用泛型
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = entries.next();
			System.out.println("key="+entry.getKey()+",value = "+entry.getValue());
		}
		//不使用泛型
		Map map1 = new HashMap();
		map1.put(1, 1);
		map1.put(2, 2);
		map1.put(3, 3);
		map1.put(4, 4);
		map1.put(5, 5);
		Iterator entries1 = map.entrySet().iterator();
		while(entries1.hasNext()){
			Map.Entry entry1 =(Entry) entries1.next();
			System.out.println("key = "+entry1.getKey()+", value = "+entry1.getValue());
		}
	}
}
