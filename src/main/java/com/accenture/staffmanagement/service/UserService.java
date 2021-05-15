package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.entity.User;

public interface UserService {
    User getUserById(Long id);
    User getUserByEid(String eid);
}
