package com.digihealth.basedata.entity;

public class BasBusEntity {
	/**
	 * �ֵ�id������
	 */
	private String beid;

	/**
	 * �ֵ�����
	 */
	private String name;

	/**
	 * �ֵ����
	 */
	private String code;

	/**
	 * ������
	 */
	private String subName;

	/**
	 * �绰
	 */
	private String tel;

	/**
	 * ��ַ
	 */
	private String address;

	/**
	 * ����
	 */
	private String description;

	/**
	 * �Ƿ����:1-���ã�0-������
	 */
	private Integer enable;

	/**
	 * �Ƿ�ǰ�ֵ㣺1-�ǣ�0��
	 */
	private Integer isCurBe;

	private String titlePath;

	/**
	 * Դ�ֵ�
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
