package com.entity.vo;

import com.entity.GongzuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 党务工作者
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuo")
public class GongzuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 党务工作者姓名
     */

    @TableField(value = "gongzuo_name")
    private String gongzuoName;


    /**
     * 党务工作者手机号
     */

    @TableField(value = "gongzuo_phone")
    private String gongzuoPhone;


    /**
     * 党务工作者身份证号
     */

    @TableField(value = "gongzuo_id_number")
    private String gongzuoIdNumber;


    /**
     * 党务工作者头像
     */

    @TableField(value = "gongzuo_photo")
    private String gongzuoPhoto;


    /**
     * 申请状态
     */

    @TableField(value = "shenqing_yuyue_types")
    private Integer shenqingYuyueTypes;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "gongzuo_email")
    private String gongzuoEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：党务工作者姓名
	 */
    public String getGongzuoName() {
        return gongzuoName;
    }


    /**
	 * 获取：党务工作者姓名
	 */

    public void setGongzuoName(String gongzuoName) {
        this.gongzuoName = gongzuoName;
    }
    /**
	 * 设置：党务工作者手机号
	 */
    public String getGongzuoPhone() {
        return gongzuoPhone;
    }


    /**
	 * 获取：党务工作者手机号
	 */

    public void setGongzuoPhone(String gongzuoPhone) {
        this.gongzuoPhone = gongzuoPhone;
    }
    /**
	 * 设置：党务工作者身份证号
	 */
    public String getGongzuoIdNumber() {
        return gongzuoIdNumber;
    }


    /**
	 * 获取：党务工作者身份证号
	 */

    public void setGongzuoIdNumber(String gongzuoIdNumber) {
        this.gongzuoIdNumber = gongzuoIdNumber;
    }
    /**
	 * 设置：党务工作者头像
	 */
    public String getGongzuoPhoto() {
        return gongzuoPhoto;
    }


    /**
	 * 获取：党务工作者头像
	 */

    public void setGongzuoPhoto(String gongzuoPhoto) {
        this.gongzuoPhoto = gongzuoPhoto;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getShenqingYuyueTypes() {
        return shenqingYuyueTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setShenqingYuyueTypes(Integer shenqingYuyueTypes) {
        this.shenqingYuyueTypes = shenqingYuyueTypes;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getGongzuoEmail() {
        return gongzuoEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setGongzuoEmail(String gongzuoEmail) {
        this.gongzuoEmail = gongzuoEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
