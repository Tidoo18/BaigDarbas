package databaseTest;

import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import org.junit.Test;
import cottageAppDatabase.OrderDateBase;

public class OrderDatabaseTest {
	@Test
	public void ConnectionTest() {
		// OrderDateBase test = new OrderDateBase();
		OrderDateBase test = new OrderDateBase();
		Connection connection = OrderDateBase.connect();
		assertEquals(connection != null, true);
	}
}