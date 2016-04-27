package com.silverfox.model;

public class SFConfig {
	private String codeType;
	private String codeCode;
	private String codeCName;
	private String codeTName;
	private String codeEName;
	private String validInd;
	private String codeCContent;
	private String codeEContent;
	private String codeTContent;

	private String remark;
	private String display;
	public String getCodeType() {
		return codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeCode() {
		return codeCode;
	}
	public void setCodeCode(String codeCode) {
		this.codeCode = codeCode;
	}
	public String getCodeCName() {
		return codeCName;
	}
	public void setCodeCName(String codeCName) {
		this.codeCName = codeCName;
	}
	public String getCodeTName() {
		return codeTName;
	}
	public void setCodeTName(String codeTName) {
		this.codeTName = codeTName;
	}
	public String getCodeEName() {
		return codeEName;
	}
	public void setCodeEName(String codeEName) {
		this.codeEName = codeEName;
	}
	public String getValidInd() {
		return validInd;
	}
	public void setValidInd(String validInd) {
		this.validInd = validInd;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCodeCContent() {
		return codeCContent;
	}
	public void setCodeCContent(String codeCContent) {
		this.codeCContent = codeCContent;
	}
	public String getCodeEContent() {
		return codeEContent;
	}
	public void setCodeEContent(String codeEContent) {
		this.codeEContent = codeEContent;
	}
	public String getCodeTContent() {
		return codeTContent;
	}
	public void setCodeTContent(String codeTContent) {
		this.codeTContent = codeTContent;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeCode == null) ? 0 : codeCode.hashCode());
		result = prime * result
				+ ((codeType == null) ? 0 : codeType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SFConfig other = (SFConfig) obj;
		if (codeCode == null) {
			if (other.codeCode != null)
				return false;
		} else if (!codeCode.equals(other.codeCode))
			return false;
		if (codeType == null) {
			if (other.codeType != null)
				return false;
		} else if (!codeType.equals(other.codeType))
			return false;
		return true;
	}
	
}
