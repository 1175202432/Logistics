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
@TableName("orders")
public class Orders implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 订单号
     */
    private String id;

    /**
     * 客户编号
     */
    private String userId;

    /**
     * 配送路线
     */
    private Integer routeId;

    /**
     * 配送车牌
     */
    private Integer truckNo;

    /**
     * 送达地点
     */
    private String delivery;

    /**
     * 订单金额
     */
    private Float price;

    /**
     * 订单状态(0.未派送 1.派送中 3.已送达)
     */
    private Integer statue;

    /**
     * 订单日期
     */
    @TableField("createTime")
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(Integer truckNo) {
        this.truckNo = truckNo;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
        "id=" + id +
        ", userId=" + userId +
        ", routeId=" + routeId +
        ", truckNo=" + truckNo +
        ", delivery=" + delivery +
        ", price=" + price +
        ", statue=" + statue +
        ", createTime=" + createTime +
        "}";
    }
}
