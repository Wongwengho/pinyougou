package com.pinyougou.pojo;

/**
 * Content 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Content implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long categoryId;
	private String title;
	private String url;
	private String pic;
	private String status;
	private Integer sortOrder;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}
	public Long getCategoryId(){
		return this.categoryId;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setPic(String pic){
		this.pic = pic;
	}
	public String getPic(){
		return this.pic;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder = sortOrder;
	}
	public Integer getSortOrder(){
		return this.sortOrder;
	}

}