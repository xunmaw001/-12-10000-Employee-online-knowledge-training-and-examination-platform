package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishiziliaoView;


/**
 * 知识资料
 *
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public interface ZhishiziliaoService extends IService<ZhishiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishiziliaoVO> selectListVO(Wrapper<ZhishiziliaoEntity> wrapper);
   	
   	ZhishiziliaoVO selectVO(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
   	
   	List<ZhishiziliaoView> selectListView(Wrapper<ZhishiziliaoEntity> wrapper);
   	
   	ZhishiziliaoView selectView(@Param("ew") Wrapper<ZhishiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishiziliaoEntity> wrapper);
   	

}

