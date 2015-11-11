package com.dmtool.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmtool.dao.impl.LicenseMgtDao;
import com.dmtool.services.LicenseMgtService;

@Service
public class LicenseMgtServiceImpl implements LicenseMgtService {
	@Autowired
	private LicenseMgtDao licenseMgtDao;
	
}
