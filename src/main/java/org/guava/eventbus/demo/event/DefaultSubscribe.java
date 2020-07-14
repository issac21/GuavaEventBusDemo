package org.guava.eventbus.demo.event;

import com.google.common.eventbus.Subscribe;

/**
 * @author Issac Zhou
 * @date 2020/07/14
 */
public class DefaultSubscribe {

    @Subscribe
    public void subscribe(Object object) {
        System.out.println(object);
    }

}
