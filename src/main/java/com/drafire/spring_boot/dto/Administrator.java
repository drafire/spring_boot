package com.drafire.spring_boot.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "administrator")
public class Administrator {
    private String username;
    private int age;
    private String telno;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", telno='" + telno + '\'' +
                '}';
    }
}
