package com.tyss.forestry.factory;

import com.tyss.forestry.dao.ContractorDAO;
import com.tyss.forestry.dao.ContractorDAOImpl;
import com.tyss.forestry.services.ContractorService;
import com.tyss.forestry.services.ContractorServiceImpl;

public class ContractorFactory {
private ContractorFactory() {
		
	}
	
	public static ContractorDAO  instanceOfContractorDAOImpl() {
		ContractorDAO dao = new ContractorDAOImpl();
		return dao;
		
	}

	public static ContractorService intaceOfContractorService() {
		ContractorService  service = new ContractorServiceImpl();
		return service;
	}

	

}
