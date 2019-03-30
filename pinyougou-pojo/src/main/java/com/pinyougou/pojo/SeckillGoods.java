package com.pinyougou.pojo;

/**
 * SeckillGoods 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class SeckillGoods implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long goodsId;
	private Long itemId;
	private String title;
	private String smallPic;
	private String price;
	private String costPrice;
	private String sellerId;
	private java.util.Date createTime;
	private java.util.Date checkTime;
	private String status;
	private java.util.Date startTime;
	private java.util.Date endTime;
	private Integer num;
	private Integer stockCount;
	private String introduction;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}
	public Long getGoodsId(){
		return this.goodsId;
	}
	public void setItemId(Long itemId){
		this.itemId = itemId;
	}
	public Long getItemId(){
		return this.itemId;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSmallPic(String smallPic){
		this.smallPic = smallPic;
	}
	public String getSmallPic(){
		return this.smallPic;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setCostPrice(String costPrice){
		this.costPrice = costPrice;
	}
	public String getCostPrice(){
		return this.costPrice;
	}
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	public void setCheckTime(java.util.Date checkTime){
		this.checkTime = checkTime;
	}
	public java.util.Date getCheckTime(){
		return this.checkTime;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setStartTime(java.util.Date startTime){
		this.startTime = startTime;
	}
	public java.util.Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	public java.util.Date getEndTime(){
		return this.endTime;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public Integer getNum(){
		return this.num;
	}
	public void setStockCount(Integer stockCount){
		this.stockCount = stockCount;
	}
	public Integer getStockCount(){
		return this.stockCount;
	}
	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}
	public String getIntroduction(){
		return this.introduction;
	}

}