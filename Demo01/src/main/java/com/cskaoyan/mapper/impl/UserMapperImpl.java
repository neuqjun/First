package com.cskaoyan.mapper.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 由于该类中有从spring容器中取出的组件，故该类也需要注册成为组件
public class UserMapperImpl implements UserMapper {

    @Autowired
    SqlSessionFactory sqlSessionFactory; // 前提是该 sqlSessionFactory 在spring容器中有注册(一般为单例模式)

    @Override
    public User queryUserById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(5);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }
}
