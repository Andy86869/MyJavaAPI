package org.test.reflect;

/**
 * @author Andy Java 获取方法信息
 */
public class ClassDemo3 {
	public static void main(String[] args) {
		Class c1 = int.class;// int 的类类型
		Class c2 = String.class;// String 的类类型 String 类字节码

		Class c3 = double.class; // double 数据类型的类类型
		Class c4 = Double.class; // Double 类类型
		
		Class c5 =void.class;//
		
		System.out.println(c1.getName());
		System.out.println(c1.getTypeName());
		System.out.println("===========");
		System.out.println(c2.getName()+c2.getSimpleName());
		
	}
}
