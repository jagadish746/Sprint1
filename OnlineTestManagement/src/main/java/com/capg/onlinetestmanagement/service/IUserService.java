package com.capg.onlinetestmanagement.service;

import com.capg.onlinetestmanagement.bean.User;

public interface IUserService {

	boolean registerUser(User u);

	boolean deleteUser(long l);

	void showUsers();

}
