package org.test.array;

import java.util.ArrayList;

/**
 * @author Andy retainAll () 方法来计算两个数组的交集
 */
public class ArrayAdd {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		System.out.println("array1 数组元素：" + objArray);
		System.out.println("array2 数组元素：" + objArray2);
		objArray.retainAll(objArray2);
		System.out.println("array2 & array1 数组交集为：" + objArray);
	}
}
