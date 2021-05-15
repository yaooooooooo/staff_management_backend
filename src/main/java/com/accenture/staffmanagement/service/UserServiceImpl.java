package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.dao.UserDao;
import com.accenture.staffmanagement.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByEid(String eid) {
        return userDao.getUserByEid(eid);
    }
}
