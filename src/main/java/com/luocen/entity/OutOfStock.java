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
 * @since 2020-01-07
 */
@TableName("out_of_stock")
public class OutOfStock implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 出库编号
     */
    private String id;

    /**
     * 仓库编号
     */
    private Integer warehouseId;

    /**
     * 运输车牌
     */
    private String truckNo;

    /**
     * 出库货物
     */
    private String goodsId;

    /**
     * 出库安排时间
     */
    private LocalDateTime outgoingTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(String truckNo) {
        this.truckNo = truckNo;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public LocalDateTime getOutgoingTime() {
        return outgoingTime;
    }

    public void setOutgoingTime(LocalDateTime outgoingTime) {
        this.outgoingTime = outgoingTime;
    }

    @Override
    public String toString() {
        return "OutOfStock{" +
        "id=" + id +
        ", warehouseId=" + warehouseId +
        ", truckNo=" + truckNo +
        ", goodsId=" + goodsId +
        ", outgoingTime=" + outgoingTime +
        "}";
    }
}
