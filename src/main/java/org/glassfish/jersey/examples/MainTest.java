package org.glassfish.jersey.examples;

import javax.inject.Inject;

public class MainTest {

    @Inject
    private UserManager userManager;

    public static void main(String[] args) {
        
        MyResourceConfig mrc = new MyResourceConfig();
        // TODO Auto-generated method stub
        System.out.println( (new MainTest()).userManager.getName());
    }

}
