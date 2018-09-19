package com.digihealth.entity;

public class BasDictItem {
	/**
	 * 码表ID
	 */
	private Integer id;

	/**
	 * 组
	 */
	private String groupId;

	/**
	 * 码值
	 */
	private String codeValue;

	/**
	 * 码值名称
	 */
	private String codeName;

	/**
	 * 排序
	 */
	private Integer order;

	/**
	 * 是否有效
	 */
	private Boolean enable;

	/**
	 * 局点id
	 */
	private String beid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

}
