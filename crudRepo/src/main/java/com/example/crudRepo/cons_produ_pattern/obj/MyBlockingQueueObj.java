package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueueObj<E>{
    private Queue<E> queue;
    private int maxCapacity=16;
    Object notFull=new Object();
    Object notEmpty=new Object();
    public MyBlockingQueueObj(int size){
        this.queue=new LinkedList<>();
        this.maxCapacity=size;
    }

    public synchronized void  put(E e){
       // lock.lock();
        try {
            if (queue.size()==maxCapacity){
                notFull.wait();
            }
            System.out.println("AAdding");
            queue.add(e);
            notEmpty.notifyAll();
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
        finally {
           // lock.unlock();
        }

    }

    public synchronized E take(){
       // lock.lock();
        try {
            if(queue.isEmpty()){
                notEmpty.wait();
            }
            E item = queue.remove();
            notFull.notifyAll();
            return item;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
         //   lock.unlock();
        }
    }

}
