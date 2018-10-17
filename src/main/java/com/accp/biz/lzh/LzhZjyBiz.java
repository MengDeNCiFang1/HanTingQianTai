package com.accp.biz.lzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lzh.LzhZjyDao;
import com.accp.pojo.koreanaddress;
import com.accp.pojo.merchantcollection;
import com.accp.pojo.postcollection;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LzhZjyBiz {

	@Autowired
	private LzhZjyDao dao;
	
	//分页查询自驾游所有
	public PageInfo<LzhVo> queryZjyAll(Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryZjyAll());
	}
	//查询所有韩国的城市
	public List<sharea> queryZjyCity(){
		return dao.queryZjyCity();
	}
	//查询自驾游的级别   铜牌 银牌...
	public List<servicelevel> queryZjyLevel(){
		return dao.queryZjyLevel();
	}	
	
	//级别和城市查询标题，开始结束时间
	public PageInfo<LzhVo> queryByCiLe(Integer stid,Integer cityID,String title,String serviceStartDate,String serviceEndDate,Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByCiLe(stid,cityID,title,serviceStartDate,serviceEndDate));
	}		
	public PageInfo<LzhZjyVo> queryZjyPj(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhZjyVo>(dao.queryZjyPj());
	}
	//查询自驾游详情
	public LzhZjyVo queryZjyDetails( Integer serviceId) {
		return dao.queryZjyDetails(serviceId);
	}
	//按价格查询
	public  PageInfo<LzhVo> queryByJiage(Integer jiage,Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByJiage(jiage));
	}
	
	public int queryZjyCollection(Integer userid) {		//查询自驾游是否已经收藏
		return dao.queryZjyCollection(userid);
		
	}
	//收藏自驾游
	public int addZjyCollection(merchantcollection me) {
		return dao.addZjyCollection(me);
	}
}
