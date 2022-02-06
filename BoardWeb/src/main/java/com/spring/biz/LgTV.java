package com.spring.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	public LgTV() {
		System.out.println("LG객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV--전원 켠다. ");
	}
	public void powerOff() {
		System.out.println("LgTV--전원 끈다. ");
	}
//	public void volumeUp() {
//		System.out.println("LgTV--소리 올린다. ");
//	}
//	public void volumeDown() {
//		System.out.println("LgTV--소리 내린다. ");
//	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}