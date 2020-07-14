package org.guava.eventbus.demo.event;

/**
 * @author Issac Zhou
 * @date 2020/07/14
 */
public class GuavaEventPublish extends AbstractEventPublish {

    @Override
    public void publish(Object object) {
        getEventBus().post(object);
    }

    @Override
    public void register(Object event) {
        getEventBus().register(event);
    }
}
