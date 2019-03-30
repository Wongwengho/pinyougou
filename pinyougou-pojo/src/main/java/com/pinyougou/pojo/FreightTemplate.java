package com.pinyougou.pojo;

/**
 * FreightTemplate 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class FreightTemplate implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String sellerId;
	private String isDefault;
	private String name;
	private String sendTimeType;
	private String price;
	private java.util.Date createTime;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}
	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}
	public String getIsDefault(){
		return this.isDefault;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSendTimeType(String sendTimeType){
		this.sendTimeType = sendTimeType;
	}
	public String getSendTimeType(){
		return this.sendTimeType;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return this.createTime;
	}

}