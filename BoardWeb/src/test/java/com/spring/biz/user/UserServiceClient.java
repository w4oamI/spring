package com.spring.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springex.biz.board.BoardService;
import com.springex.biz.board.BoardVO;
import com.springex.biz.user.UserService;
import com.springex.biz.user.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		
		vo.setId("hello");
		vo.setPassword("hello123");
		
		UserVO user = userService.getUser(vo);
		if(user!=null) {
			System.out.println(user.getName()+"로그인 하셨습니다.");
		}
		else {
			System.out.println("아이디가 아닙니다.");
		}
		container.close();
	}

}
