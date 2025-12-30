package com.example.crudRepo.cons_produ_pattern.Locks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue <E>{
    private Queue<E> queue;
    private int maxCapacity=16;
    ReentrantLock lock=new ReentrantLock(true);
    private Condition notEmpty=lock.newCondition();
    private Condition notFull=lock.newCondition();

    public MyBlockingQueue(int size){
        this.queue=new LinkedList<>();
       this.maxCapacity=size;

    }

    public void put(E e){
        lock.lock();
        try {
            if (queue.size()==maxCapacity){
              notFull.await();
            }
            System.out.println("AAdding");
            queue.add(e);
            notEmpty.signalAll();
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }

    public E take(){
        lock.lock();
        try {
            if(queue.isEmpty()){
            notEmpty.await();
            }
            E item = queue.remove();
            notFull.signalAll();
            return item;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
