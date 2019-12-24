package com.tyss.app.dao;

import java.util.List;

import com.tyss.app.bean.ContractorBean;



public interface ContractorDAO {
	List <ContractorBean> getAllContractor();
	 
	 boolean insertContractor(ContractorBean contractor);
	boolean deleteContractor(int contractno);

}
