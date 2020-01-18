package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 货物编号
     */
    private String id;

    /**
     * 货物名称
     */
    private String name;

    /**
     * 货物重量kg(单个)
     */
    private Float weight;

    /**
     * 货物数量
     */
    private Float number;

    /**
     * 货物订单
     */
    private String ordersId;


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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "id=" + id +
        ", name=" + name +
        ", weight=" + weight +
        ", number=" + number +
        ", ordersId=" + ordersId +
        "}";
    }
}
