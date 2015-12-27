package com.dmtool.domain;

public class AgentInfo {		
	private String host;
	private int remotePort;
	private String remoteUser;
	private String remoteAddress;
	private String serverName;
	int serverPort;
	private String sdmToolServerUrl;
	public AgentInfo(){
		super();
	}
	public AgentInfo(String host, int remotePort, String remoteUser, String remoteAddress, String serverName,
			int serverPort) {
		super();
		this.host = host;
		this.remotePort = remotePort;
		this.remoteUser = remoteUser;
		this.remoteAddress = remoteAddress;
		this.serverName = serverName;
		this.serverPort = serverPort;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public String getRemoteUser() {
		return remoteUser;
	}
	public void setRemoteUser(String remoteUser) {
		this.remoteUser = remoteUser;
	}
	public String getRemoteAddress() {
		return remoteAddress;
	}
	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public int getServerPort() {
		return serverPort;
	}
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
	public String getSdmToolServerUrl() {
		return sdmToolServerUrl;
	}
	public void setSdmToolServerUrl(String sdmToolServerUr) {
		this.sdmToolServerUrl = sdmToolServerUr;
	}
}
