package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.entity.User;

public interface UserService {
    /**
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * @param eid
     * @return
     */
    User getUserByEid(String eid);

    /**
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * delete User by id.
     * @param id
     * @return
     */
    boolean deleteUserById(Long id);
}
