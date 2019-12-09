package com.cgi.parellelproject.bean;

public class ContractDetailsBean 
{
	private int contractNo;
	private  int customerId;
	private  int productid;
	private  int haulierId;
	private String deliverDate;
	private String deliverDay;
	private  int Quantity;
	
	public int getContractNo() {
		return contractNo;
	}
	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public String getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(String deliverDate) {
		this.deliverDate = deliverDate;
	}
	
	public String getDeliverDay() {
		return deliverDay;
	}
	public void setDeliverDay(String deliverDay) {
		this.deliverDay = deliverDay;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return " contractNo---" + contractNo + "\n customerId---" + customerId + "\n productid---"
				+ productid + "\n haulierId---" + haulierId + "\n deliverDate---" + deliverDate + "\n deliverDay---" + deliverDay
				+ "\n Quantity---" + Quantity + "\n";
	}
}
