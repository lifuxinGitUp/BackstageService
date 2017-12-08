package com.lanou.admin.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
public class Admin {
    private int adminId;
    private String adminLoginName;
    private String adminLoginPwd;
    private String adminSalt;
    private String adminLoginPwd2;
    private String adminGender;
    private String adminPhone;
    private String adminEmail;
    private String adminContent;
    private int adminState;
    private Date adminJoinTime;

    private Role role;

    public Admin(String adminLoginName, String adminLoginPwd, String adminLoginPwd2, String adminGender, String adminPhone, String adminEmail, String adminContent, int adminState, Date adminJoinTime) {
        this.adminLoginName = adminLoginName;
        this.adminLoginPwd = adminLoginPwd;
        this.adminLoginPwd2 = adminLoginPwd2;
        this.adminGender = adminGender;
        this.adminPhone = adminPhone;
        this.adminEmail = adminEmail;
        this.adminContent = adminContent;
        this.adminState = adminState;
        this.adminJoinTime = adminJoinTime;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminLoginName='" + adminLoginName + '\'' +
                ", adminLoginPwd='" + adminLoginPwd + '\'' +
                ", adminLoginPwd2='" + adminLoginPwd2 + '\'' +
                ", adminGender='" + adminGender + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminContent='" + adminContent + '\'' +
                ", adminState=" + adminState +
                ", adminJoinTime=" + adminJoinTime +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
    }

    public String getAdminLoginPwd() {
        return adminLoginPwd;
    }

    public void setAdminLoginPwd(String adminLoginPwd) {
        this.adminLoginPwd = adminLoginPwd;
    }

    public String getAdminLoginPwd2() {
        return adminLoginPwd2;
    }

    public void setAdminLoginPwd2(String adminLoginPwd2) {
        this.adminLoginPwd2 = adminLoginPwd2;
    }

    public String getAdminGender() {
        return adminGender;
    }

    public void setAdminGender(String adminGender) {
        this.adminGender = adminGender;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminContent() {
        return adminContent;
    }

    public void setAdminContent(String adminContent) {
        this.adminContent = adminContent;
    }

    public int getAdminState() {
        return adminState;
    }

    public void setAdminState(int adminState) {
        this.adminState = adminState;
    }

    public Date getAdminJoinTime() {
        return adminJoinTime;
    }

    public void setAdminJoinTime(Date adminJoinTime) {
        this.adminJoinTime = adminJoinTime;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAdminSalt() {
        return adminSalt;
    }

    public void setAdminSalt(String adminSalt) {
        this.adminSalt = adminSalt;
    }
}
