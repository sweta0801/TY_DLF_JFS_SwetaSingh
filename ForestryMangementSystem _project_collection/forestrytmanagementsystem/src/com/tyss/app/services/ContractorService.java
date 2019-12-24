package com.tyss.app.services;

import java.util.List;

import com.tyss.app.bean.ContractorBean;

public interface ContractorService {
	
	List <ContractorBean> getAllContractor();
	
	boolean insertContractor(ContractorBean contractor);
	boolean deleteContractor(int contractno);

}
