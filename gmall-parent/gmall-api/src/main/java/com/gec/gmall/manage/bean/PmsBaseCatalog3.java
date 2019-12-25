package com.gec.gmall.manage.bean;


import javax.persistence.Id;
import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {

    @Id
    private String id;

    private String name;

    private Integer catalog2Id;

    public PmsBaseCatalog3() {
    }

    public PmsBaseCatalog3(String id,String name,Integer catalog2Id) {
        this.id = id;
        this.name = name;
        this.catalog2Id = catalog2Id;
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

    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catalog2Id=" + catalog2Id +
                '}';
    }
}
