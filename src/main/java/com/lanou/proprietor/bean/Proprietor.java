package com.lanou.proprietor.bean;

import java.sql.Timestamp;

/**
 * Created by dllo on 17/12/6.
 */
public class Proprietor {

    private int id; // 主键id
    private String proName; // 户主名
    private String gender; // 户主性别
    private String telephone; // 户主电话
    private String carMessage; // 车辆信息
    private Timestamp createTime; // 开户时间
    private int state; // 业主入住状态 1为入住 0为户
    private Timestamp overTime; // 出户时间
    private String address; // 户主地址
    private String remark; //备注

    public Proprietor() {
    }

    public Proprietor(int id, String proName, String gender, String telephone, String carMessage, Timestamp createTime, int state, Timestamp overTime, String address, String remark) {
        this.id = id;
        this.proName = proName;
        this.gender = gender;
        this.telephone = telephone;
        this.carMessage = carMessage;
        this.createTime = createTime;
        this.state = state;
        this.overTime = overTime;
        this.address = address;
        this.remark = remark;
    }

    public Proprietor(String proName, String gender, String telephone, String carMessage, Timestamp createTime, int state, Timestamp overTime, String address, String remark) {
        this.proName = proName;
        this.gender = gender;
        this.telephone = telephone;
        this.carMessage = carMessage;
        this.createTime = createTime;
        this.state = state;
        this.overTime = overTime;
        this.address = address;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Proprietor{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", carMessage='" + carMessage + '\'' +
                ", createTime=" + createTime +
                ", state=" + state +
                ", overTime=" + overTime +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCarMessage() {
        return carMessage;
    }

    public void setCarMessage(String carMessage) {
        this.carMessage = carMessage;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Timestamp getOverTime() {
        return overTime;
    }

    public void setOverTime(Timestamp overTime) {
        this.overTime = overTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
