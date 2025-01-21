package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjifenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjifenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjifenxiView;


/**
 * 成绩分析
 *
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public interface ChengjifenxiService extends IService<ChengjifenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjifenxiVO> selectListVO(Wrapper<ChengjifenxiEntity> wrapper);
   	
   	ChengjifenxiVO selectVO(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
   	
   	List<ChengjifenxiView> selectListView(Wrapper<ChengjifenxiEntity> wrapper);
   	
   	ChengjifenxiView selectView(@Param("ew") Wrapper<ChengjifenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjifenxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChengjifenxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChengjifenxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChengjifenxiEntity> wrapper);
}

