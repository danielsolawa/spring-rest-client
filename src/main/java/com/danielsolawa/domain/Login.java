package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Login implements Serializable {


    private static final long serialVersionUID = -2432579981292390236L;
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
