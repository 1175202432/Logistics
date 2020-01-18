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
@TableName("truck")
public class Truck implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 货车车牌
     */
    private String no;

    /**
     * 货车名称
     */
    private String name;

    /**
     * 货车型号
     */
    private String type;

    /**
     * 货车负重
     */
    private Float freight;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getFreight() {
        return freight;
    }

    public void setFreight(Float freight) {
        this.freight = freight;
    }

    @Override
    public String toString() {
        return "Truck{" +
        "no=" + no +
        ", name=" + name +
        ", type=" + type +
        ", freight=" + freight +
        "}";
    }
}
