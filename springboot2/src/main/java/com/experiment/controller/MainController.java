package com.experiment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.experiment.bean.BeanA;
import com.experiment.bean.BeanB;

@RestController
public class MainController {

    //If you defined variable name same as config method name, spring boot will auto match and bind for you. Else, you will have startup error
    @Autowired
    @Qualifier("beanA1")
    private BeanA bean1;
    
    @Autowired
    @Qualifier("beanA2")
    private BeanA bean2;
    
    @Autowired
    @Qualifier("beanA1")
    private BeanA beanA2;
    
    @Autowired
    private BeanA beanA1;//BeanA1 variable name would not works because the method name mapping starts with camel case
    
    @Autowired
    private BeanB beanB;
    
    @GetMapping(value="/bean-a1")
    public String getBeanA1Config() {
        return bean1.getDesc();//returns beanA1
    }
    
    @GetMapping(value="/bean-a2")
    public String getBeanA2Config() {
        return bean2.getDesc();//returns beanA2
    }
    
    @GetMapping(value="/bean1")
    public String getBean1Config() {
        return beanA1.getDesc();//returns beanA1
    }
    
    @GetMapping(value="/bean2")
    public String getBean2Config() {
        return beanA2.getDesc();//returns beanA1
    }    
    @GetMapping(value="/bean-b")
    public String getBeanBComponent() {
        return beanB.getDesc();//returns beanB
    }
}
