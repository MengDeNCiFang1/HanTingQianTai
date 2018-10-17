package com.accp.dao.lzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.koreanaddress;
import com.accp.pojo.postcollection;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;

public interface LzhWzxDao {

	public List<LzhVo> queryWzxAll();    			 //查询所有微整形

	public List<sharea> queryWzxCity();		//查询微整形韩国的城市

	public List<servicelevel> queryWzxLevel();		//查询微整形的级别   .
	
	public List<LzhVo> queryByWzxCiLe(@Param("stid") Integer stid,@Param("cityID") Integer cityID,@Param("title") String title,@Param("serviceStartDate") String serviceStartDate,@Param("serviceEndDate") String serviceEndDate);  //级别和城市查询
			
	public  List<LzhVo> queryByJiage(@Param("jiage") Integer jiage);		//按价格查询
	
	public List<LzhVo> queryWzxDate(@Param("openDate")String openDate, @Param("closeDate") String closeDate);		//开始和结束时间查询微整形
	
	public LzhZjyVo queryWzxDetails(@Param("serviceId") Integer serviceId);        //微整形详情
	
	public int addWzxCollection(postcollection po);//收藏微整形
	
	public int queryWzxCollection(@Param("userid") Integer userid);		//查询自驾游是否已经收藏
	
	public List<LzhZjyVo> queryWzxPj();				
}
