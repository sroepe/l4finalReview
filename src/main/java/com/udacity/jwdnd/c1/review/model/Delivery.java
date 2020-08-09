package com.udacity.jwdnd.c1.review.model;

import java.sql.Timestamp;
import java.util.Date;

public class Delivery {

    private Integer id;

    private Integer orderId;

    private Timestamp time;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
