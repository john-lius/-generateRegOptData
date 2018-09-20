package com.digihealth.basedata.entity;

public class BasDiagnosedef {
    /**
     * 主键
     */
	private String diagDefId;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 拼音
     */
    private String pinYin;

    /**
     * 是否有效;0-无效，1-有效
     */
    private Integer enable;

    /**
     * 基线id
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
