package com.spring.biz;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker () {
		System.out.println("AppleSpeaker객체 생성");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker소리 내린다.");
	}
}
