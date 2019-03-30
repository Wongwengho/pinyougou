package com.pinyougou.pojo;

/**
 * GoodsDesc 实体类
 * @date 2019-03-28 18:43:33
 * @version 1.0
 */
public class GoodsDesc implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long goodsId;
	private String introduction;
	private String specificationItems;
	private String customAttributeItems;
	private String itemImages;
	private String packageList;
	private String saleService;

	/** setter and getter method */
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}
	public Long getGoodsId(){
		return this.goodsId;
	}
	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}
	public String getIntroduction(){
		return this.introduction;
	}
	public void setSpecificationItems(String specificationItems){
		this.specificationItems = specificationItems;
	}
	public String getSpecificationItems(){
		return this.specificationItems;
	}
	public void setCustomAttributeItems(String customAttributeItems){
		this.customAttributeItems = customAttributeItems;
	}
	public String getCustomAttributeItems(){
		return this.customAttributeItems;
	}
	public void setItemImages(String itemImages){
		this.itemImages = itemImages;
	}
	public String getItemImages(){
		return this.itemImages;
	}
	public void setPackageList(String packageList){
		this.packageList = packageList;
	}
	public String getPackageList(){
		return this.packageList;
	}
	public void setSaleService(String saleService){
		this.saleService = saleService;
	}
	public String getSaleService(){
		return this.saleService;
	}

}