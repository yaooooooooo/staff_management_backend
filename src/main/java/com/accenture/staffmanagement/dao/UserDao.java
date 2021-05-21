package com.accenture.staffmanagement.dao;

import com.accenture.staffmanagement.entity.User;

public interface UserDao {

    /**
     * @param id
     * @return User
     */
    User getUserById(Long id);

    /**
     * @param eid
     * @return User
     */
    User getUserByEid(String eid);

    /**
     * insert User into table.
     * @param user
     * @return
     */
    int addUser(User user);

    boolean updateUser(User user);

    boolean deleteUserById(Long id);

}
