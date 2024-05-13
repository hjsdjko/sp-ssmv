package com.entity.vo;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public class ShangpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 尺码
	 */
	
	private String chima;
		
	/**
	 * 颜色
	 */
	
	private String yanshe;
		
	/**
	 * 商品用途
	 */
	
	private String shangpinyongtu;
		
	/**
	 * 赠送对象
	 */
	
	private String zengsongduixiang;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：尺码
	 */
	 
	public void setchima(String chima) {
		this.chima = chima;
	}
	
	/**
	 * 获取：尺码
	 */
	public String getchima() {
		return chima;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setyanshe(String yanshe) {
		this.yanshe = yanshe;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getyanshe() {
		return yanshe;
	}
				
	
	/**
	 * 设置：商品用途
	 */
	 
	public void setShangpinyongtu(String shangpinyongtu) {
		this.shangpinyongtu = shangpinyongtu;
	}
	
	/**
	 * 获取：商品用途
	 */
	public String getShangpinyongtu() {
		return shangpinyongtu;
	}
				
	
	/**
	 * 设置：赠送对象
	 */
	 
	public void setZengsongduixiang(String zengsongduixiang) {
		this.zengsongduixiang = zengsongduixiang;
	}
	
	/**
	 * 获取：赠送对象
	 */
	public String getZengsongduixiang() {
		return zengsongduixiang;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
