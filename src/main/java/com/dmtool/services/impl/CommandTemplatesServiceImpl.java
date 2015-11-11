package com.dmtool.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dmtool.dao.impl.CommandTemplatesDao;
import com.dmtool.domain.CommandTemplates;
import com.dmtool.services.CommandTemplatesService;
@Repository
public class CommandTemplatesServiceImpl implements CommandTemplatesService {
	
	@Autowired
	private CommandTemplatesDao commandTemplatesDao;
	
	@Override
	public List<CommandTemplates> getAllCommandTemplatesByCode(String code) {
		
		return commandTemplatesDao.getAllCommandTemplatesByCode(code);
	}

}
