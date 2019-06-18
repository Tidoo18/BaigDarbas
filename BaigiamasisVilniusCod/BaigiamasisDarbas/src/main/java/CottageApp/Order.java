package CottageApp;

import java.util.Scanner;

//public class Order extends Customer {
public class Order {

	int Order_id;
	int price;
	int quantity;
	int days;
	int total;
	String arrivingDate;
	String leavingDate;

	public int getTotal() {
		total = (getPrice() * getDays()) * getQuantity();
		return total;
	}

	public int setTotal(int total) {
//		total = (getPrice() * getDays()) * getQuantity();
//		total = setTotal(total);
		this.total = total;
		return this.total;
	}

	public String getArrivingDate() {
		return arrivingDate;
	}

	public void setArrivingDate(String arrivingDate) {
		this.arrivingDate = arrivingDate;
	}

	public String getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(String leavingDate) {
		this.leavingDate = leavingDate;
	}

	public int getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}

	public int getPrice() {
		if (getDays() > 7) {
			setPrice(50);
		} else {
			setPrice(70);
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void orderAdd() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Customer Arrival Date \nExample 2019-05-15");
		String arrivingDate = sc.nextLine();
		setArrivingDate(arrivingDate);

		System.out.println("Customer Departure Date \nExample 2019-05-16");
		String leaving = sc.nextLine();
		setLeavingDate(leaving);

		System.out.println("How many cottages will Customer book?");
		Integer quantity = sc.nextInt();
		setQuantity(quantity);

		System.out.println("How many days will Customers stay?");
		Integer days = sc.nextInt();
		setDays(days);

		System.out.println("ArrivalDate: " + getArrivingDate() + "\nLeavingDate: " + getLeavingDate() + "\nQuantity: "
				+ getQuantity() + "\nDays: " + getDays() + "\nTotal: " + getTotal());
	}
}