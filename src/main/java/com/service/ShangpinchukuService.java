package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinchukuView;


/**
 * 商品出库
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface ShangpinchukuService extends IService<ShangpinchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinchukuVO> selectListVO(Wrapper<ShangpinchukuEntity> wrapper);
   	
   	ShangpinchukuVO selectVO(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
   	
   	List<ShangpinchukuView> selectListView(Wrapper<ShangpinchukuEntity> wrapper);
   	
   	ShangpinchukuView selectView(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinchukuEntity> wrapper);
   	
}

