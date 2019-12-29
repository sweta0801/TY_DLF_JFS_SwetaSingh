package com.tyss.forestry.factory;

import com.tyss.forestry.dao.LandDAO;
import com.tyss.forestry.dao.LandDAOImpl;
import com.tyss.forestry.services.LandService;
import com.tyss.forestry.services.LandServiceImpl;

public class LandFactory {

	
private LandFactory() {
		
	}

	public static LandDAO  instanceOfLandDAOImpl() {
		
		LandDAO dao = new LandDAOImpl();
		return dao;
		
	}
	public static LandService instanceOfLandService(){
		LandService service = new LandServiceImpl();
		return service;
		
	}
}
