package com.udacity.jwdnd.c1.review.model;

public class TacoOrder {

    private Integer orderId;

    private String tacoName;

    private Double tacoPrice;

    private Integer count;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTacoName() {
        return tacoName;
    }

    public void setTacoName(String tacoName) {
        this.tacoName = tacoName;
    }

    public double getTacoPrice() {
        return tacoPrice;
    }

    public void setTacoPrice(Double tacoPrice) {
        this.tacoPrice = tacoPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int tacoCount) {
        this.count = count;
    }
}
