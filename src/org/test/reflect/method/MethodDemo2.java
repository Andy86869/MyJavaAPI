package org.test.reflect.method;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author Andy
 * 通过反射来理解集合的泛型是怎么回事
 *
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("hello");
//		list2.add(100); //是错误的,泛型就是为了防止错误类型信息
		Class c1 = list1.getClass();
		Class c2 = list2.getClass();
		System.out.println(c1==c2);
		// 反射的操作都是在编译之后的操作,即运行时刻
		/**
		 * c1==c2结果返回true 说明编译之后的集合是去泛型化的
		 * java 中集合的泛型,是防止错误输入数据的,只在编译时有效
		 * 验证 :通过方法的反射来操作,绕过编译
		 */
		try {
			Method m = c2.getMethod("add", Object.class);
			m.invoke(list2, 100); //绕过编译就绕过了泛型
			System.out.println(list2.size());
			System.out.println(list2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
