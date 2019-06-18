package databaseTest;

import org.junit.Test;

import cottageAppDatabase.CustomerDetabase;

import static org.junit.Assert.*;

import java.sql.Connection;

public class CustomerDatabaseTest {

	@Test
	public void ConnectionTest() {
		CustomerDetabase test = new CustomerDetabase();
		test.insert("a", "aa", "aaa", "aaaa");
		test = new CustomerDetabase();
		Connection connection = CustomerDetabase.connect();
		assertEquals(connection != null, true);

	}

	@Test
	public void insertTest() {
		CustomerDetabase test = new CustomerDetabase();
		test.insert("name", "email", "phoneNumber", "address");

	}
}
