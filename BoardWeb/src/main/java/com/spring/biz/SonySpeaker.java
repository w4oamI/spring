package com.spring.biz;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("SonySpeaker 객체 생성");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker소리 올린다. ");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker소리 내린다. ");
	}
}
