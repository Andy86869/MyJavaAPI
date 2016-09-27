package org.test.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 反转 利用 Collections.reverse()
 */
public class ArrayReverse {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("aa");
		arrayList.add("bb");
		arrayList.add("cc");
		System.out.println("反转前:"+arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后:"+arrayList);
	}
}
