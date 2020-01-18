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
@TableName("warehouse")
public class Warehouse implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 仓库编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库名称
     */
    private String name;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 仓库载量(体积)
     */
    private Float load;

    /**
     * 仓库状态(0.可入库 1.已满)
     */
    private Integer state;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getLoad() {
        return load;
    }

    public void setLoad(Float load) {
        this.load = load;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        "id=" + id +
        ", name=" + name +
        ", address=" + address +
        ", load=" + load +
        ", state=" + state +
        "}";
    }
}
