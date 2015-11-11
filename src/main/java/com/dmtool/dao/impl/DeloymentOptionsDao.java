package com.dmtool.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.dmtool.domain.DeploymentOptions;

@Repository
public class DeloymentOptionsDao extends HibernateDaoSupport{
	public List<DeploymentOptions> getAllDeploymentOptions() {
	       @SuppressWarnings("unchecked")
		List<DeploymentOptions> optionsList = (List<DeploymentOptions>)getHibernateTemplate().find("from DeploymentOptions");
	    return optionsList;
	}
	public List<DeploymentOptions> getAllDeploymentOptionsByCategory(String category) {
	       @SuppressWarnings("unchecked")
		List<DeploymentOptions> optionsList = (List<DeploymentOptions>)getHibernateTemplate().find("from DeploymentOptions d where d.category=?", category);
	    return optionsList;
	}
	public List<DeploymentOptions> getAllDeploymentOptionsByCode(String code) {
	       @SuppressWarnings("unchecked")
		List<DeploymentOptions> options =  getHibernateTemplate().find("from DeploymentOptions d where d.code=?", code);
	    return options;
	}
}

