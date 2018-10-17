package com.accp.biz.lzh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lzh.LzhFanyiDao;
import com.accp.pojo.servicelevel;
import com.accp.pojo.sharea;
import com.accp.vo.lzh.LzhVo;
import com.accp.vo.lzh.LzhZjyVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LzhFanyiBiz {
	@Autowired
	private LzhFanyiDao dao;

	// 分页查询翻译所有
	public PageInfo<LzhVo> queryFanyiAll(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryFanyiAll());
	}

	// 查询所有韩国的城市
	public List<sharea> queryFanyiCity() {
		return dao.queryFanyiCity();
	}

	// 查询翻译的级别
	public List<servicelevel> queryFanyiLevel() {
		return dao.queryFanyiLevel();
	}

	// 按价格查询
	public PageInfo<LzhVo> queryByJiage(Integer jiage, Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByJiage(jiage));
	}

	// 级别和城市查询
	public PageInfo<LzhVo> queryByFanyiCiLe(Integer stid, String title, Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhVo>(dao.queryByFanyiCiLe(stid, title));
	}

	// 查询翻译详情
	public LzhZjyVo queryFanyiDetails(Integer serviceId) {
		return dao.queryFanyiDetails(serviceId);
	}
	public int queryFanyiCollection(Integer userid) {		//查询自驾游是否已经收藏
		return dao.queryFanyiCollection(userid);
		
	}
	public PageInfo<LzhZjyVo> queryFanyiPj(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		return new PageInfo<LzhZjyVo>(dao.queryFanyiPj());
	}
}
