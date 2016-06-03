package org.glassfish.jersey.examples;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        register(new MyApplicationBinder());
        packages(true, "org.glassfish.jersey.examples");
    }

}
