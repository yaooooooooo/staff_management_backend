package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.dao.UserDao;
import com.accenture.staffmanagement.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Transactional
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    @Override
    public User getUserByEid(String eid) {
        return userDao.getUserByEid(eid);
    }
}
