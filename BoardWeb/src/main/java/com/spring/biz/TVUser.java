package com.spring.biz;

public class TVUser {
	public static void main(String[] args) {
//	SamsungTV tv = new SamsungTV();
//	tv.powerOn();
//	tv.volumeUp();
//	tv.volumeDown();
//	tv.powerOff();
		
	TV tv = new LgTV();
	tv.powerOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.powerOff();	
	}
}