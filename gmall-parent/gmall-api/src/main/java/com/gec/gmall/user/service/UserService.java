package com.gec.gmall.user.service;


import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
