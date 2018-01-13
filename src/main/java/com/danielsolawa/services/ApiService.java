package com.danielsolawa.services;

import com.danielsolawa.domain.User;

import java.util.List;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
