package com.tyss.phoneapplication.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.phoneapplication.bean.ContactBean;
import com.tyss.phoneapplication.factory.ContactFactory;
import com.tyss.phoneapplication.services.ContactServices;

public class AllListContact {
	public static void main(String[] args) {
		
		ContactServices contactserivces = ContactFactory.instanceOfContactServices();
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.select one for conatct :");
			System.out.println("2.select two for number:");
//		System.out.println("3.select three for group:");
			System.out.println("enter the choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				while (true) {
					System.out.println("press 1 to insert contact");
					System.out.println("press 2 to upadte contact");
					System.out.println("press 3 to delete contact");
					System.out.println("press 4 to display all the contact");
					System.out.println("enter your choice:");
					int customerchoice = sc.nextInt();
					switch (customerchoice) {
					case 1:
						ContactBean cust;
						cust = new ContactBean();
						System.out.println("enter the contact Name:");
						cust.setName(sc.next());
						System.out.println("enter the contact no:");
						cust.setcont_no(sc.nextInt());
						System.out.println("enter the contact email");
						cust.setCont_email(sc.next());
						

						if (contactserivces.insertContact(cust)) {
							System.out.println("inserted");
						} else {
							System.err.println("something went wrong");
						}

						break;

					case 2:
						cust = new ContactBean();
						System.out.println("enter contact number:");
						cust.setcont_no(sc.nextInt());
						System.out.println("enter the contact email:");
						cust.setCont_email(sc.next());
						if (contactserivces.upadteContact(cust.getcont_no(), cust.getCont_email())) {
							System.out.println("upadted");
						} else {
							System.out.println("something went wrong");
						}
						break;
					case 3:
						cust = new ContactBean();
						System.out.println("enter the contact number:");
						cust.setcont_no(sc.nextInt());

						if (contactserivces.deleteContact(cust.getcont_no())) {
							System.out.println("deleted");
						} else {
							System.err.println("something went wrong");
						}
						break;
					case 4:
						List<ContactBean>list = contactserivces.getAllContact();
						if (list != null) {
							for (ContactBean c1 : list) {

								System.out.println(c1);
							}
						} else {
							System.out.println("List is empty");
						}
						break;
					default:
					}
				}
		
	
		}
		}
	}
}// end of main method

  //end of class
