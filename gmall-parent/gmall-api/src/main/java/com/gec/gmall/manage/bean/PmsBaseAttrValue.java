package com.gec.gmall.manage.bean;


import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

public class PmsBaseAttrValue implements Serializable {

    @Id
    private String id;

    private String valueName;

    private Integer attrId;

    private String isEnabled;

    @Transient
    private String urlParam;

    public PmsBaseAttrValue() {
    }

    public PmsBaseAttrValue(String id,String valueName,Integer attrId,String isEnabled,String urlParam) {
        this.id = id;
        this.valueName = valueName;
        this.attrId = attrId;
        this.isEnabled = isEnabled;
        this.urlParam = urlParam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "PmsBaseAttrValue{" +
                "id='" + id + '\'' +
                ", valueName='" + valueName + '\'' +
                ", attrId=" + attrId +
                ", isEnabled='" + isEnabled + '\'' +
                ", urlParam='" + urlParam + '\'' +
                '}';
    }
}
