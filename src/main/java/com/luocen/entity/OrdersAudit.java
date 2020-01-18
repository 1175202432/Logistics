package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Luocen
 * @since 2020-01-07
 */
@TableName("orders_audit")
public class OrdersAudit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 审核订单编号
     */
    private String auditId;

    /**
     * 订单编号
     */
    private String ordersId;

    /**
     * 审核人编号
     */
    private String empId;

    /**
     * 审核状态(0.未审核 1审核通过)
     */
    private Integer statue;

    /**
     * 审核时间
     */
    private LocalDate suditTime;


    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public LocalDate getSuditTime() {
        return suditTime;
    }

    public void setSuditTime(LocalDate suditTime) {
        this.suditTime = suditTime;
    }

    @Override
    public String toString() {
        return "OrdersAudit{" +
        "auditId=" + auditId +
        ", ordersId=" + ordersId +
        ", empId=" + empId +
        ", statue=" + statue +
        ", suditTime=" + suditTime +
        "}";
    }
}
