package com.lanou.admin.bean;

/**
 * Created by dllo on 17/12/6.
 */
public class Permission {
    private int perId;
    private String perName;
    private String perContent;
    private Group group;



    public Permission() {
    }

    public Permission( String perName, String perContent) {
        this.perName = perName;
        this.perContent = perContent;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "perId=" + perId +
                ", perName='" + perName + '\'' +
                ", perContent='" + perContent + '\'' +
                '}';
    }

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerContent() {
        return perContent;
    }

    public void setPerContent(String perContent) {
        this.perContent = perContent;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


}
