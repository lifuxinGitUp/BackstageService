package com.lanou.admin.bean;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public class Role {
    private int roleId;
    private String roleName;
    private String roleContent;

    private List<PermissionExp> permissions;

    public Role() {
    }

    public Role(String roleName, String roleContent) {
        this.roleName = roleName;
        this.roleContent = roleContent;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleContent='" + roleContent + '\'' +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleContent() {
        return roleContent;
    }

    public void setRoleContent(String roleContent) {
        this.roleContent = roleContent;
    }

    public List<PermissionExp> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionExp> permissions) {
        this.permissions = permissions;
    }
}
