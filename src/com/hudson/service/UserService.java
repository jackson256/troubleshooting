package com.hudson.service;

import com.hudson.bean.User;

public interface UserService {
	
	User login(String loginname,String password);

}
