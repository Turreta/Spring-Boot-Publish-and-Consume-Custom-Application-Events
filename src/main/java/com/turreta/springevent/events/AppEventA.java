package com.turreta.springevent.events;

import org.springframework.context.ApplicationEvent;

public class AppEventA extends ApplicationEvent  {

    /**
     * Create a customer application event
     *
     * @param source the object on which the event occurred
     */
    public AppEventA(Object source) {
        super(source);
    }
}
