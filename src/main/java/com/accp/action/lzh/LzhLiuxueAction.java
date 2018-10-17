package com.accp.action.lzh;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lzh.LzhLiuxueBiz;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/lzh/liuxue")
public class LzhLiuxueAction {
	@Autowired
	private LzhLiuxueBiz biz; 
	
	//查询留学所有店铺
	@GetMapping("queryLiuxueAll")
	//第几页 几条数据  那个级别  哪个城市  标题
	public String queryLiuxueAll(Integer page,Integer size,Integer stid,String title,Integer jiage,Model model,HttpSession session){
		PageInfo<LzhVo> pageInfo = biz.queryLiuxueAll(page, size); //查询所有的留学
		List<sharea> city=biz.queryLiuxueCity() ;			//城市
		List<servicelevel> level=biz.queryLiuxueLevel();			//级别
		PageInfo<LzhVo>  pageInfos= biz.queryByLiuxueCiLe(stid,title, page, size);		    //级别和城市查询,标题查询
		model.addAttribute("stid",stid);
		if(stid==null&&title==null&&jiage==null) {
			model.addAttribute("pageInfo",pageInfo);			
		}else if(stid!=null||title!=null){
			model.addAttribute("pageInfo",pageInfos);
		}else if(jiage!=null) {
			model.addAttribute("jiage",jiage);
			PageInfo<LzhVo>  pageInfoas= biz.queryByJiage(jiage,page,size);
			model.addAttribute("pageInfo",pageInfoas);
		}
		model.addAttribute("city",city);
		model.addAttribute("level",level);
		return "Liuxue";
	}
	@GetMapping("queryLiuxueDetails")
	public String queryLiuxueDetails(Integer serviceId,Model model) {
		LzhZjyVo details= biz.queryLiuxueDetails(serviceId);
		PageInfo<LzhZjyVo> pj = biz.queryLiuxuePj(1, 1);
		model.addAttribute("pj", pj);
		model.addAttribute("details",details);
		return "Liuxuedetails";
	}
}
