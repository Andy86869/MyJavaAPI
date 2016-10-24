package org.test.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Andy
 *
 */
public class MethodDemo1 {

	public static void main(String[] args) {
		/**
		 * 获取print 方法 ,但是有俩个,通过参数列表来区别 要获取一个方法,就必须获取到类的类类型
		 */
		A a1 = new A();
		Class c = a1.getClass();
		/*
		 * 获取方法,通过名称和参数列表来决定 getMethod获取的是public的方法 getDeclaredMethod获取自己申明的方法
		 */
		try {
			Method m = c.getMethod("print", new Class[] { int.class, int.class });
			
			
			//方法的反射操作 用M对象进行方法的调用
			//a1.print(10, 20);
			Object o = m.invoke(a1, new Object[]{10,20});
			System.out.println("=======");
			Method m1 = c.getMethod("print", String.class,String.class);
//			a1.print("hello", "WORLD");
			o = m1.invoke(a1, "hello","WORLD");
		} catch (NoSuchMethodException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

class A {
	public void print(int a, int b) {
		System.out.println(a + b);
	}

	public void print(String a, String b) {
		System.out.println(a.toUpperCase() + "," + b.toLowerCase());
	}
}
