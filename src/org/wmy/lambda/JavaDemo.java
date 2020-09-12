package org.wmy.lambda;

public class JavaDemo {

	public static void main(String[] args) {
		IMessage msg=(str)->{
			System.out.println("发送消息："+str);
		};
		msg.send("王明洋");
		System.out.println("test git in sts");
	}

}


/**
 * @author Administrator
 * @FunctionalInterface：表示函数式接口，里面只允许定义一个抽象方法。
 */
@FunctionalInterface
interface IMessage{
	public void send(String str);
}