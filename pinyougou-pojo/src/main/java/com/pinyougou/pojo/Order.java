package com.pinyougou.pojo;

/**
 * Order 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class Order implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long orderId;
	private String payment;
	private String paymentType;
	private String postFee;
	private String status;
	private java.util.Date createTime;
	private java.util.Date updateTime;
	private java.util.Date paymentTime;
	private java.util.Date consignTime;
	private java.util.Date endTime;
	private java.util.Date closeTime;
	private String shippingName;
	private String shippingCode;
	private String userId;
	private String buyerMessage;
	private String buyerNick;
	private String buyerRate;
	private String receiverAreaName;
	private String receiverMobile;
	private String receiverZipCode;
	private String receiver;
	private java.util.Date expire;
	private String invoiceType;
	private String sourceType;
	private String sellerId;

	/** setter and getter method */
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	public Long getOrderId(){
		return this.orderId;
	}
	public void setPayment(String payment){
		this.payment = payment;
	}
	public String getPayment(){
		return this.payment;
	}
	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}
	public String getPaymentType(){
		return this.paymentType;
	}
	public void setPostFee(String postFee){
		this.postFee = postFee;
	}
	public String getPostFee(){
		return this.postFee;
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
	public void setPaymentTime(java.util.Date paymentTime){
		this.paymentTime = paymentTime;
	}
	public java.util.Date getPaymentTime(){
		return this.paymentTime;
	}
	public void setConsignTime(java.util.Date consignTime){
		this.consignTime = consignTime;
	}
	public java.util.Date getConsignTime(){
		return this.consignTime;
	}
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	public java.util.Date getEndTime(){
		return this.endTime;
	}
	public void setCloseTime(java.util.Date closeTime){
		this.closeTime = closeTime;
	}
	public java.util.Date getCloseTime(){
		return this.closeTime;
	}
	public void setShippingName(String shippingName){
		this.shippingName = shippingName;
	}
	public String getShippingName(){
		return this.shippingName;
	}
	public void setShippingCode(String shippingCode){
		this.shippingCode = shippingCode;
	}
	public String getShippingCode(){
		return this.shippingCode;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setBuyerMessage(String buyerMessage){
		this.buyerMessage = buyerMessage;
	}
	public String getBuyerMessage(){
		return this.buyerMessage;
	}
	public void setBuyerNick(String buyerNick){
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick(){
		return this.buyerNick;
	}
	public void setBuyerRate(String buyerRate){
		this.buyerRate = buyerRate;
	}
	public String getBuyerRate(){
		return this.buyerRate;
	}
	public void setReceiverAreaName(String receiverAreaName){
		this.receiverAreaName = receiverAreaName;
	}
	public String getReceiverAreaName(){
		return this.receiverAreaName;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setReceiverZipCode(String receiverZipCode){
		this.receiverZipCode = receiverZipCode;
	}
	public String getReceiverZipCode(){
		return this.receiverZipCode;
	}
	public void setReceiver(String receiver){
		this.receiver = receiver;
	}
	public String getReceiver(){
		return this.receiver;
	}
	public void setExpire(java.util.Date expire){
		this.expire = expire;
	}
	public java.util.Date getExpire(){
		return this.expire;
	}
	public void setInvoiceType(String invoiceType){
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType(){
		return this.invoiceType;
	}
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
	public String getSourceType(){
		return this.sourceType;
	}
	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}
	public String getSellerId(){
		return this.sellerId;
	}

}