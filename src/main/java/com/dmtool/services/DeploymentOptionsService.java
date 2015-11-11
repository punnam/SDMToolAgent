package com.dmtool.services;

import java.util.List;

import com.dmtool.domain.DeploymentOptions;
import com.dmtool.user.actions.DeploymentOptionsActions;

public interface DeploymentOptionsService {
	List<DeploymentOptions> getAllDeploymentOptions();
	List<DeploymentOptions> getAllDeploymentPackages();
	String processdeDloymentOptionsService(DeploymentOptionsActions env_p);
}
