package com.tyss.app.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.app.bean.ContractorBean;
import com.tyss.app.bean.CustomerBean;
import com.tyss.app.bean.ProductBean;
import com.tyss.app.factory.ContractorFactory;
import com.tyss.app.factory.Customerfactory;
import com.tyss.app.factory.ProductFactory;
import com.tyss.app.services.ContractorService;
import com.tyss.app.services.CustomerSerivces;
import com.tyss.app.services.ProductService;

public class App {
	public static void main(String[] args) {
		CustomerSerivces customerserivces = Customerfactory.instanceofCustomerSerivces();
		ProductService productservice = ProductFactory.instanceOfProductService();
		ContractorService contractorservice = ContractorFactory.intaceOfContractorService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.select one for customer:");
			System.out.println("2.select two for product:");
			System.out.println("3.select three for contractor:");
			System.out.println("enter the choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				while (true) {
					System.out.println("press 1 to insert Customer");
					System.out.println("press 2 to upadte Customer");
					System.out.println("press 3 to delete Customer");
					System.out.println("press 4 to display all the customer");
					System.out.println("enter your choice:");
					int customerchoice = sc.nextInt();
					switch (customerchoice) {
					case 1:
						CustomerBean cust;
						cust = new CustomerBean();
						System.out.println("enter the customer id:");
						cust.setCustomerId(sc.nextInt());
						System.out.println("enter the customer name:");
						cust.setCustomerName(sc.next());
						System.out.println("enter Street address1:");
						cust.setStreetAddress1(sc.next());
						System.out.println("enter street address2:");
						cust.setStreetAddress2(sc.next());

						System.out.println("enter the postal code:");
						cust.setPostalcode(sc.nextInt());

						System.out.println("enter the email:");
						cust.setEmail(sc.next());

						System.out.println("enter the telephone no:");
						cust.setTelephoneno(sc.nextInt());

						if (customerserivces.InsertCustomer(cust)) {
							System.out.println("inserted");
						} else {
							System.err.println("something went wrong");
						}

						break;

					case 2:
						cust = new CustomerBean();
						System.out.println("enter customer userid:");
						cust.setCustomerId(sc.nextInt());
						System.out.println("enter the email:");
						cust.setEmail(sc.next());
						if (customerserivces.upadteCustomer(cust.getCustomerId(), cust.getEmail())) {
							System.out.println("upadted");
						} else {
							System.out.println("something went wrong");
						}
						break;
					case 3:
						cust = new CustomerBean();
						System.out.println("enter user id:");
						cust.setCustomerId(sc.nextInt());

						if (customerserivces.deleteCustomer(cust.getCustomerId())) {
							System.out.println("deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;
					case 4:
						List<CustomerBean> list = customerserivces.getAllCustomer();
						if (list != null) {
							for (CustomerBean c1 : list) {

								System.out.println(c1);
							}
						} else {
							 System.out.println("List is empty");
						}
						break;
					default:
						
					}
				}

			case 2:

				while (true) {
					System.out.println("Press 1 to Insert product");
					System.out.println("Press 2 to Update product");
					System.out.println("Press 3 to Delete product");
					System.out.println("Press 4 to display all the Product");
					System.out.println("Enter your Choice:");
					int Productchoice = sc.nextInt();
					switch (Productchoice) {
					case 1:
						ProductBean product;
						product = new ProductBean();
						System.out.println("Enter the Product id:");
						product.setProductId(sc.nextInt());
						System.out.println("Enter the Product Name:");
						product.setProductName(sc.next());
						System.out.println("Enter the Product Price:");
						product.setProductPrice(sc.nextDouble());
						if (productservice.insertProduct(product)) {
							System.out.println("Inserted");
						} else {
							System.err.println("something went wrong");
						}
						break;

					case 2:
						product = new ProductBean();
						System.out.println("enter product pid:");
						product.setProductId(sc.nextInt());
						System.out.println("enter the product pname:");
						product.setProductName(sc.next());
						if (productservice.updateProduct(product.getProductId(), product.getProductPrice())) {
							System.out.println("Updated");
						} else {
							System.out.println("something went wrong");
						}
						break;
					case 3:
						product = new ProductBean();
						System.out.println("enter product id:");
						product.setProductId(sc.nextInt());
						if (productservice.deleteproduct(product.getProductId())) {
							System.out.println("Deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;
					case 4:
						List<ProductBean> list = productservice.getAllProduct();
						if (list != null) {
							for (ProductBean productBean : list) {

							}
						} else {
							System.out.println("List is empty");
						}
						break;
					default:

					}
				}

			case 3:
				while (true) {
					System.out.println("Press 1 to Insert Contractor ");
					System.out.println("Press 2 to Delete Contractor");
					System.out.println("Press 4 to Display all the Contractor");
					System.out.println("Enter your choice:");
					int contractchoice = sc.nextInt();
					switch (contractchoice) {
					case 1:
						ContractorBean contractorbean;
						contractorbean = new ContractorBean();
						System.out.println("Enter the  contract no:");
						contractorbean.setContractno(sc.nextInt());
						System.out.println("Enter the customerId:");
						contractorbean.setCustomerId(sc.nextInt());
						System.out.println("Enter the product id:");
						contractorbean.setProductId(sc.nextInt());
						System.out.println("Enter the hauier id:");
						contractorbean.setHaulierId(sc.nextInt());
						if (contractorservice.insertContractor(contractorbean)) {
							System.out.println("Inserted");
						} else {
							System.err.println("something went wrong");
						}
						break;

					case 2:
						contractorbean = new ContractorBean();
						System.out.println("enter product id:");
						contractorbean.setProductId(sc.nextInt());
						if (contractorservice.deleteContractor(contractorbean.getContractno())) {
							System.out.println("deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;

					case 3:
						List<ContractorBean> list = contractorservice.getAllContractor();
						if (list != null) {
							for ( ContractorBean contractorbean1 : list) {
                             
							}
						} else {
							System.out.println("List is empty");
						}
						break;

					default:
					}
			}
			
		       
		
			
				
				
				
				
					
					
					
				}///end the main switch case.
		}//end the main while loop.
	
}//end the main method.
}//end the class.
