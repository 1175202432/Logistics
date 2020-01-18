package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-08
 */
@TableName("delivery")
public class Delivery implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 配送单编号
     */
    private String id;

    /**
     * 配送订单号
     */
    private String orderId;

    /**
     * 配送司机
     */
    private String empId;

    /**
     * 配送车牌号
     */
    private String truckNo;

    /**
     * 货物跟踪
     */
    private String gps;

    /**
     * 配送状态(0未完成 1已完成)
     */
    private Integer state;

    /**
     * 配送时间
     */
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(String truckNo) {
        this.truckNo = truckNo;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Delivery{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", empId=" + empId +
        ", truckNo=" + truckNo +
        ", gps=" + gps +
        ", state=" + state +
        ", createTime=" + createTime +
        "}";
    }
}
