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
@TableName("role")
public class Role implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 职位编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 职位名称
     */
    private String name;

    /**
     * 职位权限
     */
    private String power;


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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Role{" +
        "id=" + id +
        ", name=" + name +
        ", power=" + power +
        "}";
    }
}
