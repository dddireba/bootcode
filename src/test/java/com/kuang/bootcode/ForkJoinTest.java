package com.kuang.bootcode;



import lombok.SneakyThrows;

import java.util.concurrent.*;

public class ForkJoinTest extends RecursiveTask<Integer> {
    private final int tot = 2;
    private int start;
    private int end;

    public ForkJoinTest(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName());
        int ans=0;
        if(end-start<=tot){
            for (int i=start;i<=end;i++){
                ans+=i;
            }
        }else{
            int mid=(start+end)/2;
            ForkJoinTest left = new ForkJoinTest(start, mid);
            ForkJoinTest right = new ForkJoinTest(mid+1, end);
            left.fork();
            right.fork();
            Integer lnum = left.join();
            Integer rnum = right.join();
            ans=lnum+rnum;
        }
        return ans;

    }


    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTest forkJoinTest = new ForkJoinTest(1, 10);
        ForkJoinTask<Integer> submit = forkJoinPool.submit(forkJoinTest);
        System.out.println(submit.get());

    }
}

