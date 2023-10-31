package org.example;

public class Navigator {
    private Authenticator auth;

    public void setAuthenticator(Authenticator a)
    {
        auth = a;
    }

    public boolean authenticate(String username, String password)
    {
        return auth.authenticate(username, password);
    }
}
