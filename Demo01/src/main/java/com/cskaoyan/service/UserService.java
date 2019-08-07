package com.cskaoyan.service;

import com.cskaoyan.bean.User;

/**
 *  service 层只是 controller层和 mapper(dao层)之间的中间层，负责处理一些这两层以外的一些业务逻辑
 */
public interface UserService {
    User queryUserById(int id);
}
