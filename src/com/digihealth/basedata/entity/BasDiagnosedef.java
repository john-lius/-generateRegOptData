package com.digihealth.basedata.entity;

public class BasDiagnosedef {
    /**
     * ����
     */
	private String diagDefId;

    /**
     * ����
     */
    private String code;

    /**
     * ����
     */
    private String name;

    /**
     * ƴ��
     */
    private String pinYin;

    /**
     * �Ƿ���Ч;0-��Ч��1-��Ч
     */
    private Integer enable;

    /**
     * ����id
     */
    private String beid;

	public String getDiagDefId() {
		return diagDefId;
	}

	public void setDiagDefId(String diagDefId) {
		this.diagDefId = diagDefId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinYin() {
		return pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}
    
}
