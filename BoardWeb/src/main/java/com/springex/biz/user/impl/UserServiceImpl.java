package com.springex.biz.user.impl;

import com.springex.biz.user.UserService;
import com.springex.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
