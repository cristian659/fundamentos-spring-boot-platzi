package com.fundamentosplatzi.springboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "user")
public class UserPojo {
    private String email;
    private String password;
    private int ege;

    public UserPojo(String email, String password, int ege) {
        this.email = email;
        this.password = password;
        this.ege = ege;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }
}
