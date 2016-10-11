package org.test.initClass;

/**
 * @author Andy
 * 类初始化理解
 * 
 * java 普通类的初始化过程 : 静态成员变量和static块->普通成员变量->构造函数
 * java 继承类的初始化过程: 父类静态成员变量和static->子类静态成员变量及static块执行->父类普通成员初始化->父类构造函数->子类普通成员初始化
 * ->子类构造函数
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Test a = new Test();
	}
	
}
	class Sample{
		Sample(String s){
			System.out.println(s);
		}
		Sample()
		{
			System.out.println("Sample默认构造函数被调用");
		}
	}
	/**
	 * 
	 * @author Andy
	 *
	 */
	class Test{
		static Sample sam = new Sample("静态成员sam 初始化");
		Sample sam1 = new Sample("sam1成员初始化");
		static{
			System.out.println("static块执行 ");
			if (sam==null) {
				System.out.println("sam is null");
			}
			sam = new Sample("静态快内初始化sam成员变量");
		}
		Test(){
			System.out.println("Test 默认构造函数被调用");
		}
	}
	
