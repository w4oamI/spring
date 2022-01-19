package com.spring.biz;

//뼈대 코드 
//public class SamsungTV {
//	public void powerOn() {
//		System.out.println("SamsungTV--전원 켠다. ");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV--전원 끈다. ");
//	}
//	public void volumeUp() {
//		System.out.println("SamsungTV--소리 올린다. ");
//	}
//	public void volumeDown() {
//		System.out.println("SamsungTV--소리 내린다. ");
//	}
//}

//다형성을 추가한 코드 
public class SamsungTV implements TV{	
	public SamsungTV() {
		System.out.println("SamsungTV 객체를 생성합니다.");
	}
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다. ");
	}
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다. ");
	}
	public void volumeUp() {
		System.out.println("SamsungTV--소리 올린다. ");
	}
	public void volumeDown() {
		System.out.println("SamsungTV--소리 내린다. ");
	}
}