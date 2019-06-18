package cottageTest;

import static org.junit.Assert.*;
import CottageApp.Customer;
import org.junit.Test;

public class CustomerTest{

	@Test
	public void customerReaderTest() {
		Customer test = new Customer();
		test.customerReader();
	}
	
	//	Nebera methodo
	public void customerIdGenerator() {
		Customer test = new Customer();
		test.getCustomer_id();
	}

}
