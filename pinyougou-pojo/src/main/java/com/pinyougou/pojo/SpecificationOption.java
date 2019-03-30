package com.pinyougou.pojo;

/**
 * SpecificationOption 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class SpecificationOption implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String optionName;
	private Long specId;
	private Integer orders;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setOptionName(String optionName){
		this.optionName = optionName;
	}
	public String getOptionName(){
		return this.optionName;
	}
	public void setSpecId(Long specId){
		this.specId = specId;
	}
	public Long getSpecId(){
		return this.specId;
	}
	public void setOrders(Integer orders){
		this.orders = orders;
	}
	public Integer getOrders(){
		return this.orders;
	}

}