package com.accp.dao.lzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.merchantcollection;

import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;

public interface LzhZjyDao {
	public List<LzhVo> queryZjyAll();    			 //查询所有自驾游

	public List<sharea> queryZjyCity();		//查询韩国的城市

	public List<servicelevel> queryZjyLevel();		//查询自驾游的级别   铜牌 银牌...
	
	public List<LzhVo> queryByCiLe(@Param("stid") Integer stid,@Param("cityID") Integer cityID,@Param("title") String title,@Param("serviceStartDate") String serviceStartDate,@Param("serviceEndDate") String serviceEndDate);  //级别和城市查询
			
	public  List<LzhVo> queryByJiage(@Param("jiage") Integer jiage);		//按价格查询
	
	public LzhZjyVo queryZjyDetails(@Param("serviceId") Integer serviceId);        //自驾游详情
	
	public int addZjyCollection(merchantcollection me);					//收藏自驾游
	
	public int queryZjyCollection(@Param("userid") Integer userid);		//查询自驾游是否已经收藏
	
	public List<LzhZjyVo> queryZjyPj();								//查询评价
	
	public int deleteCollection(@Param("userid")Integer userid);	  //已经收藏可以删除
}
