package com.digihealth.basedata.entity;

public class BasRegion {
    /**
     * id
     */
    private String regionId;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否有效
     */
    private Integer enable;
    
    /**
     * 拼音
     */
    private String pinYin;

    /**
     * 基线id
     */
    private String beid;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
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