package com.luocen.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    @TableId(type=IdType.ASSIGN_UUID)
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * VIP(是否为VIP用户)
     */
    private Integer vip;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh-mm-ss")
    private Timestamp createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", phone=" + phone +
        ", vip=" + vip +
        ", createTime=" + createTime +
        "}";
    }
}
