package com.gec.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.bean.UmsMemberReceiveAddress;
import com.gec.gmall.user.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId)
    {
        System.out.println("memberId=="+memberId);
        return userService.getReceiveAddressByMemberId(memberId);
    }


    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser()
    {
        return userService.getAllUser();
    }
}
