package com.accp.dao.lzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.postcollection;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;

public interface LzhFanyiDao {
	public List<LzhVo> queryFanyiAll();    			 //查询所有翻译

	public List<sharea> queryFanyiCity();		//查询韩国的城市

	public List<servicelevel> queryFanyiLevel();		//查询翻译的级别
	
	public List<LzhVo> queryByFanyiCiLe(@Param("stid") Integer stid,@Param("title") String title);  //级别和城市查询
			
	public  List<LzhVo> queryByJiage(@Param("jiage") Integer jiage);		//按价格查询
	
	public LzhZjyVo queryFanyiDetails(@Param("serviceId") Integer serviceId);        //翻译详情
	
	public int addFanyiCollection(postcollection po);//收藏翻译
	
public int queryFanyiCollection(@Param("userid") Integer userid);		//查询自驾游是否已经收藏
	
	public List<LzhZjyVo> queryFanyiPj();	
}
