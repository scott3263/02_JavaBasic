package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldKo hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorldEn hello2 = new HelloWorldEn();
		callMethod(hello2);

	}
	
	private static void callMethod(HelloWorldKo hello1) {
		hello1.sayHello();
	}

	private static void callMethod(HelloWorldEn hello2) {
		hello2.sayHello();
		
	}

}
