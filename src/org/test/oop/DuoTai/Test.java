package org.test.oop.DuoTai;

/**
 * @author Andy
 * 测试类
 * 多态 : 对象的多种形态,分为引用多态和方法多态
 * 		引用多态:父类的引用可以指向本类的对象,父类的引用可以指向子类的对象;
 * 		方法多态:如果创建的是本类对象,调用的方式是本类的方法;如果创建的是子类的对象,调用的是子类重写的方法或者继承父类的方法.
 */
public class Test {
	public static void main(String[] args) {
		//引用多态
		Animal obj1 = new Animal();//父类的引用指向本类对象
		Animal obj2 = new Dog();// 父类的引用指向子类对象
		Animal obj3 = new Cat();
		obj1.eat(); //本类调用本类的方法
		obj2.eat(); //子类调用子类的重写方法
		obj3.eat(); // 子类调用继承的方法
	}
}
