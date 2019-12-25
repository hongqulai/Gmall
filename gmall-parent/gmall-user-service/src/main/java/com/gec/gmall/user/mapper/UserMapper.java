package com.gec.gmall.user.mapper;

import com.gec.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    //扩展自身的查询方法
    List<UmsMember> selectAllUser();
}
