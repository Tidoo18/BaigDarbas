package CottageApp;

import java.util.Calendar;
import java.util.TimeZone;
import CottageApp.Order;

public class Invoice extends Customer {

	private int Invoice_Id;
	private String Invoice_title;
	private String Invoice_dateTime;

	public int getInvoice_Id() {
		return Invoice_Id;
	}

	public void setInvoice_Id(int invoice_Id) {
		Invoice_Id = invoice_Id;
	}

	public String getInvoice_title() {
		return Invoice_title;
	}

	public void setInvoice_title(String invoice_title) {
		Invoice_title = invoice_title;
		invoice_title = "Incoice for services";
	}

	public String getInvoice_dateTime() {
		return Invoice_dateTime;
	}

	public void setInvoice_dateTime(String invoice_dateTime) {
		Invoice_dateTime = invoice_dateTime;
		TimeZone.getTimeZone("GMT+2:00");
		System.out.println(Calendar.getInstance());
	}

	public Invoice(String Customer_name, Integer Total) {
		Customer Customer = new Customer();
		Order total = new Order();
	}
}