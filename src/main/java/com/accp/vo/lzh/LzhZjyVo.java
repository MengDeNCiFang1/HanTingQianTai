package com.accp.vo.lzh;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class LzhZjyVo {
	//自驾游详情vo
	
	private String merchantLevel; 	//user 星级
	private String  serviceAppraiseContent ;//评价内容
	private String serviceAppraiseDate   ;   //评价时间
	private Integer serviceAppraiseLevel  ;//评价星级
	private String userName ;				//用户姓名
	private String userImgPath;				//用户头像
	private String languageNameText;   //user表服务语言
	private String shopName;		   //user表店铺名称
	private String  shopImg;		   //user表头像
	private String profession;        //user表职业
	private Float height;			//user表身高
	private Integer age;			//user表年龄
	private String  constellation ; //user 星座
	private String selfIntroduction;//user 自我介绍
	private Integer collectCount;  //user 被收藏次数
	private Integer orderCount;    //user 商家被订单数
	private Integer liveCity;		//user 所在城市编号
	private Integer s;
	private Integer b;
	public Integer getS() {
		return s;
	}
	public void setS(Integer s) {
		this.s = s;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	private String name;			//地址表
	private String mergerName;		//地址表
	private Integer serviceID;		//服务 主键
	private String serviceTitle;	//服务 标题
	private String serviceFuTitle;  //服务 副标题
	private Integer servicePrice;   //服务 金币
	private String serviceCoverImg; //服务 封面图
	private String serviceImgUrlOne; //服务 详1
	private String  serviceImgUrlTwo;//服务 详2
	private String serviceImgUrlThree;//服务 详3
	private String serviceImgUrlFour;//服务 详4
	private String serviceCostTypeID;//服务 费用说明
	private String serviceIntro;	//服务  服务介绍
	private String serviceCostInclude; //服务 服务费用包含
	@JSONField(format="yyyy-MM-dd")
	private Date serviceStartDate;   //服务 可预定日期-起始
	@JSONField(format="yyyy-MM-dd")
	private Date serviceEndDate;		//服务 可预定日期-结束
	private String schoolRegion;		//服务 学校地区;
	private String schoolNameByCN;	// 服务  学科-中文-学校
	private String majoyNameByCN;	//服务	学科-中文-专业
	private String schoolNameByROK;	//服务	学科-韩文-学校
	private String majoyNameByROK;	//服务	学科-韩文-专业
	private String goodAtMajoy;		//服务	擅长专业
	private String hospitalName;	//服务	医院名称
	private Integer serviceHour; 	//服务	小时/天
	private Float weight;			//服务	重量
	public String getMerchantLevel() {
		return merchantLevel;
	}
	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}
	public String getServiceAppraiseContent() {
		return serviceAppraiseContent;
	}
	public void setServiceAppraiseContent(String serviceAppraiseContent) {
		this.serviceAppraiseContent = serviceAppraiseContent;
	}
	public String getServiceAppraiseDate() {
		return serviceAppraiseDate;
	}
	public void setServiceAppraiseDate(String serviceAppraiseDate) {
		this.serviceAppraiseDate = serviceAppraiseDate;
	}
	public Integer getServiceAppraiseLevel() {
		return serviceAppraiseLevel;
	}
	public void setServiceAppraiseLevel(Integer serviceAppraiseLevel) {
		this.serviceAppraiseLevel = serviceAppraiseLevel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImgPath() {
		return userImgPath;
	}
	public void setUserImgPath(String userImgPath) {
		this.userImgPath = userImgPath;
	}
	public String getLanguageNameText() {
		return languageNameText;
	}
	public void setLanguageNameText(String languageNameText) {
		this.languageNameText = languageNameText;
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
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getSelfIntroduction() {
		return selfIntroduction;
	}
	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}
	public Integer getCollectCount() {
		return collectCount;
	}
	public void setCollectCount(Integer collectCount) {
		this.collectCount = collectCount;
	}
	public Integer getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}
	public Integer getLiveCity() {
		return liveCity;
	}
	public void setLiveCity(Integer liveCity) {
		this.liveCity = liveCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMergerName() {
		return mergerName;
	}
	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public String getServiceFuTitle() {
		return serviceFuTitle;
	}
	public void setServiceFuTitle(String serviceFuTitle) {
		this.serviceFuTitle = serviceFuTitle;
	}
	public Integer getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(Integer servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceCoverImg() {
		return serviceCoverImg;
	}
	public void setServiceCoverImg(String serviceCoverImg) {
		this.serviceCoverImg = serviceCoverImg;
	}
	public String getServiceImgUrlOne() {
		return serviceImgUrlOne;
	}
	public void setServiceImgUrlOne(String serviceImgUrlOne) {
		this.serviceImgUrlOne = serviceImgUrlOne;
	}
	public String getServiceImgUrlTwo() {
		return serviceImgUrlTwo;
	}
	public void setServiceImgUrlTwo(String serviceImgUrlTwo) {
		this.serviceImgUrlTwo = serviceImgUrlTwo;
	}
	public String getServiceImgUrlThree() {
		return serviceImgUrlThree;
	}
	public void setServiceImgUrlThree(String serviceImgUrlThree) {
		this.serviceImgUrlThree = serviceImgUrlThree;
	}
	public String getServiceImgUrlFour() {
		return serviceImgUrlFour;
	}
	public void setServiceImgUrlFour(String serviceImgUrlFour) {
		this.serviceImgUrlFour = serviceImgUrlFour;
	}
	public String getServiceCostTypeID() {
		return serviceCostTypeID;
	}
	public void setServiceCostTypeID(String serviceCostTypeID) {
		this.serviceCostTypeID = serviceCostTypeID;
	}
	public String getServiceIntro() {
		return serviceIntro;
	}
	public void setServiceIntro(String serviceIntro) {
		this.serviceIntro = serviceIntro;
	}
	public String getServiceCostInclude() {
		return serviceCostInclude;
	}
	public void setServiceCostInclude(String serviceCostInclude) {
		this.serviceCostInclude = serviceCostInclude;
	}
	public Date getServiceStartDate() {
		return serviceStartDate;
	}
	public void setServiceStartDate(Date serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}
	public Date getServiceEndDate() {
		return serviceEndDate;
	}
	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}
	public String getSchoolRegion() {
		return schoolRegion;
	}
	public void setSchoolRegion(String schoolRegion) {
		this.schoolRegion = schoolRegion;
	}
	public String getSchoolNameByCN() {
		return schoolNameByCN;
	}
	public void setSchoolNameByCN(String schoolNameByCN) {
		this.schoolNameByCN = schoolNameByCN;
	}
	public String getMajoyNameByCN() {
		return majoyNameByCN;
	}
	public void setMajoyNameByCN(String majoyNameByCN) {
		this.majoyNameByCN = majoyNameByCN;
	}
	public String getSchoolNameByROK() {
		return schoolNameByROK;
	}
	public void setSchoolNameByROK(String schoolNameByROK) {
		this.schoolNameByROK = schoolNameByROK;
	}
	public String getMajoyNameByROK() {
		return majoyNameByROK;
	}
	public void setMajoyNameByROK(String majoyNameByROK) {
		this.majoyNameByROK = majoyNameByROK;
	}
	public String getGoodAtMajoy() {
		return goodAtMajoy;
	}
	public void setGoodAtMajoy(String goodAtMajoy) {
		this.goodAtMajoy = goodAtMajoy;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Integer getServiceHour() {
		return serviceHour;
	}
	public void setServiceHour(Integer serviceHour) {
		this.serviceHour = serviceHour;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}

	
	
	
}
