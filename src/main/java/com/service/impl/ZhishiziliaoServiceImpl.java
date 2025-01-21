package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhishiziliaoDao;
import com.entity.ZhishiziliaoEntity;
import com.service.ZhishiziliaoService;
import com.entity.vo.ZhishiziliaoVO;
import com.entity.view.ZhishiziliaoView;

@Service("zhishiziliaoService")
public class ZhishiziliaoServiceImpl extends ServiceImpl<ZhishiziliaoDao, ZhishiziliaoEntity> implements ZhishiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishiziliaoEntity> page = this.selectPage(
                new Query<ZhishiziliaoEntity>(params).getPage(),
                new EntityWrapper<ZhishiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishiziliaoEntity> wrapper) {
		  Page<ZhishiziliaoView> page =new Query<ZhishiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishiziliaoVO> selectListVO(Wrapper<ZhishiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishiziliaoVO selectVO(Wrapper<ZhishiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishiziliaoView> selectListView(Wrapper<ZhishiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishiziliaoView selectView(Wrapper<ZhishiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
