package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

import java.util.Queue;

public class ConsumerObj implements Runnable{
    private final Queue<String> queue;
    private final int capacity;
    public ConsumerObj(Queue<String> queue, int capacity){

        this.queue = queue;
        this.capacity = capacity;
    }

    @Override
    public void run() {

        synchronized (queue) {
            // Wait if the queue is empty
            while (queue.isEmpty()) {
                try {
                    System.out.println("Queue is empty. Consumer waiting...");
                    queue.wait(); // Releases the lock and waits
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Consume item from the queue
          queue.remove();
            System.out.println("Consumer consumed ");

            // Notify producers that there is space available
            queue.notifyAll();
        }
        try {
            Thread.sleep(1000); // Simulate consumption time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

