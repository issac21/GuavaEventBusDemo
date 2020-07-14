package org.guava.eventbus.demo.event;

import com.google.common.eventbus.EventBus;

/**
 * @author Issac Zhou
 * @date 2020/07/14
 */
public abstract class AbstractEventPublish implements IEventPublish{

    private static EventBus eventBus;

    protected EventBus getEventBus() {
        if (eventBus == null) {
            synchronized (this) {
                if (eventBus == null) {
                    eventBus = new EventBus();
                }
            }
        }
        return eventBus;
    }

}
