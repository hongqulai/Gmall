package com.gec.gmall.manage.service.impl;

import com.gec.gmall.manage.bean.PmsBaseCatalog1;
import com.gec.gmall.manage.bean.PmsBaseCatalog2;
import com.gec.gmall.manage.bean.PmsBaseCatalog3;
import com.gec.gmall.manage.service.CatalogService;
import com.gec.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.gec.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.gec.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@com.alibaba.dubbo.config.annotation.Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
    }
}
