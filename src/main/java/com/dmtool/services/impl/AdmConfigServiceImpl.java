package com.dmtool.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmtool.dao.impl.AdmConfigDao;
import com.dmtool.domain.AdmConfig;
import com.dmtool.services.AdmConfigService;
@Service
public class AdmConfigServiceImpl  implements AdmConfigService{
	
	@Autowired
	private AdmConfigDao admConfigDao;
	
	@Override
	public AdmConfig getAdmConfigById(int AdmConfigId) {
		return admConfigDao.getAdmConfigById(AdmConfigId);
	}

	@Override
	public List<AdmConfig> getAllAdmConfig() {
		// TODO Auto-generated method stub
		return admConfigDao.getAllAdmConfig();
	}

	@Override
	public void deleteAdmConfig(AdmConfig admConfig) {
		admConfigDao.deleteAdmConfig(admConfig);
	}

	@Override
	public AdmConfig createAdmConfig(AdmConfig admConfig) {
		// TODO Auto-generated method stub
		return admConfigDao.createAdmConfig(admConfig);
	}

	@Override
	public void modifyAdmConfig(AdmConfig admConfig) {
		admConfigDao.modifyAdmConfig(admConfig);
		
	}

	@Override
	public AdmConfig getAdmConfigByEnvNameAndActionType(
			String selectedEnvName, String actionType) {
		// TODO Auto-generated method stub
		List<AdmConfig> admConfigList = admConfigDao.getAdmConfigByEnvNameAndActionType(selectedEnvName,actionType);
		
		if(admConfigList != null && admConfigList.size() > 0){
			return admConfigList.get(0);
		}
		return null;
	}

}