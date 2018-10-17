package com.accp.action.lzh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lzh.LzhZjyBiz;
import com.accp.pojo.koreanaddress;
import com.accp.pojo.merchantcollection;
import com.accp.pojo.postcollection;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/lzh")
public class LzhZjyAction {

	@Autowired
	private LzhZjyBiz biz;

	// 查询自驾游所有店铺
	@GetMapping("queryZjyAll")
	// 第几页 几条数据 那个级别 哪个城市 标题
	public String queryZjyAll(Integer page, Integer size, Integer stid, Integer cityID, String title,
		String serviceStartDate, String serviceEndDate, Integer jiage, Model model, HttpSession session) {
		List<sharea> city = biz.queryZjyCity(); // 城市
		List<servicelevel> level = biz.queryZjyLevel(); // 级别
		model.addAttribute("stid", stid);
		model.addAttribute("cityID", cityID);
		if (stid == null && cityID == null && title == null && serviceStartDate == null && serviceEndDate == null
				&& jiage == null) {
			PageInfo<LzhVo> pageInfo = biz.queryZjyAll(page, size); // 查询所有的自驾游
			model.addAttribute("pageInfo", pageInfo);
		} else if (stid != null || cityID != null || title != null || serviceStartDate != null
				|| serviceEndDate != null) {
			PageInfo<LzhVo> pageInfos = biz.queryByCiLe(stid, cityID, title, serviceStartDate, serviceEndDate, page,
					size); // 级别和城市查询,标题查询
			model.addAttribute("pageInfo", pageInfos);
		} else if (jiage != null) {
			model.addAttribute("jiage", jiage);
			PageInfo<LzhVo> pageInfoas = biz.queryByJiage(jiage, page, size);
			model.addAttribute("pageInfo", pageInfoas);
		}
		model.addAttribute("city", city);
		model.addAttribute("level", level);
		return "zjy";
	}

	// 查询详情
	@GetMapping("queryZjyDetails")
	public String queryZjyDetails(Integer serviceId, Integer page, Integer size, Model model) {
		LzhZjyVo details = biz.queryZjyDetails(serviceId);
		PageInfo<LzhZjyVo> pj = biz.queryZjyPj(1, 1);
		model.addAttribute("pj", pj);
		model.addAttribute("details", details);
		return "Zjydetails";
	}

	// 添加收藏
	@PostMapping("addZjyCollection")
	public Map<String, String> addZjyCollection(Integer merchantorservicebyid, String merchantorservicebyname,
			Integer collecttype, HttpSession ssession) {
		HashMap<String, String> message = new HashMap<String, String>();
		int pd = biz.queryZjyCollection(1);
		if (pd > 0) {
			message.put("codes", "改商品你已收藏过");
		} else {
			merchantcollection me = new merchantcollection(0, 0, merchantorservicebyid, merchantorservicebyname,
					collecttype);
			int count = biz.addZjyCollection(me);
			if (count > 0) {
				message.put("code", "200");
			} else {

			}
		}
		return message;
	}

}
