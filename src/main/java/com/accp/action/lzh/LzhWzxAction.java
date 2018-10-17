package com.accp.action.lzh;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lzh.LzhWzxBiz;
import com.accp.pojo.koreanaddress;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/lzh/wzx")
public class LzhWzxAction {
	@Autowired
	private LzhWzxBiz biz; 
	
	//查询自驾游所有店铺
	@GetMapping("queryWzxAll")
	//第几页 几条数据  那个级别  哪个城市  标题
	public String queryWzxAll(Integer page,Integer size,Integer stid,Integer cityID,String title,String serviceStartDate,String serviceEndDate,Integer jiage,Model model,HttpSession session){
		List<sharea> city=biz.queryWzxCity() ;			//城市
		List<servicelevel> level=biz.queryWzxLevel();			//级别
		   //级别和城市查询,标题查询
		model.addAttribute("stid",stid);
		model.addAttribute("cityID",cityID);
		if(stid==null&&cityID==null&&title==null&&serviceStartDate==null&&serviceEndDate==null&&jiage==null) {
			PageInfo<LzhVo> pageInfo = biz.queryWzxAll(page, size); //查询所有的微整形
			model.addAttribute("pageInfo",pageInfo);			
		}else if(stid!=null||cityID!=null||title!=null||serviceStartDate!=null||serviceEndDate!=null){
			PageInfo<LzhVo>  pageInfos= biz.queryByWzxCiLe(stid,cityID,title,serviceStartDate,serviceEndDate, page, size);//级别和城市查询,标题查询
			model.addAttribute("pageInfo",pageInfos);
		}else if(jiage!=null) {
			model.addAttribute("jiage",jiage);
			PageInfo<LzhVo>  pageInfoas= biz.queryByJiage(jiage,page,size);
			model.addAttribute("pageInfo",pageInfoas);
		}
		model.addAttribute("city",city);
		model.addAttribute("level",level);
		return "Wzx";
	}
	@GetMapping("queryWzxDetails")
	public String queryWzxDetails(Integer serviceId,Model model) {
		LzhZjyVo details= biz.queryWzxDetails(serviceId);
		PageInfo<LzhZjyVo> pj = biz.queryWzxPj(1, 1);
		model.addAttribute("pj", pj);
		model.addAttribute("details",details);
		return "Wzxdetails";
	}
}
