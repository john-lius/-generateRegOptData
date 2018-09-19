/*
 * BasOperationPeople.java
 * Copyright(C) 2016 digihealth
 * All rights reserved.
 * ----------------------------------------
 * @author cy
 * 2017-03-31 Created
 */
package com.digihealth.entity;

public class BasOperationPeople {
    
    private String operatorId;

    /**
     * ����
     */
    private String code;

    /**
     * ����
     */
    private String name;

    /**
     * ��Ч��־;0-��Ч��1-��Ч
     */
    private Integer enable;

    /**
     * ����
     */
    private Integer region;

    /**
     * ƴ����
     */
    private String pinYin;

    /**
     * ����id
     */
    private String beid;
    /**
     * ͼƬ·��
     */
    private String picPath;

    /**
     * Ա������
     */
    private String yggh;
    
    
    public String getYggh() {
		return yggh;
	}

	public void setYggh(String yggh) {
		this.yggh = yggh;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getPinYin() {
        return pinYin;
    }

    public void setPinYin(String pinYin) {
        this.pinYin = pinYin == null ? null : pinYin.trim();
    }

    public String getBeid() {
        return beid;
    }

    public void setBeid(String beid) {
        this.beid = beid == null ? null : beid.trim();
    }
}