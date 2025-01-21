package com.dao;

import com.entity.ZhishiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishiziliaoVO;
import com.entity.view.ZhishiziliaoView;


/**
 * 知识资料
 * 
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public interface ZhishiziliaoDao extends BaseMapper<ZhishiziliaoEntity> {
	
	List<ZhishiziliaoVO> selectListVO(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
	
	ZhishiziliaoVO selectVO(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
	
	List<ZhishiziliaoView> selectListView(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);

	List<ZhishiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
	
	ZhishiziliaoView selectView(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
	

}
