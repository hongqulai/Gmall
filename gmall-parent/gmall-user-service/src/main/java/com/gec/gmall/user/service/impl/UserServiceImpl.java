package com.gec.gmall.user.service.impl;

import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.bean.UmsMemberReceiveAddress;
import com.gec.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gec.gmall.user.mapper.UserMapper;
import com.gec.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        System.out.println("memberIdbyService=="+memberId);
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        System.out.println("select=="+select);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
