package org.test.dataStructure;

/**
 * @author Andy do ... while 结构
 */
public class Sum {
	public static void main(String[] args) {
		int limit = 100;
		int sum = 0;
		int i = 1;
		do {
			sum = sum + i;
			i++;
		} while (i <= limit);
		System.out.println("sum =" + sum);
	}
}
