package com.dmtool.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dmtool.dao.impl.ReposDao;
import com.dmtool.domain.Repos;
import com.dmtool.services.ReposService;

@Repository
public class ReposServiceImpl implements ReposService{
	
	@Autowired
	private ReposDao reposDao;
	
	@Override
	public Repos getReposById(int repoId) {
		return reposDao.getReposById(repoId);
	}

	@Override
	public List<Repos> getAllRepos() {
		// TODO Auto-generated method stub
		return reposDao.getAllRepos();
	}

	@Override
	public void deleteRepos(Repos repo) {
		reposDao.deleteRepos(repo);
	}

	@Override
	public Repos createRepos(Repos repos) {
		// TODO Auto-generated method stub
		return reposDao.createRepos(repos);
	}

	@Override
	public void modifyRepos(Repos repos) {
		reposDao.modifyRepos(repos);
		
	}

	@Override
	public Repos getRepoInfoByEnvNameAndActionType(
			String selectedEnvName, String actionType) {
		// TODO Auto-generated method stub
		List<Repos> reposList = reposDao.getRepoInfoByEnvNameAndActionType(
				selectedEnvName, actionType);
		if(reposList != null && reposList.size() > 0){
			return reposList.get(0);
		}
		return null;
	}

}