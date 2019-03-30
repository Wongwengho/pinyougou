package com.pinyougou.pojo;

/**
 * Address 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Address implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String provinceId;
	private String cityId;
	private String townId;
	private String mobile;
	private String address;
	private String contact;
	private String isDefault;
	private String notes;
	private java.util.Date createDate;
	private String alias;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setProvinceId(String provinceId){
		this.provinceId = provinceId;
	}
	public String getProvinceId(){
		return this.provinceId;
	}
	public void setCityId(String cityId){
		this.cityId = cityId;
	}
	public String getCityId(){
		return this.cityId;
	}
	public void setTownId(String townId){
		this.townId = townId;
	}
	public String getTownId(){
		return this.townId;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setContact(String contact){
		this.contact = contact;
	}
	public String getContact(){
		return this.contact;
	}
	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}
	public String getIsDefault(){
		return this.isDefault;
	}
	public void setNotes(String notes){
		this.notes = notes;
	}
	public String getNotes(){
		return this.notes;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	public void setAlias(String alias){
		this.alias = alias;
	}
	public String getAlias(){
		return this.alias;
	}

}