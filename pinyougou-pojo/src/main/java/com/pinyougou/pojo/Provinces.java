package com.pinyougou.pojo;

/**
 * Provinces 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class Provinces implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String provinceid;
	private String province;

	/** setter and getter method */
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setProvinceid(String provinceid){
		this.provinceid = provinceid;
	}
	public String getProvinceid(){
		return this.provinceid;
	}
	public void setProvince(String province){
		this.province = province;
	}
	public String getProvince(){
		return this.province;
	}

}