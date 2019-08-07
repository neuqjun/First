package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 *      类似于 dao 层
 */


public interface UserMapper {
    User queryUserById(@Param("id") int id);
}
