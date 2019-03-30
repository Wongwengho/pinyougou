package com.pinyougou.pojo;

/**
 * User 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class User implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private java.util.Date created;
	private java.util.Date updated;
	private String sourceType;
	private String nickName;
	private String name;
	private String status;
	private String headPic;
	private String qq;
	private String accountBalance;
	private String isMobileCheck;
	private String isEmailCheck;
	private String sex;
	private Integer userLevel;
	private Integer points;
	private Integer experienceValue;
	private java.util.Date birthday;
	private java.util.Date lastLoginTime;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setCreated(java.util.Date created){
		this.created = created;
	}
	public java.util.Date getCreated(){
		return this.created;
	}
	public void setUpdated(java.util.Date updated){
		this.updated = updated;
	}
	public java.util.Date getUpdated(){
		return this.updated;
	}
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
	public String getSourceType(){
		return this.sourceType;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public String getNickName(){
		return this.nickName;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setHeadPic(String headPic){
		this.headPic = headPic;
	}
	public String getHeadPic(){
		return this.headPic;
	}
	public void setQq(String qq){
		this.qq = qq;
	}
	public String getQq(){
		return this.qq;
	}
	public void setAccountBalance(String accountBalance){
		this.accountBalance = accountBalance;
	}
	public String getAccountBalance(){
		return this.accountBalance;
	}
	public void setIsMobileCheck(String isMobileCheck){
		this.isMobileCheck = isMobileCheck;
	}
	public String getIsMobileCheck(){
		return this.isMobileCheck;
	}
	public void setIsEmailCheck(String isEmailCheck){
		this.isEmailCheck = isEmailCheck;
	}
	public String getIsEmailCheck(){
		return this.isEmailCheck;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setUserLevel(Integer userLevel){
		this.userLevel = userLevel;
	}
	public Integer getUserLevel(){
		return this.userLevel;
	}
	public void setPoints(Integer points){
		this.points = points;
	}
	public Integer getPoints(){
		return this.points;
	}
	public void setExperienceValue(Integer experienceValue){
		this.experienceValue = experienceValue;
	}
	public Integer getExperienceValue(){
		return this.experienceValue;
	}
	public void setBirthday(java.util.Date birthday){
		this.birthday = birthday;
	}
	public java.util.Date getBirthday(){
		return this.birthday;
	}
	public void setLastLoginTime(java.util.Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}
	public java.util.Date getLastLoginTime(){
		return this.lastLoginTime;
	}

}