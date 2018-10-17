package com.accp.vo.lzh;

public class LzhVo {
	private String merchantLevel; 	//user 星级
	private Integer serviceId ;//服务编号，主键，自增
	private Integer serviceID;					//店铺id
	private Integer stid;						//级别id
	private String shopName;					//店铺名称
	private String shopImg;						//商家店铺图片路径
	private String servicePrice;				//金币
	private String serviceCoverImg;				//封面图片
	private String serviceTitle;				//标题
	private Integer cityID;						//城市id  市id
	public String getMerchantLevel() {
		return merchantLevel;
	}
	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceCoverImg() {
		return serviceCoverImg;
	}
	public void setServiceCoverImg(String serviceCoverImg) {
		this.serviceCoverImg = serviceCoverImg;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public Integer getCityID() {
		return cityID;
	}
	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	

}
