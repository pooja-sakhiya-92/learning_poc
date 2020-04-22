package com.freemind.creativeservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonFilter("beanFilter")
//@JsonIgnoreProperties(value = {"password","mobileNumber"})
public class FilterBean {
    String name;

    //@JsonIgnore
    String password;
    String mobileNumber;


    public FilterBean(String name,String pwd) {
        this.name = name;
        this.password = pwd;
    }
}
