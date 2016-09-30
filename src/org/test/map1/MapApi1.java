package org.test.map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map 遍历 test
 */
public class MapApi1 {
	public static void main(String[] args) {
		map3();
	}
	/**
	 * for each 遍历 entry 拿到keys 和values
	 */
	public static void map1(){
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			System.out.println("keys:"+entry.getKey()+"values:"+entry.getValue());
		}
	}
	/**
	 * for each 遍历 map 中的keys or values
	 */
	public static void map2(){
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		
		for(Integer keys:map.keySet()){
			System.out.println("keys="+keys);
		}
		for(Integer values:map.values()){
			System.out.println("values="+values);
		}
	}
	/**
	 * 迭代器遍历
	 */
	public static void map3(){
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, Integer> entry1 = entries.next();
			entries.remove();
			System.out.println("key = "+entry1.getKey()+", value = "+entry1.getValue());
		}
				
	}
}
