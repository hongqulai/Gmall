package com.gec.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.manage.bean.PmsBaseAttrInfo;
import com.gec.gmall.manage.bean.PmsBaseAttrValue;
import com.gec.gmall.manage.service.AttrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AttrController {

    @Reference
    private AttrService attrService;

    @RequestMapping(value = "/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }


    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(Integer attrId){
        return attrService.getAttrValueList(attrId);
    }


    @RequestMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        System.out.println("pmsBaseAttrInfo=="+pmsBaseAttrInfo);
        attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }
}
