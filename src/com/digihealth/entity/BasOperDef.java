package com.digihealth.entity;

public class BasOperDef {
    /**
     * ����
     */
	private String operdefId;

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
     * ��Ч��־;1-��Ч��0-��Ч
     */
    private Integer enable;

    /**
     * ����id
     */
    private String beid;

	public String getOperdefId() {
		return operdefId;
	}

	public void setOperdefId(String operdefId) {
		this.operdefId = operdefId;
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
