package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("你好 struts2 ");
        return SUCCESS;
    }

}
