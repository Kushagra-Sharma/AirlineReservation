package com.cg.airline.service;

import com.cg.airline.bean.userDetails;

public interface IAirlineService {

	public userDetails userLogin(String userName);
	public userDetails addUser(userDetails userDetails);
}
