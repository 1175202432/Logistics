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
@TableName("route")
public class Route implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 路线编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 出发地
     */
    private String departure;

    /**
     * 目的地
     */
    private String destination;

    /**
     * 行驶路线长度(km)
     */
    private Float distance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Route{" +
        "id=" + id +
        ", departure=" + departure +
        ", destination=" + destination +
        ", distance=" + distance +
        "}";
    }
}
