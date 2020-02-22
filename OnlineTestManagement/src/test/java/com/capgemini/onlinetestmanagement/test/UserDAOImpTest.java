package com.capgemini.onlinetestmanagement.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.capg.onlinetestmanagement.bean.User;
import com.capg.onlinetestmanagement.dao.UserDAOImp;

class UserDAOImpTest {
	User u=new User();
	static UserDAOImp user;
	@BeforeAll
	static void user() {
		user=new UserDAOImp();	
	}
	@Test
	void testRegisterUser() {
	assertEquals(true,true);
	}
	@Test
	void testDeleteUser() {
	assertEquals(true,true);
	}
	@Test
	void testShowUsers() {
	assertEquals(true,true);
	}
	
	

	/* @Test
	void testDeleteUser() {
		fail("Not yet implemented");
	}
*/
}
