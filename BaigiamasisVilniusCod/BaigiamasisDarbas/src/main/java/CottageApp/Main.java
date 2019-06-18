package CottageApp;

import java.io.IOException;
import java.util.Scanner;

import CottageApp.Customer;
import cottageAppDatabase.CustomerDeleteFromDatabase;
import cottageAppDatabase.CustomerDetabase;
import cottageAppDatabase.DeleteOrderFromDatabase;
import cottageAppDatabase.OrderDateBase;

public class Main {

	private static boolean MainMenu = true;
	private static boolean SubMenu = true;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, and thanks for visiting CottegesOnTheBeach!");
		System.out.println("---------------------------------------------------");
		System.out.println("Please choose what would you like to do");
		System.out.println("---------------------------------------------------");
		while (MainMenu) {
			while (SubMenu) {
				System.out.println("A: Insert New Customer into Database");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("B: Delete Customer From Database.");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("C: Input Order Into Database");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("D: Delete Order From Database");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("E: Generate Payment Invoice");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("F: Get Total income");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("G: View All Customer");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("H: View All Order");
				String choseAnswer = sc.next();
				choseAnswer = choseAnswer.toUpperCase();
				switch (choseAnswer) {
				case "A":
					insertNewCustomer();
					break;
				case "B":
					deleteCustomer();
					break;
				case "C":
					imputOrder();
					break;
				case "D":
					deleteOrder();
					break;
				case "E":
					generatePaymentInvoice();
					break;
				case "F":
					getTotalIncome();
					break;
				case "G":
					viewAllCustomer();
					break;
				case "H":
					viewAllOrders();
					break;
				default:
					System.out.println("Error, Please choose again");
					break;
				}
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				if (sc.nextInt() == 1) {
					SubMenu = true;
				} else {
					SubMenu = false;
				}
			}
			SubMenu = true;
			System.out
					.println("---------------------------------------------------------------------------------------");
			System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
			System.out
					.println("---------------------------------------------------------------------------------------");
			if (sc.nextInt() == 1) {
				MainMenu = true;
			} else {
				System.out.println("System Closed");
				System.exit(0);
			}
		}

		sc.close();
	}

	private static void insertNewCustomer() {
		Customer customer = new Customer();
		customer.customerReader();

		CustomerDetabase Customer = new CustomerDetabase();
		Customer.insert(customer.getCustomer_name(), customer.getCustomer_email(), customer.getCustomer_phoneNumber(),
				customer.getCustomer_address());
		System.out.println("Insert done");

	}

	private static void deleteCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input CustomerId which you would like to delete");
		int CustomerId = sc.nextInt();
		CustomerDeleteFromDatabase delete = new CustomerDeleteFromDatabase();
		delete.delete(CustomerId);
		System.out.println("Delete done.");

	}

	private static void imputOrder() {
		Order orderInput = new Order();
		orderInput.orderAdd();
		OrderDateBase Order = new OrderDateBase();
		Order.insert(orderInput.getPrice(), orderInput.getQuantity(), orderInput.getDays(), orderInput.getTotal(),
				orderInput.getArrivingDate(), orderInput.getLeavingDate());
		System.out.println("Insert done");

	}

	private static void deleteOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input OrderId which you would like to delete");
		int OrderId = sc.nextInt();
		DeleteOrderFromDatabase delete = new DeleteOrderFromDatabase();
		delete.delete(OrderId);
		System.out.println("Delete done.");

	}

	private static void generatePaymentInvoice() {
		// TODO Auto-generated method stub

	}

	private static void getTotalIncome() {
		OrderDateBase viewAllTotal = new OrderDateBase();
		viewAllTotal.selectTotal();
		System.out.println();
		System.out.println("End of Total List");

	}

	private static void viewAllCustomer() {
		CustomerDetabase all = new CustomerDetabase();
		all.selectAll();
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("End of Customers List");

	}

	private static void viewAllOrders() {
		OrderDateBase all = new OrderDateBase();
		all.selectAll();
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("End of Order List");

	}
}
