package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZuoyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 作业
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zuoye")
public class ZuoyeView extends ZuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 作业类型的值
	*/
	@ColumnInfo(comment="作业类型的字典表值",type="varchar(200)")
	private String zuoyeValue;

	//级联表 党课
		/**
		* 党课名称
		*/

		@ColumnInfo(comment="党课名称",type="varchar(200)")
		private String dangkeName;
		/**
		* 党课编号
		*/

		@ColumnInfo(comment="党课编号",type="varchar(200)")
		private String dangkeUuidNumber;
		/**
		* 党课照片
		*/

		@ColumnInfo(comment="党课照片",type="varchar(200)")
		private String dangkePhoto;
		/**
		* 党课地点
		*/

		@ColumnInfo(comment="党课地点",type="varchar(200)")
		private String dangkeAddress;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 党课类型
		*/
		@ColumnInfo(comment="党课类型",type="int(11)")
		private Integer dangkeTypes;
			/**
			* 党课类型的值
			*/
			@ColumnInfo(comment="党课类型的字典表值",type="varchar(200)")
			private String dangkeValue;
		/**
		* 参加人员
		*/

		@ColumnInfo(comment="参加人员",type="int(11)")
		private Integer dangkeKucunNumber;
		/**
		* 党课介绍
		*/

		@ColumnInfo(comment="党课介绍",type="longtext")
		private String dangkeContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer dangkeDelete;



	public ZuoyeView() {

	}

	public ZuoyeView(ZuoyeEntity zuoyeEntity) {
		try {
			BeanUtils.copyProperties(this, zuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 作业类型的值
	*/
	public String getZuoyeValue() {
		return zuoyeValue;
	}
	/**
	* 设置： 作业类型的值
	*/
	public void setZuoyeValue(String zuoyeValue) {
		this.zuoyeValue = zuoyeValue;
	}


	//级联表的get和set 党课

		/**
		* 获取： 党课名称
		*/
		public String getDangkeName() {
			return dangkeName;
		}
		/**
		* 设置： 党课名称
		*/
		public void setDangkeName(String dangkeName) {
			this.dangkeName = dangkeName;
		}

		/**
		* 获取： 党课编号
		*/
		public String getDangkeUuidNumber() {
			return dangkeUuidNumber;
		}
		/**
		* 设置： 党课编号
		*/
		public void setDangkeUuidNumber(String dangkeUuidNumber) {
			this.dangkeUuidNumber = dangkeUuidNumber;
		}

		/**
		* 获取： 党课照片
		*/
		public String getDangkePhoto() {
			return dangkePhoto;
		}
		/**
		* 设置： 党课照片
		*/
		public void setDangkePhoto(String dangkePhoto) {
			this.dangkePhoto = dangkePhoto;
		}

		/**
		* 获取： 党课地点
		*/
		public String getDangkeAddress() {
			return dangkeAddress;
		}
		/**
		* 设置： 党课地点
		*/
		public void setDangkeAddress(String dangkeAddress) {
			this.dangkeAddress = dangkeAddress;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 党课类型
		*/
		public Integer getDangkeTypes() {
			return dangkeTypes;
		}
		/**
		* 设置： 党课类型
		*/
		public void setDangkeTypes(Integer dangkeTypes) {
			this.dangkeTypes = dangkeTypes;
		}


			/**
			* 获取： 党课类型的值
			*/
			public String getDangkeValue() {
				return dangkeValue;
			}
			/**
			* 设置： 党课类型的值
			*/
			public void setDangkeValue(String dangkeValue) {
				this.dangkeValue = dangkeValue;
			}

		/**
		* 获取： 参加人员
		*/
		public Integer getDangkeKucunNumber() {
			return dangkeKucunNumber;
		}
		/**
		* 设置： 参加人员
		*/
		public void setDangkeKucunNumber(Integer dangkeKucunNumber) {
			this.dangkeKucunNumber = dangkeKucunNumber;
		}

		/**
		* 获取： 党课介绍
		*/
		public String getDangkeContent() {
			return dangkeContent;
		}
		/**
		* 设置： 党课介绍
		*/
		public void setDangkeContent(String dangkeContent) {
			this.dangkeContent = dangkeContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getDangkeDelete() {
			return dangkeDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setDangkeDelete(Integer dangkeDelete) {
			this.dangkeDelete = dangkeDelete;
		}


	@Override
	public String toString() {
		return "ZuoyeView{" +
			", zuoyeValue=" + zuoyeValue +
			", dangkeName=" + dangkeName +
			", dangkeUuidNumber=" + dangkeUuidNumber +
			", dangkePhoto=" + dangkePhoto +
			", dangkeAddress=" + dangkeAddress +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", dangkeKucunNumber=" + dangkeKucunNumber +
			", dangkeContent=" + dangkeContent +
			", dangkeDelete=" + dangkeDelete +
			"} " + super.toString();
	}
}