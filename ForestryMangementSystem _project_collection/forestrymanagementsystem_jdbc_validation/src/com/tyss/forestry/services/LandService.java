package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.LandBean;

public interface LandService {
	
 List<LandBean> getAllLandRecord();
	boolean insertLandRecord(LandBean land);
	boolean deleteLandRecord(int landId);

}
