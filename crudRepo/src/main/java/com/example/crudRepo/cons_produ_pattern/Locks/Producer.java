package com.example.crudRepo.cons_produ_pattern.Locks;

public class Producer implements Runnable{
    private MyBlockingQueue myBlockingQueue;
   public Producer(MyBlockingQueue myBlockingQueue){
        this.myBlockingQueue=myBlockingQueue;
    }
    @Override
    public void run() {
       myBlockingQueue.put("One");
    }
}
