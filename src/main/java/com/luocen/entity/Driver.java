package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@TableName("driver")
public class Driver implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 司机编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 司机姓名
     */
    private String name;

    /**
     * 司机驾照
     */
    private String driverLicense;

    /**
     * 司机电话
     */
    private String phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Driver{" +
        "id=" + id +
        ", name=" + name +
        ", driverLicense=" + driverLicense +
        ", phone=" + phone +
        "}";
    }
}
