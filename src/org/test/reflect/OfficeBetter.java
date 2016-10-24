package org.test.reflect;

public class OfficeBetter {
	public static void main(String[] args) {
		try {
			Class c1 = Class.forName(args[0]);

			OfficeAble oa = (OfficeAble) c1.newInstance();
			oa.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
