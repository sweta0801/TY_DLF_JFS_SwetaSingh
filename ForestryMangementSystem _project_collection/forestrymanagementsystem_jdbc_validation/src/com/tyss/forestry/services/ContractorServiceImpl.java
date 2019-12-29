package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.ContractorBean;
import com.tyss.forestry.dao.ContractorDAO;
import com.tyss.forestry.factory.ContractorFactory;

public class ContractorServiceImpl implements ContractorService {
	
	ContractorDAO dao  = ContractorFactory.instanceOfContractorDAOImpl();

	@Override
	public List<ContractorBean> getAllContractor() {
		
		return dao.getAllContractor();
	}

	@Override
	public boolean insertContractor(ContractorBean contractor) {
		
		return dao.insertContractor(contractor);
	}

	@Override
	public boolean deleteContractor(int contractno) {
		
		return dao.deleteContractor(contractno);
	}
	

}
