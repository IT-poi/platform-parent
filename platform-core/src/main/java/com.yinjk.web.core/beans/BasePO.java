package com.yinjk.web.core.beans;

import java.io.Serializable;
import java.util.Date;

/**
* @Description : 基础PO
* @author yinjiankang
* @date : 2017/12/20
**/
public  class BasePO implements Serializable{
    /**
     * 创建时间
     */
    Date createAt;
    /**
     * 修改时间
     */
    Date updateAt;
    /**
     * 创建人
     */
    Integer createBy;

    /**
     * 修改人
     */
    Integer updateBy;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}