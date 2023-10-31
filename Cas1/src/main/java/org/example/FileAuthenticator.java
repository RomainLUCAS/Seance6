package org.example;

import java.util.HashMap;

public class FileAuthenticator extends Authenticator{

    private HashMap<String,String> file = new HashMap<>();
    public FileAuthenticator()
    {
        file.put("johnny","passwordJ");
    }

    @Override
    public boolean authenticate(String username, String password) {
         return isLogin(username) && isPassword(username,password);
    }

    @Override
    public boolean isLogin(String username) {
        if(file.containsKey(username))
            return true;
        else
            return false;
    }

    @Override
    public boolean isPassword(String username, String password) {
        if(file.get(username).equals(password))
            return true;
        else
            return false;
    }
}
