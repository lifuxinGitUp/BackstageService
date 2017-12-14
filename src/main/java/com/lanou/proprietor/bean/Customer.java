package com.lanou.proprietor.bean;

import java.util.Date;

/**
 * Created by dllo on 17/12/13.
 */
public class Customer {

    private int cid; //主键id
    private String cName; //用户名
    private String carNum; //车牌号
    private Date startTime; //开始时间
    private Date endTime; // 结束时间
    private double yMoney; //余额
    private int id; //carSpace表中的主键

    public Customer() {
    }

    public Customer(int cid, String cName, String carNum, Date startTime, Date endTime, double yMoney, int id) {
        this.cid = cid;
        this.cName = cName;
        this.carNum = carNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.yMoney = yMoney;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", carNum='" + carNum + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", yMoney=" + yMoney +
                ", id=" + id +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getyMoney() {
        return yMoney;
    }

    public void setyMoney(double yMoney) {
        this.yMoney = yMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
