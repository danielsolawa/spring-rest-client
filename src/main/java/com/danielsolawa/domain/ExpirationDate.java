package com.danielsolawa.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Daniel Solawa on 2018-01-13.
 */
@Data
public class ExpirationDate implements Serializable {

    private static final long serialVersionUID = 8633261824401406503L;
    private Date date;
    private Integer timezoneType;
    private String timezone;
}
