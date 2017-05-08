package com.yida.wx.count.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yida.wx.count.bean.User;
import com.yida.wx.count.dao.UserMapper;
import com.yida.wx.count.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public void inserUser(User user) {
		this.userDao.insert(user);
		
	}

}
