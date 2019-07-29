package com.cg.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.airline.bean.userDetails;
import com.cg.airline.dao.IAirlineDao;



@Service
public class AirlineServiceImpl implements IAirlineService {

	@Autowired
	IAirlineDao airlineDao;
	@Override
	public userDetails userLogin(String userName) {
		// TODO Auto-generated method stub
		return airlineDao.userLogin(userName);
	}
	@Override
	public userDetails addUser(userDetails userDetails) {
		// TODO Auto-generated method stub
		return airlineDao.addUser(userDetails);
	}

}
