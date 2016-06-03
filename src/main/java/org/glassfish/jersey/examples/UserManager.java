package org.glassfish.jersey.examples;

import javax.inject.Singleton;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Singleton
public class UserManager {
    
    private int x;
    
    private String name = "Manager";
    
    public String getName() {
        return name + " " + (x++);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
