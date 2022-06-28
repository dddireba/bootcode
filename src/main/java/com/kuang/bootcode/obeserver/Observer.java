package com.kuang.bootcode.obeserver;

public class Observer {

    private String name;

    public Observer(String name){
        this.name=name;
    }

    public void update(String message){
        System.out.println(name+"收到消息"+message);
    }
}
