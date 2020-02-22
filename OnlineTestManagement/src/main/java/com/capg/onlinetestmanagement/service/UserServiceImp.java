package com.capg.onlinetestmanagement.service;

import com.capg.onlinetestmanagement.bean.User;
import com.capg.onlinetestmanagement.dao.UserDAOImp;

public class UserServiceImp implements IUserService {
	UserDAOImp dao = new UserDAOImp();

	public boolean registerUser(User user) {

		return dao.registerUser(user);
	}

	public boolean deleteUser(long delete) {

		return dao.deleteUser(delete);
	}

	public void showUsers() {

		dao.showUsers();
	}

	public static boolean isValiduserId(Long userId) {
		boolean flag = false;
		if (userId != 0) {
			flag = true;
		}

		if (flag == false) {
			try {
				throw new Exception("invalid userId");
			} catch (Exception e) {
				System.err.println(e);
				System.out.println("Please enter valid userId");

			}
		}

		return flag;
	}

	public static boolean isValiduserName(String userName) {
		boolean flag = false;
		String str=userName.toString();
		if (str.matches("[A-Z][a-z]{2,}")) {
			flag = true;
		}
		if (flag == false) {
			try {
				throw new Exception("invalid username");
			} catch (Exception e) {
				System.err.println(e);
				System.out.println("Please enter valid username");
			}
		}

		return flag;

	}

	public static boolean isValidphoneNumber(Long phoneNumber) {
		boolean flag = false;
		String str = phoneNumber.toString();
		if (str.matches("[6-9][0-9]{9}") && str.length() == 10) {
			flag = true;
		}

		if (flag == false) {
			try {
				throw new Exception("invalid phoneNumber");
			} catch (Exception e) {

				System.err.println(e);
				System.out.println("Please enter valid phone number");

			}
		}

		return flag;

	}

	public static boolean isValiduserPassword(String password)
    {
            boolean valid = true;
            if (password.length() < 8)
            {
                    valid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                    valid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars ))
            {
                    valid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                    valid = false;
            }
            String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            if (!password.matches(specialChars ))
            {
                    valid = false;
            }
            if (valid)
            {
                    valid = true;
            }
            return valid;
    }


	public static boolean uservalidation(User u) {
		boolean flag = false;
		if (isValiduserId(u.getUserId()) && isValiduserName(u.getUserName()) && isValiduserPassword(u.getPassword())
				&& isValidphoneNumber(u.getPhoneNumber())) {
			flag = true;

		}

		return flag;

	}

}
