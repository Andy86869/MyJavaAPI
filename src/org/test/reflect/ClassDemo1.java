package org.test.reflect;

/**
 * @author Andy Java 反射机制 什么是Java反射机制 :
 *         在运行状态下,一个类,都能获取到自己的任何方法和属性;对于对象,都能调用自己任意的方法和属性;这种动态获取信息和动态调用方法的功能称之为
 *         Java 的反射机制 类是对象,类是java.lang.Class类的实例对象
 */
public class ClassDemo1 {
	public static void main(String[] args) {
		// Fool的实例对象表示
		Fool fool1 = new Fool();
		// Fool 这个类是一个实例对象,他是Class类的是对象
		// 任何一个类都是Class类的实例对象,这个实例对象的表示方法有三种
		// 第一种表示方式(任何一个类都有一个隐含的静态成员变量)
		Class c1 = Fool.class;
		// 第二种表达方式 ,已知该类的对象 ,通过getClass方法
		Class c2 = fool1.getClass();

		// c1 c2 表示了Fool类的类类型(class Type) 一个类只能是Class类的一个实例对象
		System.out.println(c1 == c2);
		// 第三种表达方式
		Class c3 = null;
		try {
			c3 = Class.forName("org.test.reflect.Fool");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
	}
}

class Fool {
}
