package org.glassfish.jersey.examples;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserManager {
    
    private int x;
    
    public String getName() {
        return "Manager" + (x++);
    }

}
