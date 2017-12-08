package com.lanou.admin.bean;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public class Group {
    private int groId;
    private String groName;

    private List<Permission> permissions;

    public Group() {
    }

    public Group(int groId, String groName) {
        this.groId = groId;
        this.groName = groName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groId=" + groId +
                ", groName='" + groName + '\'' +
                '}';
    }

    public int getGroId() {
        return groId;
    }

    public void setGroId(int groId) {
        this.groId = groId;
    }

    public String getGroName() {
        return groName;
    }

    public void setGroName(String groName) {
        this.groName = groName;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
