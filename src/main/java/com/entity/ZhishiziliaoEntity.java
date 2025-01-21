package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 知识资料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
@TableName("zhishiziliao")
public class ZhishiziliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhishiziliaoEntity() {
		
	}
	
	public ZhishiziliaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 知识标题
	 */
					
	private String zhishibiaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：知识标题
	 */
	public void setZhishibiaoti(String zhishibiaoti) {
		this.zhishibiaoti = zhishibiaoti;
	}
	/**
	 * 获取：知识标题
	 */
	public String getZhishibiaoti() {
		return zhishibiaoti;
	}
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
