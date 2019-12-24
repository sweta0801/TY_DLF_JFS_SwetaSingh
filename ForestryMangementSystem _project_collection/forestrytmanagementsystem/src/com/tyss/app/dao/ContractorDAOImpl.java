package com.tyss.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.app.bean.ContractorBean;
import com.tyss.app.bean.ProductBean;

public class ContractorDAOImpl implements ContractorDAO {

	private List<ContractorBean> contractorbean = new ArrayList<ContractorBean>();

	@Override
	public List<ContractorBean> getAllContractor() {

		return contractorbean;
	}

	@Override
	public boolean insertContractor(ContractorBean contractor) {

		for (ContractorBean contractorBean2 : contractorbean) {
			if (contractor.getContractno() == contractorBean2.getContractno()) {
				return false;
			}

			contractorbean.add(contractor);
		}
		return true;
	}

	@Override
	public boolean deleteContractor(int contractno) {
		for (ContractorBean contractorBean2 : contractorbean) {
			if (contractorBean2.getContractno() == contractno) {
				contractorbean.remove(contractorBean2);
				return true;
			}

		}
		return false;
	}

}
