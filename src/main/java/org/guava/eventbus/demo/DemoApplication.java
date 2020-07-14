package org.guava.eventbus.demo;

import org.guava.eventbus.demo.event.DefaultSubscribe;
import org.guava.eventbus.demo.event.GuavaEventPublish;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        GuavaEventPublish publish = new GuavaEventPublish();
        publish.register(new DefaultSubscribe());
        publish.publish("fddf");
    }

}
