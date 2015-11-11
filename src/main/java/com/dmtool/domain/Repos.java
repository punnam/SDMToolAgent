package com.dmtool.domain;

public class Repos {
	private Integer id;
	private String envName;
	private String userId;
	private String password;
	private String odbc;
	private String filePath;
	private String repoType;
	private String repoName;
	private String logFilePath;
	private String tableDDLSync;
	private String indexDDLSync;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOdbc() {
		return odbc;
	}
	public void setOdbc(String odbc) {
		this.odbc = odbc;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getRepoType() {
		return repoType;
	}
	public void setRepoType(String repoType) {
		this.repoType = repoType;
	}
	public String getRepoName() {
		return repoName;
	}
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
	public String getLogFilePath() {
		return logFilePath;
	}
	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}
	public String getTableDDLSync() {
		return tableDDLSync;
	}
	public void setTableDDLSync(String tableDDLSync) {
		this.tableDDLSync = tableDDLSync;
	}
	public String getIndexDDLSync() {
		return indexDDLSync;
	}
	public void setIndexDDLSync(String indexDDLSync) {
		this.indexDDLSync = indexDDLSync;
	}
}