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
import com.tyss.forestry.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{
	
	FileReader reader;
	Properties prop;
	ProductBean product;

	public ProductDAOImpl() {
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
	public List<ProductBean> getAllProduct() {
		
		List<ProductBean> productList = new ArrayList<ProductBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getAllProduct"));) {
			while (rs.next()) {
				product = new ProductBean();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductPrice(rs.getDouble(3));
		
				productList.add(product);		
			}
			return  productList;	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	      return null;
	    }

	@Override
	public boolean insertProduct(ProductBean product) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("InsertProductQuery"));) {
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getProductPrice());
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
	public boolean deleteproduct(int productId) {
		
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("DeleteProductQuery"));) {
			pstmt.setInt(1, productId);

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
	public boolean updateProduct(int productId, double productPrice) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("UpdateProductQuery"));) {
			pstmt.setInt(2, productId);	
			pstmt.setDouble(1,productPrice);

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
