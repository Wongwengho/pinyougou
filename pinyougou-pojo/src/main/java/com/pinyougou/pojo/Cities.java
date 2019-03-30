package com.pinyougou.pojo;

/**
 * Cities 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Cities implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String cityid;
	private String city;
	private String provinceid;

	/** setter and getter method */
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setCityid(String cityid){
		this.cityid = cityid;
	}
	public String getCityid(){
		return this.cityid;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	public void setProvinceid(String provinceid){
		this.provinceid = provinceid;
	}
	public String getProvinceid(){
		return this.provinceid;
	}

}