package com.entity.model;

import com.entity.ZhishiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 知识资料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public class ZhishiziliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 知识分类
	 */
	
	private String zhishifenlei;
		
	/**
	 * 知识图片
	 */
	
	private String zhishitupian;
		
	/**
	 * 知识简介
	 */
	
	private String zhishijianjie;
		
	/**
	 * 知识视频
	 */
	
	private String zhishishipin;
		
	/**
	 * 资料文件
	 */
	
	private String ziliaowenjian;
		
	/**
	 * 内容详情
	 */
	
	private String neirongxiangqing;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
				
	
	/**
	 * 设置：知识分类
	 */
	 
	public void setZhishifenlei(String zhishifenlei) {
		this.zhishifenlei = zhishifenlei;
	}
	
	/**
	 * 获取：知识分类
	 */
	public String getZhishifenlei() {
		return zhishifenlei;
	}
				
	
	/**
	 * 设置：知识图片
	 */
	 
	public void setZhishitupian(String zhishitupian) {
		this.zhishitupian = zhishitupian;
	}
	
	/**
	 * 获取：知识图片
	 */
	public String getZhishitupian() {
		return zhishitupian;
	}
				
	
	/**
	 * 设置：知识简介
	 */
	 
	public void setZhishijianjie(String zhishijianjie) {
		this.zhishijianjie = zhishijianjie;
	}
	
	/**
	 * 获取：知识简介
	 */
	public String getZhishijianjie() {
		return zhishijianjie;
	}
				
	
	/**
	 * 设置：知识视频
	 */
	 
	public void setZhishishipin(String zhishishipin) {
		this.zhishishipin = zhishishipin;
	}
	
	/**
	 * 获取：知识视频
	 */
	public String getZhishishipin() {
		return zhishishipin;
	}
				
	
	/**
	 * 设置：资料文件
	 */
	 
	public void setZiliaowenjian(String ziliaowenjian) {
		this.ziliaowenjian = ziliaowenjian;
	}
	
	/**
	 * 获取：资料文件
	 */
	public String getZiliaowenjian() {
		return ziliaowenjian;
	}
				
	
	/**
	 * 设置：内容详情
	 */
	 
	public void setNeirongxiangqing(String neirongxiangqing) {
		this.neirongxiangqing = neirongxiangqing;
	}
	
	/**
	 * 获取：内容详情
	 */
	public String getNeirongxiangqing() {
		return neirongxiangqing;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
			
}
