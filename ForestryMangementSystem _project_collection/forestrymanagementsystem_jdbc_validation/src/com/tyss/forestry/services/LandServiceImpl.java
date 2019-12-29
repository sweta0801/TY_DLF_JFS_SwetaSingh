package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.LandBean;
import com.tyss.forestry.dao.LandDAO;
import com.tyss.forestry.factory.LandFactory;

public class LandServiceImpl implements LandService{
	
	LandDAO dao = LandFactory.instanceOfLandDAOImpl();

	@Override
	public List<LandBean> getAllLandRecord() {
		
		return dao.getAllLandRecord();
	}

	@Override
	public boolean insertLandRecord(LandBean land) {
		
		return dao.insertLandRecord(land);
	}

	@Override
	public boolean deleteLandRecord(int landId) {
		
		return dao.deleteLandRecord(landId);
	}
	

}
