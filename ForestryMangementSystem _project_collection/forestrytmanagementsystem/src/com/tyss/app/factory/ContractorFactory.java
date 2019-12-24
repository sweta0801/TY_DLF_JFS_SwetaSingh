package com.tyss.app.factory;


import com.tyss.app.dao.ContractorDAO;
import com.tyss.app.dao.ContractorDAOImpl;
import com.tyss.app.services.ContractorService;
import com.tyss.app.services.ContractorServicesImpl;

public class ContractorFactory {
	
	private ContractorFactory() {
		
	}
	
	public static ContractorDAO  instanceOfContractorDAOImpl() {
		ContractorDAO dao = new ContractorDAOImpl();
		return dao;
		
	}

	public static ContractorService intaceOfContractorService() {
		ContractorService  service = new ContractorServicesImpl();
		return service;
	}
	
	
	

}
