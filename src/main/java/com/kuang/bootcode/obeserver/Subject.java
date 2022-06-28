package com.kuang.bootcode.obeserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list =new ArrayList<Observer>();

    public void addList(Observer observer){
        list.add(observer);
    }

    public void removeList(Observer observer){
        list.remove(observer);
    }

    public void notifyall(String message){
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}
