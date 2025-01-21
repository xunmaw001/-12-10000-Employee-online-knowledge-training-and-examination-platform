package com.dao;

import com.entity.ChengjifenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjifenxiVO;
import com.entity.view.ChengjifenxiView;


/**
 * 成绩分析
 * 
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public interface ChengjifenxiDao extends BaseMapper<ChengjifenxiEntity> {
	
	List<ChengjifenxiVO> selectListVO(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
	
	ChengjifenxiVO selectVO(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
	
	List<ChengjifenxiView> selectListView(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);

	List<ChengjifenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
	
	ChengjifenxiView selectView(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
}
