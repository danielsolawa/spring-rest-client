package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class Card implements Serializable{


    private static final long serialVersionUID = 8347663643581180766L;

    private String type;
    private Integer number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;


}
