package com.gec.gmall.manage.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class PmsBaseCatalog2 implements Serializable {

    @Id
    private String id;

    private String name;

    private Integer catalog1Id;

    @Transient
    private List<PmsBaseCatalog3> pmsBaseCatalog3s;

    public PmsBaseCatalog2() {
    }

    public PmsBaseCatalog2(String id,String name,Integer catalog1Id,List<PmsBaseCatalog3> pmsBaseCatalog3s) {
        this.id = id;
        this.name = name;
        this.catalog1Id = catalog1Id;
        this.pmsBaseCatalog3s = pmsBaseCatalog3s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public List<PmsBaseCatalog3> getPmsBaseCatalog3s() {
        return pmsBaseCatalog3s;
    }

    public void setPmsBaseCatalog3s(List<PmsBaseCatalog3> pmsBaseCatalog3s) {
        this.pmsBaseCatalog3s = pmsBaseCatalog3s;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalog1Id=" + catalog1Id +
                ", pmsBaseCatalog3s=" + pmsBaseCatalog3s +
                '}';
    }
}
