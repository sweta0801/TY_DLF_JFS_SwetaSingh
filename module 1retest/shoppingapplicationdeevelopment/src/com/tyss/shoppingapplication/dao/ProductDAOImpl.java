package com.tyss.shoppingapplication.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.shoppingapplication.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	
	FileReader reader;
	Properties prop;
	ProductBean product;
	
	public ProductDAOImpl() 
	{
		try 
		{
			reader= new FileReader("db.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<ProductBean> showAllProduct() {
		
		List<ProductBean> list = new ArrayList<ProductBean>();		
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dburl") , 
				prop.getProperty("dbuser"), prop.getProperty("dbpassword"));
				Statement stmt= conn.createStatement();	
				ResultSet rs= stmt.executeQuery(prop.getProperty("query1"));)
		{
		while(rs.next())
		{
			product= new ProductBean();
			product.setProduct_Id(rs.getInt(1));
			product.setProduct_Name(rs.getString(2));
			product.setProduct_cost(rs.getDouble(3));
			product.setDescription(rs.getString(4));
			product.setNo_of_prroduct(rs.getInt(5));	
			list.add(product);
		}
		return list;
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean searchProduct(String Product_Name) {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dburl") , 
				prop.getProperty("dbuser"), prop.getProperty("dbpassword"));
				Statement stmt= conn.createStatement();	
				ResultSet rs= stmt.executeQuery(prop.getProperty("searchQuery"));){
		
			while(rs.next()) {
				rs.getString(2);
			}
			
	} 
		catch (Exception e)
	{
		e.printStackTrace();
		
			
		}
		return false;
	}

	@Override
	public boolean addProduct(ProductBean product) {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dburl") , 
				prop.getProperty("dbuser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt= conn.prepareStatement(prop.getProperty("insertQuery"));)
		{
				pstmt.setInt(1, product.getProduct_Id());
				pstmt.setString(2, product.getProduct_Name());	
				pstmt.setDouble(3, product.getProduct_cost());
				pstmt.setString(4, product.getDescription());
				pstmt.setInt(5, product.getNo_of_prroduct());
				int count= pstmt.executeUpdate();
				
				if(count>0)
				{
					return true;
				}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	
	}

}
