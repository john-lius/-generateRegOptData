package com.digihealth.entity;

public class BasDictItem {
	/**
	 * ���ID
	 */
	private Integer id;

	/**
	 * ��
	 */
	private String groupId;

	/**
	 * ��ֵ
	 */
	private String codeValue;

	/**
	 * ��ֵ����
	 */
	private String codeName;

	/**
	 * ����
	 */
	private Integer order;

	/**
	 * �Ƿ���Ч
	 */
	private Boolean enable;

	/**
	 * �ֵ�id
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
