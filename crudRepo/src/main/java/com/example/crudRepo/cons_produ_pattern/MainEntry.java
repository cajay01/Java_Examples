package com.example.crudRepo.cons_produ_pattern;

import com.example.crudRepo.cons_produ_pattern.Locks.Consumer;
import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;
import com.example.crudRepo.cons_produ_pattern.Locks.Producer;
import com.example.crudRepo.cons_produ_pattern.obj.ConsumerObj;
import com.example.crudRepo.cons_produ_pattern.obj.ProducerObj;

public class MainEntry {
    public void mainCallLocks() {
        MyBlockingQueue myBlockingQueue=new MyBlockingQueue(5);
        Producer producer=new Producer(myBlockingQueue);
        Consumer consumer=new Consumer(myBlockingQueue);
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }
    public void mainCallObjs() {
        MyBlockingQueue myBlockingQueue=new MyBlockingQueue(5);
        ProducerObj producer=new ProducerObj(myBlockingQueue);
        ConsumerObj consumer=new ConsumerObj(myBlockingQueue);
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
