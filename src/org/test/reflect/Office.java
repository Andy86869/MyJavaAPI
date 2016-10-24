package org.test.reflect;

public class Office {
	public static void main(String[] args) {
		// new 对象是静态加载类,在编译时刻就需要加载所有可能使用到的类   如下编译无法通过
		if ("Word".equals(args[0])) {
			Word w = new Word();
			w.start();
		}
		if ("Excel".equals(args[0])) {
			Excel e = new Excel();
			e.start();
		}
	}
}
