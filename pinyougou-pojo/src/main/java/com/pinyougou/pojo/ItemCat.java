package com.pinyougou.pojo;

/**
 * ItemCat 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class ItemCat implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long parentId;
	private String name;
	private Long typeId;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}
	public Long getParentId(){
		return this.parentId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setTypeId(Long typeId){
		this.typeId = typeId;
	}
	public Long getTypeId(){
		return this.typeId;
	}

}