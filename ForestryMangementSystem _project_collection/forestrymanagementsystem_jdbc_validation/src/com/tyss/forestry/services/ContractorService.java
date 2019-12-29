package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.ContractorBean;

public interface ContractorService {

	List <ContractorBean> getAllContractor();
	 
    boolean insertContractor(ContractorBean contractor);
	boolean deleteContractor(int contractno);
	
}
