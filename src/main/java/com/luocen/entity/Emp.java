package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@TableName("emp")
public class Emp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 员工编号
     */
    private String id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工账号
     */
    private String empname;

    /**
     * 员工密码
     */
    private String password;

    /**
     * 员工职位
     */
    private String role;

    /**
     * 员工性别(1男2女)
     */
    private Integer sex;

    /**
     * 员工电话
     */
    private String phone;

    /**
     * 员工住址
     */
    private String address;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;


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

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "id=" + id +
        ", name=" + name +
        ", empname=" + empname +
        ", password=" + password +
        ", role=" + role +
        ", sex=" + sex +
        ", phone=" + phone +
        ", address=" + address +
        ", createTime=" + createTime +
        "}";
    }
}
