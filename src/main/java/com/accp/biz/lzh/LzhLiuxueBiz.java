package com.accp.biz.lzh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lzh.LzhLiuxueDao;
import com.accp.dao.lzh.LzhWzxDao;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LzhLiuxueBiz {
	@Autowired
	private LzhLiuxueDao dao;
	
	//分页查询留学所有
	public PageInfo<LzhVo> queryLiuxueAll(Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryLiuxueAll());
	}
	//查询所有韩国的城市
	public List<sharea> queryLiuxueCity(){
		return dao.queryLiuxueCity();
	}
	//查询留学的级别
	public List<servicelevel> queryLiuxueLevel(){
		return dao.queryLiuxueLevel();
	}	
	//按价格查询
		public  PageInfo<LzhVo> queryByJiage(Integer jiage,Integer page, Integer size){
			PageHelper.startPage(page, size);
			return new PageInfo<LzhVo>(dao.queryByJiage(jiage));
		}
	//级别和城市查询
	public PageInfo<LzhVo> queryByLiuxueCiLe(Integer stid,String title,Integer page, Integer size){
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByLiuxueCiLe(stid,title));
	}			
	//查询留学详情
	public LzhZjyVo queryLiuxueDetails( Integer serviceId) {
		return dao.queryLiuxueDetails(serviceId);
	}
	public int queryLiuxueCollection(Integer userid) {		//查询自驾游是否已经收藏
		return dao.queryLiuxueCollection(userid);
		
	}
	public PageInfo<LzhZjyVo> queryLiuxuePj(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhZjyVo>(dao.queryLiuxuePj());
	}
}
