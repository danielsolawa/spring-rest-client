package com.danielsolawa.services;

import com.danielsolawa.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Before
    public void setUp() throws Exception {
        

    }

    @Test
    public void testGetUsers() throws Exception {
        List<User> users  = apiService.getUsers(3);

        assertEquals(4, users.size());

    }
}