package com.digihealth.entity;

public class BasDept {
    /**
     * ����id
     */
    private String deptId;

    /**
     * ����
     */
    private String name;

    private String remarks;

    /**
     * �Ƿ���Ч;0-��Ч��1-��Ч
     */
    private Integer enable;

    /**
     * ����id
     */
    private String beid;
	
    /**
     * ƴ��
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