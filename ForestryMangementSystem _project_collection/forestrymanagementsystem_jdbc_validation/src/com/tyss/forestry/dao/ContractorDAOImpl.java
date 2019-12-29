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

import com.tyss.forestry.bean.ContractorBean;
import com.tyss.forestry.bean.ProductBean;

public class ContractorDAOImpl implements ContractorDAO {
	FileReader reader;
	Properties prop;
	 ContractorBean contractor;

	public ContractorDAOImpl() {
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
	public List<ContractorBean> getAllContractor() {
		List<ContractorBean> contractorList = new ArrayList<ContractorBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getAllContractor"));) {
			while (rs.next()) {
				contractor = new ContractorBean();
				contractor.setContractno(rs.getInt(1));;
				contractor.setCustomerId(rs.getInt(2));
				contractor.setProductId(rs.getInt(3));
				contractor.setHaulierId(rs.getInt(4));
				contractor.setDeliveryDate(rs.getDate(5));
				contractorList.add(contractor);		
			}
			return  contractorList;	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertContractor(ContractorBean contractor) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("InsertContractorQuery"));) {
			pstmt.setInt(1, contractor.getContractno());
			pstmt.setInt(2,contractor.getCustomerId());
			pstmt.setInt(3, contractor.getProductId());
			pstmt.setInt(4,contractor.getHaulierId());
			pstmt.setDate(5, contractor.getDeliveryDate());
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
	public boolean deleteContractor(int contractno) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("DeleteContractorQuery"));) {
			pstmt.setInt(1,contractno);

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
