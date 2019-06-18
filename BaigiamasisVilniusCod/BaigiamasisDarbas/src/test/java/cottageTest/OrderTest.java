package cottageTest;

import static org.junit.Assert.*;
import CottageApp.Order;
import org.junit.Test;

	public class OrderTest {

		@Test
		public void orderAdd() {
			Order test = new Order();
			test.orderAdd();
		}
		
		@Test
		public void priceTest() {
			Order test = new Order();
			if (test.getDays() == 5)
			test.getPrice();
			System.out.println(test.getPrice());
		}
		
		@Test
		public void totalTest() {
			Order test = new Order();
			test.setDays(5);
			test.setPrice(50);
			test.setQuantity(1);
			System.out.println(test.getTotal());
		}
}
