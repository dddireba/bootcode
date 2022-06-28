package com.kuang.bootcode.obeserver;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addList(new Observer("111"));
        subject.addList(new Observer("222"));
        subject.addList(new Observer("333"));

        subject.notifyall("尝试接受消息");

    }
}
