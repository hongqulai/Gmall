package com.gec.gmall.manage.service;

import com.gec.gmall.manage.bean.PmsBaseCatalog1;
import com.gec.gmall.manage.bean.PmsBaseCatalog2;
import com.gec.gmall.manage.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id);
}
