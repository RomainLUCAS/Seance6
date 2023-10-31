package org.example;

public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator();

        DatabaseAuthenticator dbA = new DatabaseAuthenticator();
        FileAuthenticator fA = new FileAuthenticator();

        nav.setAuthenticator(dbA);



        System.out.println("Authentication with database, wrong credentials");
        if(nav.authenticate("chiro","password") == true)
            System.out.println("Authentication success");
        else
            System.out.println("Authentication error");

        System.out.println("Authentication with database, correct credentials");
        if(nav.authenticate("john","password") == true)
            System.out.println("Authentication success");
        else
            System.out.println("Authentication error");

        nav.setAuthenticator(fA);

        System.out.println("Authentication with file, wrong credentials");
        if(nav.authenticate("johnny","password111") == true)
            System.out.println("Authentication success");
        else
            System.out.println("Authentication error");

        System.out.println("Authentication with file, correct credentials");
        if(nav.authenticate("johnny","passwordJ") == true)
            System.out.println("Authentication success");
        else
            System.out.println("Authentication error");
    }
}