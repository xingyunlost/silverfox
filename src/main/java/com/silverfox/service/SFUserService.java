package com.silverfox.service;

import java.util.List;

import com.silverfox.model.SFUser;

public interface SFUserService {
	/**
	 * sava an entity
	 * @param sfUser
	 */
	void save(SFUser sfUser);
	
	/**
	 * update an entity
	 * @param sfUser
	 * @return
	 */
	boolean update(SFUser sfUser);
	
	/**
	 * delete by id
	 * @param id
	 * @return
	 */
	boolean delete(int id);
	
	/**
	 * find by id
	 * @param id
	 * @return
	 */
	SFUser findById(int id);
	
	/**
	 * find by an entity
	 * @param sfUser
	 * @return
	 */
	List<SFUser> find(SFUser sfUser);
}
