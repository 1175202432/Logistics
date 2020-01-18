package com.luocen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("warehousing")
public class Warehousing implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 入库编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编号
     */
    private Integer warehouseId;

    /**
     * 入库货物
     */
    private String goodsId;

    /**
     * 货物数量
     */
    private Integer goodsNumber;

    /**
     * 入库安排时间
     */
    private LocalDateTime scheduleTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public LocalDateTime getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(LocalDateTime scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public String toString() {
        return "Warehousing{" +
        "id=" + id +
        ", warehouseId=" + warehouseId +
        ", goodsId=" + goodsId +
        ", goodsNumber=" + goodsNumber +
        ", scheduleTime=" + scheduleTime +
        "}";
    }
}
