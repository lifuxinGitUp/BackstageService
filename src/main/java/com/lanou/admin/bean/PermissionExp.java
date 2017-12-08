package com.lanou.admin.bean;

/**
 * Created by dllo on 17/12/6.
 */
public class PermissionExp extends Permission {
    private int addPer = 0;
    private int deletePer = 0;
    private int updatePer = 0;
    private int selectPer = 0;
    private int auditPer = 0;
    private int ownPer = 0;

    public PermissionExp() {
    }

    @Override
    public String toString() {
        return "PermissionExp{" +
                "addPer=" + addPer +
                ", deletePer=" + deletePer +
                ", updatePer=" + updatePer +
                ", selectPer=" + selectPer +
                ", auditPer=" + auditPer +
                ", ownPer=" + ownPer +
                "} " + super.toString();
    }

    public int getAddPer() {
        return addPer;
    }

    public void setAddPer(int addPer) {
        this.addPer = addPer;
    }

    public int getDeletePer() {
        return deletePer;
    }

    public void setDeletePer(int deletePer) {
        this.deletePer = deletePer;
    }

    public int getUpdatePer() {
        return updatePer;
    }

    public void setUpdatePer(int updatePer) {
        this.updatePer = updatePer;
    }

    public int getSelectPer() {
        return selectPer;
    }

    public void setSelectPer(int selectPer) {
        this.selectPer = selectPer;
    }

    public int getAuditPer() {
        return auditPer;
    }

    public void setAuditPer(int auditPer) {
        this.auditPer = auditPer;
    }

    public int getOwnPer() {
        return ownPer;
    }

    public void setOwnPer(int ownPer) {
        this.ownPer = ownPer;
    }


}
