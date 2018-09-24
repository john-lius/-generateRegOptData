package com.digihealth.basedata.entity;

import java.util.Date;

public class BasUser {

	private String beid;
	/**
	 * 登录名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 图片
	 */
	private String photo;

	/**
	 * 登录IP地址
	 */
	private String loginIp;

	/**
	 * 最后登录时间
	 */
	private Date loginDate;

	/**
	 * 创建者
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private Date createDate;

	private String pinYin;
	/**
	 * 是否锁定:1-锁定，0-未锁定
	 */
	private Integer locked;

	/**
	 * 是否可用:1-可用，0-不可用
	 */
	private Integer enable;

	/**
	 * 盐
	 */
	private String salt;

	/**
	 * TOKEN
	 */
	private String token;

	/**
	 * 用户类型 系统管理员：ADMIN ,医生：DOCTOR,护士：NURSE,护士长：HEAD_NURSE,主任医生：ARCHIATER
	 */
	private String userType;

	/**
	 * 职称
	 */
	private String professionalTitle;

	/**
	 * 行政级别
	 */
	private String executiveLevel;

	/**
	 * 角色ID
	 */
	private String roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 角色类型
	 */
	private String roleType;

	/**
	 * 局点名称
	 */
	private String beName;

	/**
	 * 局点编码
	 */
	private String beCode;

	/**
	 * 子名称
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
