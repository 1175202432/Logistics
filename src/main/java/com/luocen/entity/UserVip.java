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
@TableName("user_vip")
public class UserVip implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * VIP用户编号
     */
    private String userId;

    /**
     * VIP用户账号
     */
    private String username;

    /**
     * VIP用户密码
     */
    private String password;

    /**
     * VIP状态(0.已到期 1.可用中)
     */
    private Integer state;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserVip{" +
        "userId=" + userId +
        ", username=" + username +
        ", password=" + password +
        ", state=" + state +
        "}";
    }
}
