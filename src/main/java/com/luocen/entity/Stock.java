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
@TableName("stock")
public class Stock implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 库存编号
     */
    private String stockId;

    /**
     * 库存仓库
     */
    private Integer warehouseId;

    /**
     * 库存货物
     */
    private String goodsId;

    /**
     * 库存类别
     */
    private String category;

    /**
     * 入库时间
     */
    private LocalDateTime createTime;


    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Stock{" +
        "stockId=" + stockId +
        ", warehouseId=" + warehouseId +
        ", goodsId=" + goodsId +
        ", category=" + category +
        ", createTime=" + createTime +
        "}";
    }
}
