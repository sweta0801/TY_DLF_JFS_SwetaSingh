package com.tyss.forestry.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.forestry.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {
	FileReader reader;
	Properties prop;
	CustomerBean customer;

	public CustomerDAOImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));

		} catch (Exception ae) {
			ae.printStackTrace();
		}

	}

	@Override
	public List<CustomerBean> getAllCustomer() {

		List<CustomerBean> list = new ArrayList<CustomerBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getAllCustomer"));) {
			while (rs.next()) {
				customer = new CustomerBean();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				customer.setStreetAddress1(rs.getString(3));
				customer.setStreetAddress2(rs.getString(4));
				customer.setTown(rs.getString(5));
				customer.setPostalCode(rs.getString(6));
				customer.setEmail(rs.getString(7));
				customer.setTelephoneNo(rs.getString(8));
			
				list.add(customer);
				
			}
			return  list;
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertCustomer(CustomerBean customer) {

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("InsertCustomerQuery"));) {
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setString(3, customer.getStreetAddress1());
			pstmt.setString(4, customer.getStreetAddress2());
			pstmt.setString(5, customer.getStreetAddress2());
			pstmt.setString(6, customer.getTown());
			pstmt.setString(7, customer.getPostalCode());
			pstmt.setString(8, customer.getEmail());

			int count = pstmt.executeUpdate();
			if (count > 0) {

				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("DeleteCustomerQuery"));) {
			pstmt.setInt(1, customerId);

			int count = pstmt.executeUpdate();

			if (count > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean upadteCustomer(int customerId, String email) {

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("UpdateCustomerQuery"));) {
			pstmt.setInt(2, customerId);	
			pstmt.setString(1, email);

			int count = pstmt.executeUpdate();

			if (count > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
