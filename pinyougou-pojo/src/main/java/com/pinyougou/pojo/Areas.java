package com.pinyougou.pojo;

/**
 * Areas 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Areas implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String areaid;
	private String area;
	private String cityid;

	/** setter and getter method */
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setAreaid(String areaid){
		this.areaid = areaid;
	}
	public String getAreaid(){
		return this.areaid;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	public void setCityid(String cityid){
		this.cityid = cityid;
	}
	public String getCityid(){
		return this.cityid;
	}

}