package com.spring.biz;

//뼈대 코드 
//public class LgTV {
//	public void turnOn() {
//		System.out.println("LgTV--전원 켠다. ");
//	}
//	public void turnOff() {
//		System.out.println("LgTV--전원 끈다. ");
//	}
//	public void soundUp() {
//		System.out.println("LgTV--소리 올린다. ");
//	}
//	public void soundDown() {
//		System.out.println("LgTV--소리 내린다. ");
//	}
//}

//다형성을 추가한 코드 
public class LgTV implements TV {
	public void powerOn() {
		System.out.println("LgTV--전원 켠다. ");
	}
	public void powerOff() {
		System.out.println("LgTV--전원 끈다. ");
	}
	public void volumeUp() {
		System.out.println("LgTV--소리 올린다. ");
	}
	public void volumeDown() {
		System.out.println("LgTV--소리 내린다. ");
	}
}