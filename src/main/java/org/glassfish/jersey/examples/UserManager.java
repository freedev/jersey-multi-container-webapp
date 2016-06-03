package org.glassfish.jersey.examples;

public class UserManager {
    
    private int x;
    
    public String getName() {
        return "Manager" + (x++);
    }

}
