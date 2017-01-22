package com.turreta.springevent.events;

import com.turreta.springevent.EventSource;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventAHandlerB implements ApplicationListener<AppEventA> {

    @Override
    public void onApplicationEvent(AppEventA event) {

        Object source = event.getSource();
        if(source instanceof EventSource) {
            EventSource es = (EventSource)source;
            System.out.print(es.getNotes());
        }

    }
}
