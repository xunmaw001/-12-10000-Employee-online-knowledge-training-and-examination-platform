package com.entity.vo;

import com.entity.ChengjifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 成绩分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-03 14:04:59
 */
public class ChengjifenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 优秀人数
	 */
	
	private Integer youxiurenshu;
		
	/**
	 * 优秀率
	 */
	
	private String youxiulv;
		
	/**
	 * 良好人数
	 */
	
	private Integer lianghaorenshu;
		
	/**
	 * 良好率
	 */
	
	private String lianghaolv;
		
	/**
	 * 合格人数
	 */
	
	private Integer hegerenshu;
		
	/**
	 * 合格率
	 */
	
	private String hegelv;
		
	/**
	 * 不及格人数
	 */
	
	private Integer bujigerenshu;
		
	/**
	 * 不及格率
	 */
	
	private String bujigelv;
		
	/**
	 * 整体情况
	 */
	
	private String zhengtiqingkuang;
		
	/**
	 * 成绩分析
	 */
	
	private String chengjifenxi;
		
	/**
	 * 添加日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiariqi;
				
	
	/**
	 * 设置：优秀人数
	 */
	 
	public void setYouxiurenshu(Integer youxiurenshu) {
		this.youxiurenshu = youxiurenshu;
	}
	
	/**
	 * 获取：优秀人数
	 */
	public Integer getYouxiurenshu() {
		return youxiurenshu;
	}
				
	
	/**
	 * 设置：优秀率
	 */
	 
	public void setYouxiulv(String youxiulv) {
		this.youxiulv = youxiulv;
	}
	
	/**
	 * 获取：优秀率
	 */
	public String getYouxiulv() {
		return youxiulv;
	}
				
	
	/**
	 * 设置：良好人数
	 */
	 
	public void setLianghaorenshu(Integer lianghaorenshu) {
		this.lianghaorenshu = lianghaorenshu;
	}
	
	/**
	 * 获取：良好人数
	 */
	public Integer getLianghaorenshu() {
		return lianghaorenshu;
	}
				
	
	/**
	 * 设置：良好率
	 */
	 
	public void setLianghaolv(String lianghaolv) {
		this.lianghaolv = lianghaolv;
	}
	
	/**
	 * 获取：良好率
	 */
	public String getLianghaolv() {
		return lianghaolv;
	}
				
	
	/**
	 * 设置：合格人数
	 */
	 
	public void setHegerenshu(Integer hegerenshu) {
		this.hegerenshu = hegerenshu;
	}
	
	/**
	 * 获取：合格人数
	 */
	public Integer getHegerenshu() {
		return hegerenshu;
	}
				
	
	/**
	 * 设置：合格率
	 */
	 
	public void setHegelv(String hegelv) {
		this.hegelv = hegelv;
	}
	
	/**
	 * 获取：合格率
	 */
	public String getHegelv() {
		return hegelv;
	}
				
	
	/**
	 * 设置：不及格人数
	 */
	 
	public void setBujigerenshu(Integer bujigerenshu) {
		this.bujigerenshu = bujigerenshu;
	}
	
	/**
	 * 获取：不及格人数
	 */
	public Integer getBujigerenshu() {
		return bujigerenshu;
	}
				
	
	/**
	 * 设置：不及格率
	 */
	 
	public void setBujigelv(String bujigelv) {
		this.bujigelv = bujigelv;
	}
	
	/**
	 * 获取：不及格率
	 */
	public String getBujigelv() {
		return bujigelv;
	}
				
	
	/**
	 * 设置：整体情况
	 */
	 
	public void setZhengtiqingkuang(String zhengtiqingkuang) {
		this.zhengtiqingkuang = zhengtiqingkuang;
	}
	
	/**
	 * 获取：整体情况
	 */
	public String getZhengtiqingkuang() {
		return zhengtiqingkuang;
	}
				
	
	/**
	 * 设置：成绩分析
	 */
	 
	public void setChengjifenxi(String chengjifenxi) {
		this.chengjifenxi = chengjifenxi;
	}
	
	/**
	 * 获取：成绩分析
	 */
	public String getChengjifenxi() {
		return chengjifenxi;
	}
				
	
	/**
	 * 设置：添加日期
	 */
	 
	public void setTianjiariqi(Date tianjiariqi) {
		this.tianjiariqi = tianjiariqi;
	}
	
	/**
	 * 获取：添加日期
	 */
	public Date getTianjiariqi() {
		return tianjiariqi;
	}
			
}
