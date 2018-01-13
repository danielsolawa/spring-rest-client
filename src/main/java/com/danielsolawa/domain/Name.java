package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Name implements Serializable {


    private static final long serialVersionUID = -7880108093698024221L;
    private String title;
    private String first;
    private String last;
}
