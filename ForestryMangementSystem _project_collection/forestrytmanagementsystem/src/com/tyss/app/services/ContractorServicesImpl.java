package com.tyss.app.services;

import java.util.List;

import com.tyss.app.bean.ContractorBean;
import com.tyss.app.dao.ContractorDAO;
import com.tyss.app.factory.ContractorFactory;

public class ContractorServicesImpl implements ContractorService {

	ContractorDAO dao = ContractorFactory.instanceOfContractorDAOImpl();

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
