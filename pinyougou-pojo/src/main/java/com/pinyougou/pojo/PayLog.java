package com.pinyougou.pojo;

/**
 * PayLog 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class PayLog implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String outTradeNo;
	private java.util.Date createTime;
	private java.util.Date payTime;
	private Long totalFee;
	private String userId;
	private String transactionId;
	private String tradeState;
	private String orderList;
	private String payType;

	/** setter and getter method */
	public void setOutTradeNo(String outTradeNo){
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo(){
		return this.outTradeNo;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}
	public java.util.Date getPayTime(){
		return this.payTime;
	}
	public void setTotalFee(Long totalFee){
		this.totalFee = totalFee;
	}
	public Long getTotalFee(){
		return this.totalFee;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}
	public String getTransactionId(){
		return this.transactionId;
	}
	public void setTradeState(String tradeState){
		this.tradeState = tradeState;
	}
	public String getTradeState(){
		return this.tradeState;
	}
	public void setOrderList(String orderList){
		this.orderList = orderList;
	}
	public String getOrderList(){
		return this.orderList;
	}
	public void setPayType(String payType){
		this.payType = payType;
	}
	public String getPayType(){
		return this.payType;
	}

}