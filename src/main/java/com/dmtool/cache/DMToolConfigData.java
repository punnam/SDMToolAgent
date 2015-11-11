package com.dmtool.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.dmtool.domain.AdmConfig;
import com.dmtool.domain.EnvInfo;
import com.dmtool.domain.Repos;
import com.dmtool.services.AdmConfigService;
import com.dmtool.services.EnvService;
import com.dmtool.services.ReposService;

public class DMToolConfigData {
	Map<String, Object> dataTableCache = new HashMap<String, Object>();
	private static DMToolConfigData configData;

	@Autowired
	private EnvService envService;
	
	@Autowired
	private AdmConfigService admConfigService;
	
	@Autowired
	private ReposService reposService;

	
	Map<String, EnvInfo> envInfoData;
	Map<String, AdmConfig> admConfigData;
	Map<String, Repos> reposData;
	
	Map<String, String> tokenNameValueMap;
	
	public static DMToolConfigData getInstance(){
		if(configData == null){
			configData = new DMToolConfigData();
			configData.setEnvInfoData(configData.getEnvInfoDataFromDB());
			configData.setAdmConfigData(configData.getAdmConfigData());
			configData.setReposData(configData.getReposData());
		}	
		return configData;
	}

	private Map<String, Repos> getReposData() {
		List<Repos>  allReposList = reposService.getAllRepos();
		Map<String, Repos>  reposData = new HashMap<String, Repos>();
		for (int i = 0; i < allReposList.size(); i++) {
			Repos repos = allReposList.get(i);
			reposData.put(repos.getEnvName(), repos);	
		}
		return reposData;
	}

	private Map<String, AdmConfig> getAdmConfigData() {
		List<AdmConfig>  allAdmConfigList = admConfigService.getAllAdmConfig();
		Map<String, AdmConfig>  admConfigData = new HashMap<String, AdmConfig>();
		for (int i = 0; i < allAdmConfigList.size(); i++) {
			AdmConfig admConfig = allAdmConfigList.get(i);
			admConfigData.put(admConfig.getEnvName(), admConfig);	
		}
		return admConfigData;
	}

	public Map<String, EnvInfo> getEnvInfoData() {
		return envInfoData;
	}

	public void setEnvInfoData(Map<String, EnvInfo> envInfoData) {
		this.envInfoData = envInfoData;
	}
	private Map<String, EnvInfo> getEnvInfoDataFromDB(){
		List<EnvInfo>  allEnvInfo = envService.getAllEnvs();
		Map<String, EnvInfo>  envInfoData = new HashMap<String, EnvInfo>();
		for (int i = 0; i < allEnvInfo.size(); i++) {
			EnvInfo envInfo = allEnvInfo.get(i);
			envInfoData.put(envInfo.getName(), envInfo);	
		}
		return envInfoData;
	}

	public void setAdmConfigData(Map<String, AdmConfig> admConfigData) {
		this.admConfigData = admConfigData;
	}

	public void setReposData(Map<String, Repos> reposData) {
		this.reposData = reposData;
	}
	public Map<String, String> getTokenMap() {
		
		admConfigData.keySet();
		
		return null;
	}
}
