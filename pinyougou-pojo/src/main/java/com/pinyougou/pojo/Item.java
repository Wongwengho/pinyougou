package com.pinyougou.pojo;

/**
 * Item 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Item implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private String sellPoint;
	private String price;
	private Integer stockCount;
	private Integer num;
	private String barcode;
	private String image;
	private Long categoryid;
	private String status;
	private java.util.Date createTime;
	private java.util.Date updateTime;
	private String itemSn;
	private String costPirce;
	private String marketPrice;
	private String isDefault;
	private Long goodsId;
	private String sellerId;
	private String cartThumbnail;
	private String category;
	private String brand;
	private String spec;
	private String seller;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSellPoint(String sellPoint){
		this.sellPoint = sellPoint;
	}
	public String getSellPoint(){
		return this.sellPoint;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return this.price;
	}
	public void setStockCount(Integer stockCount){
		this.stockCount = stockCount;
	}
	public Integer getStockCount(){
		return this.stockCount;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public Integer getNum(){
		return this.num;
	}
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}
	public String getBarcode(){
		return this.barcode;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setCategoryid(Long categoryid){
		this.categoryid = categoryid;
	}
	public Long getCategoryid(){
		return this.categoryid;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}
	public void setItemSn(String itemSn){
		this.itemSn = itemSn;
	}
	public String getItemSn(){
		return this.itemSn;
	}
	public void setCostPirce(String costPirce){
		this.costPirce = costPirce;
	}
	public String getCostPirce(){
		return this.costPirce;
	}
	public void setMarketPrice(String marketPrice){
		this.marketPrice = marketPrice;
	}
	public String getMarketPrice(){
		return this.marketPrice;
	}
	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}
	public String getIsDefault(){
		return this.isDefault;
	}
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}
	public Long getGoodsId(){
		return this.goodsId;
	}
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}
	public void setCartThumbnail(String cartThumbnail){
		this.cartThumbnail = cartThumbnail;
	}
	public String getCartThumbnail(){
		return this.cartThumbnail;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return this.category;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return this.brand;
	}
	public void setSpec(String spec){
		this.spec = spec;
	}
	public String getSpec(){
		return this.spec;
	}
	public void setSeller(String seller){
		this.seller = seller;
	}
	public String getSeller(){
		return this.seller;
	}

}