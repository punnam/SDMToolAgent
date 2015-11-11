package com.dmtool.services;

import java.util.List;

import com.dmtool.domain.CommandTemplates;
import com.dmtool.domain.DeploymentOptions;
import com.dmtool.user.actions.DeploymentOptionsActions;

public interface CommandTemplatesService {
	public List<CommandTemplates> getAllCommandTemplatesByCode(String code);
}