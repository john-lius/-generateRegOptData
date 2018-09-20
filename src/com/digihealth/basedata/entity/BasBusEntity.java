package com.digihealth.basedata.entity;

public class BasBusEntity {
	/**
	 * 局点id，主键
	 */
	private String beid;

	/**
	 * 局点名称
	 */
	private String name;

	/**
	 * 局点编码
	 */
	private String code;

	/**
	 * 子名称
	 */
	private String subName;

	/**
	 * 电话
	 */
	private String tel;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 是否可用:1-可用，0-不可用
	 */
	private Integer enable;

	/**
	 * 是否当前局点：1-是，0否
	 */
	private Integer isCurBe;

	private String titlePath;

	/**
	 * 源局点
	 */
	private String sourceBeid;

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getIsCurBe() {
		return isCurBe;
	}

	public void setIsCurBe(Integer isCurBe) {
		this.isCurBe = isCurBe;
	}

	public String getTitlePath() {
		return titlePath;
	}

	public void setTitlePath(String titlePath) {
		this.titlePath = titlePath;
	}

	public String getSourceBeid() {
		return sourceBeid;
	}

	public void setSourceBeid(String sourceBeid) {
		this.sourceBeid = sourceBeid;
	}

}
