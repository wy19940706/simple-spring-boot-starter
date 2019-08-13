package com.wenyao.service;

/**
 * Created by Think on 2019/4/10
 */
public class StarterService {
    private String configure;

    public StarterService(String configure) {
        this.configure = configure;
    }

    public void printString() {
        System.out.println(this.configure);
    }
}
