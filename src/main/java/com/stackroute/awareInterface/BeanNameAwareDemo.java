package com.stackroute.awareInterface;

import org.springframework.beans.factory.BeanNameAware;

// implement beanname aware to know the name of bean
//we have to write bean for every method eg for this BeanNameAwareDemo
public class BeanNameAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("beanname is " +s);

    }
}
