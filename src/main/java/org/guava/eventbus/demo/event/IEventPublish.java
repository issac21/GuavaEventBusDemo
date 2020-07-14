package org.guava.eventbus.demo.event;

/**
 * @author Issac Zhou
 * @date 2020/07/14
 */
public interface IEventPublish {

    /**
     * 发布事件
     *
     * @param object 发布对象
     */
    void publish(Object object);

    /**
     * 事件注册
     *
     * @param event 事件订阅对象
     */
    void register(Object event);
}
