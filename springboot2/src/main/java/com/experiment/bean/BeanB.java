package com.experiment.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private String desc;

    public BeanB() {
        super();
        this.desc = "This is BeanB";
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
