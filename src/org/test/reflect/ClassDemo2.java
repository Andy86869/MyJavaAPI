package org.test.reflect;

/**
 * @author Andy Java 动态加载类 Class.forName("类的全称") 编译时刻加载类是静态加载类,运行时刻加载类是动态加载类
 */
public class ClassDemo2 {

	public static void main(String[] args) {

		try {
			// 动态加载类,在运行时加载
			Class c1 = Class.forName(args[0]);
			// 通过类类型创建对象
			OfficeAble oa = (OfficeAble) c1.newInstance();
			oa.start();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
