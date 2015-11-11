package com.dmtool.user.actions;

import java.util.List;

public class DeploymentOptionsActions {
	private String envName;
	private List<String> deploymentServices;
	private String actionType;
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	public List<String> getDeploymentServices() {
		return deploymentServices;
	}
	public void setDeploymentServices(List<String> deploymentServices) {
		this.deploymentServices = deploymentServices;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
}
