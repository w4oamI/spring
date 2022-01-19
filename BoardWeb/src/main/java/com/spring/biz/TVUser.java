package com.spring.biz;

public class TVUser {
	public static void main(String[] args) {
//	SamsungTV tv = new SamsungTV();
//	tv.powerOn();
//	tv.volumeUp();
//	tv.volumeDown();
//	tv.powerOff();
		
//	TV tv = new LgTV();
//	tv.powerOn();
//	tv.volumeUp();
//	tv.volumeDown();
//	tv.powerOff();	
//	}
		
	BeanFactory factory = new BeanFactory();
	TV tv = (TV)factory.getBean(args[0]);
	tv.powerOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.powerOff();
	}
}