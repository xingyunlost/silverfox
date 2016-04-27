package com.silverfox.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.silverfox.model.SFUser;
import com.silverfox.service.SFUserService;

@Service
@Transactional
public class SFUserServiceImpl implements SFUserService {

	@Override
	public void save(SFUser sfUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean update(SFUser sfUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SFUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SFUser> find(SFUser sfUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
