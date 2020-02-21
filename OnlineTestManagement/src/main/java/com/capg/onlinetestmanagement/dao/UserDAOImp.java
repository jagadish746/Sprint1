package com.capg.onlinetestmanagement.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.capg.onlinetestmanagement.bean.User;

public class UserDAOImp implements IUserDAO {
	public Map<Long, User> map = new HashMap<Long, User>();
	boolean flag = false;

	public boolean registerUser(User user) {

		map.put(user.getUserId(), user);

		System.out.println(map);

		flag = true;

		return flag;
	}

	public boolean deleteUser(long key) {
		boolean flag = false;
		Set<Long> set = map.keySet();
		System.out.println("Before deletion :");
		System.out.println(map);
		User str = map.remove(key);
		if (str != null) {
			flag = true;
			System.out.println("After Deletion");
			System.out.println(map);
		}

		return flag;
	}

	public void showUsers() {
		Set<Long> set = map.keySet();
		System.out.println("Registered Users ");

		System.out.println(map);
	}

}