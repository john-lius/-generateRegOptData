package com.digihealth.basedata.entity;

public class BasAnaesMethod {
    /**
     * 麻醉方法主键
     */
    private String anaMedId;

    /**
     * 代码
     */
    private String code;

    /**
     * 一级分类
     */
    private String cate1;

    /**
     * 二级分类
     */
    private String cate2;

    /**
     * 三级分类
     */
    private String cate3;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否分类;0:否,1:是
     */
    private Integer isCate;

    /**
     * 是否常用;0:否,1:是
     */
    private Integer isUsually;

    /**
     * 是否可选;0:否,1:是
     */
    private Integer optional;

    /**
     * 是否有效;0:否,1:是
     */
    private Integer isValid;

    private String pinYin;

    /**
     * 麻醉类别
     */
    private Integer anesType;
    
    /**
     * 麻醉类别名称
     */
    private String anesTypeName;

    private Integer isLocalAnaes;
    
    /**
     * 基线id
     */
    private String beid;

	public String getAnaMedId() {
		return anaMedId;
	}

	public void setAnaMedId(String anaMedId) {
		this.anaMedId = anaMedId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCate1() {
		return cate1;
	}

	public void setCate1(String cate1) {
		this.cate1 = cate1;
	}

	public String getCate2() {
		return cate2;
	}

	public void setCate2(String cate2) {
		this.cate2 = cate2;
	}

	public String getCate3() {
		return cate3;
	}

	public void setCate3(String cate3) {
		this.cate3 = cate3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsCate() {
		return isCate;
	}

	public void setIsCate(Integer isCate) {
		this.isCate = isCate;
	}

	public Integer getIsUsually() {
		return isUsually;
	}

	public void setIsUsually(Integer isUsually) {
		this.isUsually = isUsually;
	}

	public Integer getOptional() {
		return optional;
	}

	public void setOptional(Integer optional) {
		this.optional = optional;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public String getPinYin() {
		return pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

	public Integer getAnesType() {
		return anesType;
	}

	public void setAnesType(Integer anesType) {
		this.anesType = anesType;
	}

	public String getAnesTypeName() {
		return anesTypeName;
	}

	public void setAnesTypeName(String anesTypeName) {
		this.anesTypeName = anesTypeName;
	}

	public Integer getIsLocalAnaes() {
		return isLocalAnaes;
	}

	public void setIsLocalAnaes(Integer isLocalAnaes) {
		this.isLocalAnaes = isLocalAnaes;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}
    
}
