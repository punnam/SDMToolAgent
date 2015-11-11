package com.dmtool.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.dmtool.domain.CommandTemplates;

@Repository
public class CommandTemplatesDao extends HibernateDaoSupport{

	public List<CommandTemplates> getAllCommandTemplatesByCode(String code) {
	       @SuppressWarnings("unchecked")
		List<CommandTemplates> commands =  getHibernateTemplate().find("from CommandTemplates d where d.code = ? order by d.commandOrder", new Object[]{code});
	    return commands;
	}
	
}

