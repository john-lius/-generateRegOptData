package com.digihealth.basedata.entity;

import java.util.Date;

public class BasUser {

	private String beid;
	/**
	 * ��¼��
	 */
	private String userName;

	/**
	 * ����
	 */
	private String password;

	/**
	 * ����
	 */
	private String name;

	/**
	 * �ֻ�
	 */
	private String mobile;

	/**
	 * ����
	 */
	private String email;

	/**
	 * ͼƬ
	 */
	private String photo;

	/**
	 * ��¼IP��ַ
	 */
	private String loginIp;

	/**
	 * ����¼ʱ��
	 */
	private Date loginDate;

	/**
	 * ������
	 */
	private String createUser;

	/**
	 * ����ʱ��
	 */
	private Date createDate;

	private String pinYin;
	/**
	 * �Ƿ�����:1-������0-δ����
	 */
	private Integer locked;

	/**
	 * �Ƿ����:1-���ã�0-������
	 */
	private Integer enable;

	/**
	 * ��
	 */
	private String salt;

	/**
	 * TOKEN
	 */
	private String token;

	/**
	 * �û����� ϵͳ����Ա��ADMIN ,ҽ����DOCTOR,��ʿ��NURSE,��ʿ����HEAD_NURSE,����ҽ����ARCHIATER
	 */
	private String userType;

	/**
	 * ְ��
	 */
	private String professionalTitle;

	/**
	 * ��������
	 */
	private String executiveLevel;

	/**
	 * ��ɫID
	 */
	private String roleId;

	/**
	 * ��ɫ����
	 */
	private String roleName;

	/**
	 * ��ɫ����
	 */
	private String roleType;

	/**
	 * �ֵ�����
	 */
	private String beName;

	/**
	 * �ֵ����
	 */
	private String beCode;

	/**
	 * ������
	 */
	private String subName;

	private String picPath;

	private String dzqm;

	private String titlePath;

	private Integer formal;

	private String hisId;

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPinYin() {
		return pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getProfessionalTitle() {
		return professionalTitle;
	}

	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}

	public String getExecutiveLevel() {
		return executiveLevel;
	}

	public void setExecutiveLevel(String executiveLevel) {
		this.executiveLevel = executiveLevel;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getBeName() {
		return beName;
	}

	public void setBeName(String beName) {
		this.beName = beName;
	}

	public String getBeCode() {
		return beCode;
	}

	public void setBeCode(String beCode) {
		this.beCode = beCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getDzqm() {
		return dzqm;
	}

	public void setDzqm(String dzqm) {
		this.dzqm = dzqm;
	}

	public String getTitlePath() {
		return titlePath;
	}

	public void setTitlePath(String titlePath) {
		this.titlePath = titlePath;
	}

	public Integer getFormal() {
		return formal;
	}

	public void setFormal(Integer formal) {
		this.formal = formal;
	}

	public String getHisId() {
		return hisId;
	}

	public void setHisId(String hisId) {
		this.hisId = hisId;
	}

}
