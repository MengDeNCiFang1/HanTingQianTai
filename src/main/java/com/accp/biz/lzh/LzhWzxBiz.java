package com.accp.biz.lzh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lzh.LzhWzxDao;
import com.accp.dao.lzh.LzhZjyDao;
import com.accp.pojo.koreanaddress;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LzhWzxBiz {
	@Autowired
	private LzhWzxDao dao;
	
	//分页查询微整形所有
	public PageInfo<LzhVo> queryWzxAll(Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryWzxAll());
	}
	//查询所有韩国的城市
	public List<sharea> queryWzxCity(){
		return dao.queryWzxCity();
	}
	//查询微整形的级别 
	public List<servicelevel> queryWzxLevel(){
		return dao.queryWzxLevel();
	}	
	
	//级别和城市查询
	public PageInfo<LzhVo> queryByWzxCiLe(Integer stid,Integer cityID,String title,String serviceStartDate,String serviceEndDate,Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByWzxCiLe(stid,cityID,title,serviceStartDate,serviceEndDate));
	}		
	//按价格查询
	public  PageInfo<LzhVo> queryByJiage(Integer jiage,Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByJiage(jiage));
	}
	
	//开始和结束时间查询微整形
	public List<LzhVo> queryWzxDate(String openDate, String closeDate){
		return dao.queryWzxDate(openDate,closeDate);
	}	
	//查询微整形详情
	public LzhZjyVo queryWzxDetails( Integer serviceId) {
		return dao.queryWzxDetails(serviceId);
	}
	public int queryWzxCollection(Integer userid) {		//查询自驾游是否已经收藏
		return dao.queryWzxCollection(userid);
		
	}
	public PageInfo<LzhZjyVo> queryWzxPj(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhZjyVo>(dao.queryWzxPj());
	}
}
