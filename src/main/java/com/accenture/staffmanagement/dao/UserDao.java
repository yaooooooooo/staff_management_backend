package com.accenture.staffmanagement.dao;

import com.accenture.staffmanagement.entity.User;

public interface UserDao {
    User getUserById(Long id);
    User getUserByEid(String eid);
}
