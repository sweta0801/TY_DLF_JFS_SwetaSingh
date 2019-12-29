package com.tyss.forestry.dao;

import java.util.List;

import com.tyss.forestry.bean.CustomerBean;
import com.tyss.forestry.bean.LandBean;

public interface LandDAO {
	
	List<LandBean> getAllLandRecord();
	
	boolean insertLandRecord(LandBean land);
	boolean deleteLandRecord(int landId);
	

	
}
