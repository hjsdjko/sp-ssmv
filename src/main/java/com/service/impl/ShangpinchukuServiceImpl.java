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


import com.dao.ShangpinchukuDao;
import com.entity.ShangpinchukuEntity;
import com.service.ShangpinchukuService;
import com.entity.vo.ShangpinchukuVO;
import com.entity.view.ShangpinchukuView;

@Service("shangpinchukuService")
public class ShangpinchukuServiceImpl extends ServiceImpl<ShangpinchukuDao, ShangpinchukuEntity> implements ShangpinchukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinchukuEntity> page = this.selectPage(
                new Query<ShangpinchukuEntity>(params).getPage(),
                new EntityWrapper<ShangpinchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinchukuEntity> wrapper) {
		  Page<ShangpinchukuView> page =new Query<ShangpinchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinchukuVO> selectListVO(Wrapper<ShangpinchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinchukuVO selectVO(Wrapper<ShangpinchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinchukuView> selectListView(Wrapper<ShangpinchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinchukuView selectView(Wrapper<ShangpinchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
