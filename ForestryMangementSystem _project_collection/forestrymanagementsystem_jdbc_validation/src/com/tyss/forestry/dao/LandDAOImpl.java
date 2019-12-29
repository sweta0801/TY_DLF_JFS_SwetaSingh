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

import com.tyss.forestry.bean.LandBean;
import com.tyss.forestry.bean.ProductBean;

public class LandDAOImpl implements LandDAO {
	FileReader reader;
	Properties prop;
	LandBean land;

	public LandDAOImpl() {
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
	public List<LandBean> getAllLandRecord() {
		List<LandBean> landList = new ArrayList<LandBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getAllLandRecord"));) {
			while (rs.next()) {
				land = new LandBean();
				land.setLandArea(rs.getInt(1));
				land.setLandArea(rs.getInt(2));
				land.setLandCost(rs.getDouble(3));
				landList.add(land);		
			}
		return  landList;	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertLandRecord(LandBean land) {
		
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("InsertLandQuery"));) {
			pstmt.setInt(1, land.getLandId());
			pstmt.setInt(2, land.getLandArea());
			pstmt.setDouble(3, land.getLandCost());
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
	public boolean deleteLandRecord(int landId) {
	
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("DeleteLandQuery"));) {
			pstmt.setInt(1, landId);

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
