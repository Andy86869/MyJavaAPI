package org.test.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Andy 数组获取最大最小值
 *
 */
public class MaxMinArray {
	public static void main(String[] args) {
		Integer numbers[] = {23,3,4,35,76,8,98,66};
		int max = Collections.max(Arrays.asList(numbers));
		int min = Collections.min(Arrays.asList(numbers));
		
		System.out.println("最大值:"+max+"最小值:"+min);
	}
}
