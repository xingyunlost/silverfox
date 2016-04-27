package com.silverfox.service.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silverfox.mapper.SFConfigMapper;
import com.silverfox.model.SFConfig;
import com.silverfox.service.SFConfigService;

@Service
public class SFConfigServiceImpl implements SFConfigService {
	
	@Resource
	private SFConfigMapper mapper;
	
	@Override
	public SFConfig find(SFConfig sfConfig) {
		return mapper.find(sfConfig);
	}

	@Override
	public SFConfig findByPrimaryKey(String codeType, String codeCode) {
		// TODO Auto-generated method stub
		return mapper.findByPrimaryKey(codeType, codeCode);
	}

	@Override
	public List<SFConfig> find() {
		// TODO Auto-generated method stub
		return mapper.find();
	}

}
