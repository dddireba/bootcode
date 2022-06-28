package com.kuang.bootcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;


 class BootcodeApplicationTests implements Runnable{


     CyclicBarrier cyclicBarrier =new CyclicBarrier(2,this);
    int  a=1;
    int b=2;
    void cal(){
        Thread aa = new Thread(() -> {
            this.a = 11;
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        Thread bb = new Thread(() -> {
            this.b = 22;
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        aa.start();
        bb.start();
    }



    @Override
    public void run() {
        System.out.println(a+b);
    }

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        new BootcodeApplicationTests().cal();
    }

}
