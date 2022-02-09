package com.spring.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
@Component("tv")
public class SamsungTV implements TV{	
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체를 생성합니다.");
	}
	//생성자 추가 
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV(2)객체생성 ");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV(3)객체생성 ");
		this.speaker = speaker;
		this.price = price;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker=speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다. ");
		System.out.println("요즘이 추가 되었습니다. 총 가격:" + price);
	}
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다. ");
	}
//	public void volumeUp() {
//		speaker = new SonySpeaker();
//		System.out.println("SamsungTV--소리 올린다. ");
//	}
//	public void volumeDown() {
//		speaker = new SonySpeaker();
//		System.out.println("SamsungTV--소리 내린다. ");
//	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}