package com.accp.action.lzh;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lzh.LzhFanyiBiz;
import com.accp.biz.lzh.LzhLiuxueBiz;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/lzh/fanyi")
public class LzhFanyiAction {
	@Autowired
	private LzhFanyiBiz biz;

	// 查询翻译所有店铺
	@GetMapping("queryFanyiAll")
	// 第几页 几条数据 那个级别 哪个城市 标题
	public String queryFanyiAll(Integer page, Integer size, Integer stid, String title, Integer jiage, Model model,
			HttpSession session) {
		PageInfo<LzhVo> pageInfo = biz.queryFanyiAll(page, size); // 查询所有的翻译
		List<sharea> city = biz.queryFanyiCity(); // 城市
		List<servicelevel> level = biz.queryFanyiLevel(); // 级别
		PageInfo<LzhVo> pageInfos = biz.queryByFanyiCiLe(stid, title, page, size); // 级别和城市查询,标题查询
		model.addAttribute("stid", stid);
		if (stid == null && title == null && jiage == null) {
			model.addAttribute("pageInfo", pageInfo);
		} else if (stid != null || title != null) {
			model.addAttribute("pageInfo", pageInfos);
		} else if (jiage != null) {
			model.addAttribute("jiage", jiage);
			PageInfo<LzhVo> pageInfoas = biz.queryByJiage(jiage, page, size);
			model.addAttribute("pageInfo", pageInfoas);
		}
		model.addAttribute("city", city);
		model.addAttribute("level", level);
		return "Fanyi";
	}

	@GetMapping("queryFanyiDetails")
	public String queryFanyiDetails(Integer serviceId, Model model) {
		LzhZjyVo details = biz.queryFanyiDetails(serviceId);
		PageInfo<LzhZjyVo> pj = biz.queryFanyiPj(1, 1);
		model.addAttribute("pj", pj);
		model.addAttribute("details", details);
		return "Fanyidetails";
	}
}
