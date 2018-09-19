package com.digihealth.entity;

public class BasDept {
    /**
     * 主键id
     */
    private String deptId;

    /**
     * 名称
     */
    private String name;

    private String remarks;

    /**
     * 是否有效;0-无效，1-有效
     */
    private Integer enable;

    /**
     * 基线id
     */
    private String beid;
	
    /**
     * 拼音
     */
    private String pinYin;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
        this.beid = beid == null ? null : beid.trim();
    }

	public String getPinYin()
	{
		return pinYin;
	}

	public void setPinYin(String pinYin)
	{
		this.pinYin = pinYin;
	}

}