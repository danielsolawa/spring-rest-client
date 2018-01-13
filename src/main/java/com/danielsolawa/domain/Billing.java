package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Billing implements Serializable{


    private static final long serialVersionUID = -8597279415087367313L;
    private Card card;


}
