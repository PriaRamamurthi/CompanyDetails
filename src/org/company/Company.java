package org.company;

import org.client.Client;

public class Company extends Client {
	private void companyName() {
		System.out.println("Company name is:M@D");

	}
	public static void main(String[] args) {
		Company c=new Company();
		c.companyName();
		c.clientName();
	}

}
