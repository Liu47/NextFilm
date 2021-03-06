package com.xx.nextfilm.dto.editor;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by CuiH on 2016/5/13.
 */
public class Visitor {

    @NotEmpty
    private String username;
    @NotEmpty
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
