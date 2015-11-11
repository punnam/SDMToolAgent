package com.dmtool.services;

import java.util.List;

import com.dmtool.domain.Repos;

public interface ReposService {
	Repos getReposById(int repoId);

	List<Repos> getAllRepos();

	void deleteRepos(Repos repo);

	Repos createRepos(Repos repo);

	void modifyRepos(Repos repo);

	Repos getRepoInfoByEnvNameAndActionType(String selectedEnvName, String actionType);

}
