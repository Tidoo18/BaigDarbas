package CottageApp;

import java.util.Scanner;

public class Customer {

	// Customer info
	private int Customer_id;
	private String Customer_name;
	private String Customer_email;
	private String Customer_phoneNumber;
	private String Customer_address;

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(int customer_id) {

	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	public String getCustomer_email() {
		return Customer_email;
	}

	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}

	public String getCustomer_phoneNumber() {
		return Customer_phoneNumber;
	}

	public void setCustomer_phoneNumber(String customer_phoneNumber) {
		Customer_phoneNumber = customer_phoneNumber;
	}

	public String getCustomer_address() {
		return Customer_address;
	}

	public void setCustomer_address(String customer_address) {
		Customer_address = customer_address;
	}

	public void CustomerInfo(int customer_id, String customer_name, String customer_email, String customer_phoneNumber,
			String customer_address) {
		this.Customer_id = customer_id;
		this.Customer_name = customer_name;
		this.Customer_email = customer_email;
		this.Customer_phoneNumber = customer_phoneNumber;
		this.Customer_address = customer_address;
	}

	public void customerReader() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input following.\n Customers Name");
		String customer_name = sc.nextLine();
		setCustomer_name(customer_name);

		System.out.println("Customers Email");
		String customer_email = sc.nextLine();
		setCustomer_email(customer_email);

		System.out.println("Customers Phone Number");
		String customer_phoneNumber = sc.nextLine();
		setCustomer_phoneNumber(customer_phoneNumber);

		System.out.println("Customers Adress");
		String customer_address = sc.nextLine();
		setCustomer_address(customer_address);
	}
}