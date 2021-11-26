package com.example.session2;

public class user {
    public static String LastUser;
    String login, password;
    public user(String log, String pass)
    {
        this.login = log;
        this.password = pass;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
