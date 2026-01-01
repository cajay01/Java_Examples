package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueueObj<E>{
    public Queue<E> queue;
    public int maxCapacity=16;

    public MyBlockingQueueObj(int size){
        this.queue=new LinkedList<>();
        this.maxCapacity=size;
    }

}
