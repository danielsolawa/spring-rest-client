package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Job implements Serializable{


    private static final long serialVersionUID = -5680938435224394632L;
    private String title;
    private String company;
}
