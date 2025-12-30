package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

public class ConsumerObj implements Runnable{
    private MyBlockingQueue myBlockingQueue;
    public ConsumerObj(MyBlockingQueue myBlockingQueue){
        this.myBlockingQueue=myBlockingQueue;
    }
    @Override
    public void run() {
        System.out.println(myBlockingQueue.take());
    }
}
