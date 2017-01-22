package com.turreta.springevent;

import com.turreta.springevent.events.AppEventA;
import com.turreta.springevent.events.AppEventAPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ComTurretaSpringeventApplication  {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = SpringApplication.run(ComTurretaSpringeventApplication.class, args);

		/**
		 * Alternatively, you can used @Autowired but we are using static main method.
		 */
		AppEventAPublisher eventAPublisher = (AppEventAPublisher)context.getBean("appEventAPublisher");

		eventAPublisher.publish(new AppEventA(new EventSource()));

		/**
		 * We wait for a minutes before the application terminates.
		 * For web application, you won't need this at all.
 		 */
		TimeUnit.MINUTES.sleep(1);
	}
}
