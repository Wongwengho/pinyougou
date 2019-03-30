package com.pinyougou.pojo;

/**
 * Seller 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class Seller implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String sellerId;
	private String name;
	private String nickName;
	private String password;
	private String email;
	private String mobile;
	private String telephone;
	private String status;
	private String addressDetail;
	private String linkmanName;
	private String linkmanQq;
	private String linkmanMobile;
	private String linkmanEmail;
	private String licenseNumber;
	private String taxNumber;
	private String orgNumber;
	private Long address;
	private String logoPic;
	private String brief;
	private java.util.Date createTime;
	private String legalPerson;
	private String legalPersonCardId;
	private String bankUser;
	private String bankName;

	/** setter and getter method */
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public String getNickName(){
		return this.nickName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public String getTelephone(){
		return this.telephone;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}
	public String getAddressDetail(){
		return this.addressDetail;
	}
	public void setLinkmanName(String linkmanName){
		this.linkmanName = linkmanName;
	}
	public String getLinkmanName(){
		return this.linkmanName;
	}
	public void setLinkmanQq(String linkmanQq){
		this.linkmanQq = linkmanQq;
	}
	public String getLinkmanQq(){
		return this.linkmanQq;
	}
	public void setLinkmanMobile(String linkmanMobile){
		this.linkmanMobile = linkmanMobile;
	}
	public String getLinkmanMobile(){
		return this.linkmanMobile;
	}
	public void setLinkmanEmail(String linkmanEmail){
		this.linkmanEmail = linkmanEmail;
	}
	public String getLinkmanEmail(){
		return this.linkmanEmail;
	}
	public void setLicenseNumber(String licenseNumber){
		this.licenseNumber = licenseNumber;
	}
	public String getLicenseNumber(){
		return this.licenseNumber;
	}
	public void setTaxNumber(String taxNumber){
		this.taxNumber = taxNumber;
	}
	public String getTaxNumber(){
		return this.taxNumber;
	}
	public void setOrgNumber(String orgNumber){
		this.orgNumber = orgNumber;
	}
	public String getOrgNumber(){
		return this.orgNumber;
	}
	public void setAddress(Long address){
		this.address = address;
	}
	public Long getAddress(){
		return this.address;
	}
	public void setLogoPic(String logoPic){
		this.logoPic = logoPic;
	}
	public String getLogoPic(){
		return this.logoPic;
	}
	public void setBrief(String brief){
		this.brief = brief;
	}
	public String getBrief(){
		return this.brief;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	public void setLegalPerson(String legalPerson){
		this.legalPerson = legalPerson;
	}
	public String getLegalPerson(){
		return this.legalPerson;
	}
	public void setLegalPersonCardId(String legalPersonCardId){
		this.legalPersonCardId = legalPersonCardId;
	}
	public String getLegalPersonCardId(){
		return this.legalPersonCardId;
	}
	public void setBankUser(String bankUser){
		this.bankUser = bankUser;
	}
	public String getBankUser(){
		return this.bankUser;
	}
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	public String getBankName(){
		return this.bankName;
	}

}