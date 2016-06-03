package org.glassfish.jersey.examples;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class MyApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(UserManager.class).to(UserManager.class);
    }
}
