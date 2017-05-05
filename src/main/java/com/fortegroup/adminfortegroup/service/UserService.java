package com.fortegroup.adminfortegroup.service;

import com.fortegroup.adminfortegroup.model.User;

/**
 * Service class for {@link com.fortegroup.adminfortegroup.model.User}
 *
 * @author Bobko Vladimir
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
