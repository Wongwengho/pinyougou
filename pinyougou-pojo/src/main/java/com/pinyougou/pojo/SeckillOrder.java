package com.pinyougou.pojo;

/**
 * SeckillOrder 实体类
 * @date 2019-03-28 18:43:34
 * @version 1.0
 */
public class SeckillOrder implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long seckillId;
	private String money;
	private String userId;
	private String sellerId;
	private java.util.Date createTime;
	private java.util.Date payTime;
	private String status;
	private String receiverAddress;
	private String receiverMobile;
	private String receiver;
	private String transactionId;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setSeckillId(Long seckillId){
		this.seckillId = seckillId;
	}
	public Long getSeckillId(){
		return this.seckillId;
	}
	public void setMoney(String money){
		this.money = money;
	}
	public String getMoney(){
		return this.money;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
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
	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}
	public java.util.Date getPayTime(){
		return this.payTime;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setReceiverAddress(String receiverAddress){
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverAddress(){
		return this.receiverAddress;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setReceiver(String receiver){
		this.receiver = receiver;
	}
	public String getReceiver(){
		return this.receiver;
	}
	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}
	public String getTransactionId(){
		return this.transactionId;
	}

}