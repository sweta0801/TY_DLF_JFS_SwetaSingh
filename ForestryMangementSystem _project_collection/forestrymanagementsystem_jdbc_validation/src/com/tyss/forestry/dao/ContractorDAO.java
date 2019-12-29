package com.tyss.forestry.dao;

import java.util.List;

import com.tyss.forestry.bean.ContractorBean;



public interface ContractorDAO {

	List <ContractorBean> getAllContractor();
	 
    boolean insertContractor(ContractorBean contractor);
	boolean deleteContractor(int contractno);
	
}
