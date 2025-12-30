package com.example.crudRepo.cons_produ_pattern.Locks;

public class Consumer implements Runnable{
    private MyBlockingQueue myBlockingQueue;
   public Consumer(MyBlockingQueue myBlockingQueue){
        this.myBlockingQueue=myBlockingQueue;
    }
    @Override
    public void run() {
        System.out.println(myBlockingQueue.take());
    }
}
