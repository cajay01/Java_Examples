package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

public class ProducerObj implements Runnable{
    private MyBlockingQueue myBlockingQueue;
    public ProducerObj(MyBlockingQueue myBlockingQueue){
        this.myBlockingQueue=myBlockingQueue;
    }
    @Override
    public void run() {
       myBlockingQueue.put("One");
    }
}
