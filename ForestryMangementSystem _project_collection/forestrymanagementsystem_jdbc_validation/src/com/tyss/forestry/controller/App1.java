package com.tyss.forestry.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestry.bean.ContractorBean;
import com.tyss.forestry.bean.CustomerBean;
import com.tyss.forestry.bean.LandBean;
import com.tyss.forestry.bean.ProductBean;
import com.tyss.forestry.factory.ContractorFactory;
import com.tyss.forestry.factory.CustomerFactory;
import com.tyss.forestry.factory.LandFactory;
import com.tyss.forestry.factory.ProductFactory;
import com.tyss.forestry.services.ContractorService;
import com.tyss.forestry.services.CustomerService;
import com.tyss.forestry.services.LandService;
import com.tyss.forestry.services.ProductService;

public class App1 {
	public static void main(String[] args) {
		CustomerService customerserivce = CustomerFactory.instanceOfCustomerService();
		ProductService productservice = ProductFactory.instanceOfProductService();
		ContractorService contractorservice = ContractorFactory.intaceOfContractorService();
		LandService  landservice = LandFactory.instanceOfLandService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===Main menu===");
			System.out.println("1.Select one for customer:");
			System.out.println("2.Select two for product:");
			System.out.println("3.Select three for contractor:");
			System.out.println("4.select four for land:");
			System.out.println("Enter the choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				while (true) {
					System.out.println("press 1 to Insert Customer");
					System.out.println("press 2 to Upadte Customer");
					System.out.println("press 3 to Delete Customer");
					System.out.println("press 4 to Display all the customer");
					System.out.println("press 5 go back to main menu");
					System.out.println("Enter your choice:");
					
					int customerchoice = sc.nextInt();
					switch (customerchoice) {
					case 1:
						CustomerBean cust;
						cust = new CustomerBean();
						System.out.println("Enter the customer id:");
						cust.setCustomerId(sc.nextInt());
						System.out.println("Enter the customer name:");
						cust.setCustomerName(sc.next());
						System.out.println("Enter Street address1:");
						cust.setStreetAddress1(sc.next());
						System.out.println("Enter street address2:");
						cust.setStreetAddress2(sc.next());
						System.out.println("Enter the Town:");
						cust.setTown(sc.next());
						System.out.println("Enter the postal Code:");
						cust.setPostalCode(sc.next());
						System.out.println("Enter the Email:");
						cust.setEmail(sc.next());
						System.out.println("Enter the Telephone No:");
						cust.setTelephoneNo(sc.next());

						if (customerserivce.insertCustomer(cust)) {

							System.out.println("Inserted Successfully");

						} else {
							System.err.println("something went wrong");
						}

						break;
					case 2:
						
						System.out.println("Enter customer UserId:");
						int CustomerId = sc.nextInt();
						
						System.out.println("Enter the Email:");
						String Email=  sc.next();
						
						if (customerserivce.upadteCustomer(CustomerId,Email)) {
							System.out.println("Upadted");
						} else {
							System.out.println("something went wrong");
						}
						break;
					case 3:
						cust = new CustomerBean();
						System.out.println("Enter User Id:");
						cust.setCustomerId(sc.nextInt());

						if (customerserivce.deleteCustomer(cust.getCustomerId())) {
							System.out.println("deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;
					case 4:
						List<CustomerBean> list = customerserivce.getAllCustomer();
						if (list != null) {
							for (CustomerBean customerBean : list) {
								System.out.println(customerBean);
							}
						} else {
							System.out.println("List is Empty");
						}
						break;
						
					case 5: main(args);
					default:
					}// end of inner switch case.
				} // end of inner while

			case 2:

				while (true) {
					System.out.println("Press 1 to Insert product");
					System.out.println("Press 2 to Update product");
					System.out.println("Press 3 to Delete product");
					System.out.println("Press 4 to display all the Product");
					System.out.println("press 5 to go back to main menu");
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
						System.out.println("Enter product product  Id:");
						int productId = sc.nextInt();	
						System.out.println("Enter the product price:");
						double productPrice = sc.nextDouble();	
						if (productservice.updateProduct(productId,productPrice)) {
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
								System.out.println(productBean);
							}
						} else {
							System.out.println("List is empty");
						}
						break;
						
					case  5: main(args);
					
					default:

					}
				}

			case 3:
				while (true) {
					System.out.println("Press 1 to Insert Contractor ");
					System.out.println("Press 2 to Delete Contractor");
					System.out.println("Press 3 to Display all the Contractor");
					System.out.println("press 4 to go back to main menu");
					System.out.println("Enter your choice:");
					int contractchoice = sc.nextInt();
					switch (contractchoice) {
					case 1:
						ContractorBean contractor;
						contractor = new ContractorBean();
						System.out.println("Enter the  contract no:");
						contractor.setContractno(sc.nextInt());
						System.out.println("Enter the customerId:");
						contractor.setCustomerId(sc.nextInt());
						System.out.println("Enter the product id:");
						contractor.setProductId(sc.nextInt());
						System.out.println("Enter the hauier id:");
						contractor.setHaulierId(sc.nextInt());
						if (contractorservice.insertContractor(contractor)) {
							System.out.println("Inserted");
						} else {
							System.err.println("something went wrong");
						}
						break;

					case 2:
						contractor = new ContractorBean();
						System.out.println("enter product id:");
						contractor.setProductId(sc.nextInt());
						if (contractorservice.deleteContractor(contractor.getContractno())) {
							System.out.println("deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;

					case 3:
						List<ContractorBean> list = contractorservice.getAllContractor();
						if (list != null) {
							for (ContractorBean contractorBean : list) {
								System.out.println(contractorBean);

							}
						} else {
							System.out.println("List is empty");
						}
						break;
					case 4: main(args);
					default:
					}
				}
				
			case 4:while (true) {
				System.out.println("Press 1 to  Insert land ");
				System.out.println("Press 2 to Delete land");
				System.out.println("Press 3 to Display all the land record");
				System.out.println("press 4 to go back to main menu");
				System.out.println("Enter your choice:");	
				int landchoice = sc.nextInt();
				switch (landchoice) {
				case 1:
					LandBean land;
					land = new LandBean();
					System.out.println("Enter the  land id:");
					land.setLandId(sc.nextInt());
					System.out.println("Enter the land area:");
					land.setLandArea(sc.nextInt());
					System.out.println("Enter the land cost:");
					land.setLandCost(sc.nextDouble());
					if (landservice.insertLandRecord(land)) {
						System.out.println("Inserted");
					} else {
						System.err.println("something went wrong");
					}
					break;

				case 2:
					land = new LandBean();
					System.out.println("enter land id:");
					land.setLandArea(sc.nextInt());
					if (landservice.deleteLandRecord(land.getLandId())) {
						System.out.println("deleted");
					} else {
						System.err.println("something went wrong");
					}
					break;

				case 3:
					List<LandBean> list = landservice.getAllLandRecord();
					if (list != null) {
					for (LandBean landBean : list) {
						System.out.println(landBean);	
					}
						
					} else {
						System.out.println("Land List is empty");
					}
					break;
				case 4: main(args);
				default:
				
			}
			}

			}// end of switch case

		} // end of main while loop

	}// end of main class

}// end of class
