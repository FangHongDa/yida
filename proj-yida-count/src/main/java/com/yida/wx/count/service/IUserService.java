package com.yida.wx.count.service;

import com.yida.wx.count.bean.User;

public interface IUserService {
	public User getUserById(int userId);
	public void inserUser(User user);
}
