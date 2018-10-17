package com.accp.dao.lzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.postcollection;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;

public interface LzhLiuxueDao {
	public List<LzhVo> queryLiuxueAll();    			 //查询所有留学

	public List<sharea> queryLiuxueCity();		//查询韩国的城市

	public List<servicelevel> queryLiuxueLevel();		//查询留学的级别
	
	public List<LzhVo> queryByLiuxueCiLe(@Param("stid") Integer stid,@Param("title") String title);  //级别和城市查询
			
	public  List<LzhVo> queryByJiage(@Param("jiage") Integer jiage);		//按价格查询
	
	public List<LzhVo> queryByLiuxueTitle(@Param("title") String title);		//根据标题查询留学
	
	public LzhZjyVo queryLiuxueDetails(@Param("serviceId") Integer serviceId);        //留学详情
	
	public int addLiuxueCollection(postcollection po);//收藏留学
	
public int queryLiuxueCollection(@Param("userid") Integer userid);		//查询自驾游是否已经收藏
	
	public List<LzhZjyVo> queryLiuxuePj();		
}
