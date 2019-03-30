package com.pinyougou.pojo;

/**
 * OrderItem 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class OrderItem implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long itemId;
	private Long goodsId;
	private Long orderId;
	private String title;
	private String price;
	private Integer num;
	private String totalFee;
	private String picPath;
	private String sellerId;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setItemId(Long itemId){
		this.itemId = itemId;
	}
	public Long getItemId(){
		return this.itemId;
	}
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}
	public Long getGoodsId(){
		return this.goodsId;
	}
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	public Long getOrderId(){
		return this.orderId;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public Integer getNum(){
		return this.num;
	}
	public void setTotalFee(String totalFee){
		this.totalFee = totalFee;
	}
	public String getTotalFee(){
		return this.totalFee;
	}
	public void setPicPath(String picPath){
		this.picPath = picPath;
	}
	public String getPicPath(){
		return this.picPath;
	}
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}

}