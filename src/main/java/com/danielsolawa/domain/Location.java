package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Location implements Serializable {


    private static final long serialVersionUID = 8470094244436607233L;
    private String street;
    private String city;
    private String state;
    private Integer postCode;
}
