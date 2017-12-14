package com.lanou.proprietor.bean;

import java.util.List;

/**
 * Created by dllo on 17/12/12.
 */
public class CarSpace {

    private int id; // 主键id
    private String garageName; //车库名称
    private String garageAddress;// 车库地址
    private int lastNum; // 剩余数量
    private String costType; // 出租类型
    private Double rentCost; // 出租金额

//    持有用户的集合
    private List<Customer> customerList;


    public CarSpace() {
    }

    public CarSpace(int id, String garageName, String garageAddress, int lastNum, String costType, Double rentCost) {
        this.id = id;
        this.garageName = garageName;
        this.garageAddress = garageAddress;
        this.lastNum = lastNum;
        this.costType = costType;
        this.rentCost = rentCost;
    }

    @Override
    public String toString() {
        return "CarSpace{" +
                "id=" + id +
                ", garageName='" + garageName + '\'' +
                ", garageAddress='" + garageAddress + '\'' +
                ", lastNum=" + lastNum +
                ", costType='" + costType + '\'' +
                ", rentCost=" + rentCost +
                '}';
    }

    public int getId() {
        return id;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public String getGarageAddress() {
        return garageAddress;
    }

    public void setGarageAddress(String garageAddress) {
        this.garageAddress = garageAddress;
    }

    public int getLastNum() {
        return lastNum;
    }

    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }
}
