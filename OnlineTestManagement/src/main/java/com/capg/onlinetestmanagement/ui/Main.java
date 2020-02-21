package com.capg.onlinetestmanagement.ui;

import java.util.Scanner;

import com.capg.onlinetestmanagement.bean.User;
import com.capg.onlinetestmanagement.service.UserServiceImp;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserServiceImp service = new UserServiceImp();
		while (true) {
			System.out.println("Welcome to Online Test");
			System.out.println("1.Register User");
			System.out.println("2.Delete User");
			System.out.println("3.view Users");
			System.out.println("4.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				User user = new User();
				System.out.println("Enter User id");
				long userId = scanner.nextLong();
				scanner.nextLine();
				System.out.println("Enter User name");
				String userName = scanner.nextLine();
				System.out.println("Enter 10 digit valid phonenumber");
				long phoneNumber = scanner.nextLong();
				scanner.nextLine();
				System.out.println("Enter user password");
				String userPassword = scanner.nextLine();
				user.setUserId(userId);
				user.setUserName(userName);
				user.setPassword(userPassword);
				user.setPhoneNumber(phoneNumber);
				boolean isValid = UserServiceImp.uservalidation(user);
				if (isValid) {
					service.registerUser(user);
					System.out.println("USER ACCOUNT IS SUCCESFULLY REGISTERED");
				} else {
					System.err.println("USER ACCOUNT IS FAILED TO REGISTER ");
				}
				break;
			case 2:
				System.out.println("Enter userId to remove user");
				long userId2 = scanner.nextLong();
				boolean fine = service.deleteUser(userId2);
				if (fine == true) {

					System.out.println("USER IS DELETED");
				} else {
					try {
						throw new Exception("invalid user option");
					} catch (Exception e) {
						System.err.println(e);
						System.err.println("Please enter valid option");
					}
					System.out.println("USER IS NOT DELETED");
				}
				break;

			case 3:
				service.showUsers();

				break;

			}
		}
	}
}
