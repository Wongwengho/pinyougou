package com.pinyougou.pojo;

/**
 * Goods 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class Goods implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String sellerId;
	private String goodsName;
	private Long defaultItemId;
	private String auditStatus;
	private String isMarketable;
	private Long brandId;
	private String caption;
	private Long category1Id;
	private Long category2Id;
	private Long category3Id;
	private String smallPic;
	private String price;
	private Long typeTemplateId;
	private String isEnableSpec;
	private String isDelete;

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
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	public String getGoodsName(){
		return this.goodsName;
	}
	public void setDefaultItemId(Long defaultItemId){
		this.defaultItemId = defaultItemId;
	}
	public Long getDefaultItemId(){
		return this.defaultItemId;
	}
	public void setAuditStatus(String auditStatus){
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus(){
		return this.auditStatus;
	}
	public void setIsMarketable(String isMarketable){
		this.isMarketable = isMarketable;
	}
	public String getIsMarketable(){
		return this.isMarketable;
	}
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}
	public Long getBrandId(){
		return this.brandId;
	}
	public void setCaption(String caption){
		this.caption = caption;
	}
	public String getCaption(){
		return this.caption;
	}
	public void setCategory1Id(Long category1Id){
		this.category1Id = category1Id;
	}
	public Long getCategory1Id(){
		return this.category1Id;
	}
	public void setCategory2Id(Long category2Id){
		this.category2Id = category2Id;
	}
	public Long getCategory2Id(){
		return this.category2Id;
	}
	public void setCategory3Id(Long category3Id){
		this.category3Id = category3Id;
	}
	public Long getCategory3Id(){
		return this.category3Id;
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
	public void setTypeTemplateId(Long typeTemplateId){
		this.typeTemplateId = typeTemplateId;
	}
	public Long getTypeTemplateId(){
		return this.typeTemplateId;
	}
	public void setIsEnableSpec(String isEnableSpec){
		this.isEnableSpec = isEnableSpec;
	}
	public String getIsEnableSpec(){
		return this.isEnableSpec;
	}
	public void setIsDelete(String isDelete){
		this.isDelete = isDelete;
	}
	public String getIsDelete(){
		return this.isDelete;
	}

}