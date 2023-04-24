package com.myselfbatis.dto;

/**
 * @Created by comphca
 * @Date 2023/4/24 22:06
 * @Description TODO
 */
public class UserDto {
    private String password;
    private String token;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
