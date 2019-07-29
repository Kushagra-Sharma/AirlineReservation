package com.cg.airline.dao;

import com.cg.airline.bean.userDetails;

public interface IAirlineDao {

	public userDetails userLogin(String userName);
	public userDetails addUser(userDetails userDetails);
}
