package com.fortegroup.adminfortegroup.service;

/**
 * Service for Security.
 *
 * @author Bobko Vladimir
 * @version 1.0
 */

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
