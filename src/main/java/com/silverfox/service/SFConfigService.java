package com.silverfox.service;

import java.util.List;

import com.silverfox.model.SFConfig;

public interface SFConfigService {
	public SFConfig find(SFConfig sfConfig );
	
	public SFConfig findByPrimaryKey(String codeType, String codeCode);

	public List<SFConfig> find();
}
