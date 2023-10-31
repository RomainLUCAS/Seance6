package org.example;

public abstract class Authenticator {
    public boolean authenticate(String username, String password)
    {
        return isLogin(username) && isPassword(username,password);
    }
    public abstract boolean isLogin(String username);
    public abstract boolean isPassword(String username, String password);
}
