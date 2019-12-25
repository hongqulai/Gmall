package com.gec.gmall.manage.service.impl;


import com.gec.gmall.manage.bean.PmsBaseAttrValue;
import com.gec.gmall.manage.bean.PmsBaseAttrInfo;
import com.gec.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.gec.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.gec.gmall.manage.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@com.alibaba.dubbo.config.annotation.Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    /**
     * 根据第三级属性查询所有属性信息
     * @param Catalog3Id
     * @return
     */
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Integer Catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(Catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }

    /**
     * 根据属性id查询属性值
     * @param attrId
     * @return
     */
    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Integer attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        return pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
    }


    /**
     * 1.判断属性值是否为新增或者修改
     * 2.判断修改是否包含删除
     * @param pmsBaseAttrInfo
     * @return
     */
    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        //判断pmsBaseAttrInfo是否有id，如果没有就是添加，有就是修改
        Integer id = pmsBaseAttrInfo.getId();
        if (id!=null&&id!=0){   //修改
            pmsBaseAttrInfoMapper.updateByPrimaryKeySelective(pmsBaseAttrInfo);  //修改主表的
            //修改包含删除功能，所以要先将数据全部删除然后重新添加
            //删除
            PmsBaseAttrValue delpmsBaseAttrValue = new PmsBaseAttrValue();
            delpmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.delete(delpmsBaseAttrValue);
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {  //重新添加
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }

        }else {   //新增
            //保存主表
            pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
            //保存从表
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insert(pmsBaseAttrValue);
            }
        }
        return "success";
    }
}
