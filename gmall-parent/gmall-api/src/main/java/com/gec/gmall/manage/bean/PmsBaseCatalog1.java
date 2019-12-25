package com.gec.gmall.manage.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class PmsBaseCatalog1 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Transient
    private List<PmsBaseCatalog2> pmsBaseCatalog2s;

    public PmsBaseCatalog1() {
    }

    public PmsBaseCatalog1(Integer id,String name,List<PmsBaseCatalog2> pmsBaseCatalog2s) {
        this.id = id;
        this.name = name;
        this.pmsBaseCatalog2s = pmsBaseCatalog2s;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PmsBaseCatalog2> getPmsBaseCatalog2s() {
        return pmsBaseCatalog2s;
    }

    public void setPmsBaseCatalog2s(List<PmsBaseCatalog2> pmsBaseCatalog2s) {
        this.pmsBaseCatalog2s = pmsBaseCatalog2s;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pmsBaseCatalog2s=" + pmsBaseCatalog2s +
                '}';
    }
}
