package org.example;

import java.util.HashMap;

public class DatabaseAuthenticator extends Authenticator {

    private HashMap<String,String> BD = new HashMap<>();


    //Entrées de la base de données
    public DatabaseAuthenticator()
    {
        BD.put("john","password");
    }

    @Override
    public boolean isLogin(String username) {
        if(BD.containsKey(username))
            return true;
        else
            return false;
    }

    @Override
    public boolean isPassword(String username, String password) {
        if (BD.get(username).equals(password))
            return true;
        else
            return false;
    }
}
