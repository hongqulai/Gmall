package com.gec.gmall.manage.service;



import com.gec.gmall.manage.bean.PmsBaseAttrInfo;
import com.gec.gmall.manage.bean.PmsBaseAttrValue;

import java.util.List;


public interface AttrService {

    //根据选中的商品三级分类，显示对应的属性名及属性值
    List<PmsBaseAttrInfo> attrInfoList(Integer Catalog3Id);

    List<PmsBaseAttrValue> getAttrValueList(Integer attrId);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
