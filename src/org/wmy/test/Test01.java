package org.wmy.test;

/**
 * 静态变量、静态代码块、普通变量、普通代码块、构造函数的执行顺序是
 * 		1.静态变量初始化（类加载时执行）
 * 		2.静态代码块初始化（类加载时执行）
 * 			1、2执行的顺序跟谁在前有关系，谁在前谁先执行
 * 		3.普通变量初始化（每次new 对象时都会执行）
 * 		4.普通代码块初始化（每次new 对象时都会执行）
 * 			3、4执行的顺序跟谁在前有关系，谁在前谁先执行
 * 		5.构造函数初始化（每次new 对象时都会执行）
 * 			最后执行的
 * 	
 * 	当对象有父类时它们的执行顺序如下：
 * 	1.父类的静态变量、静态代码块执行
 * 	2.子类的静态变量、静态代码块执行
 * 		1、2、只会执行一次
 * 	3.父类的普通变量、普通代码块执行
 * 	4.父类的构造函数执行
 * 	5.子类的普通变量、普通代码块执行
 * 	6.子类的构造函数执行
 *	
 */
public class Test01{
	public static void main(String[] args) {
		A a=new B();
		new B();
	}
}

 class A {
	static{
		System.out.println("1");
	}
	static int i=1;
	{
		System.out.println("2");
	}
	public A(){
		System.out.println("3");
	}
	int j=0;
}

class B extends A{
	static{
		System.out.println("a");
	}
	{
		System.out.println("b");
	}
	public B(){
		System.out.println("c");
	}
}