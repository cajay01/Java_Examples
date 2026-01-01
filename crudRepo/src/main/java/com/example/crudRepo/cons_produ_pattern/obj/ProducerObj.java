package com.example.crudRepo.cons_produ_pattern.obj;

import com.example.crudRepo.cons_produ_pattern.Locks.MyBlockingQueue;

import java.util.Queue;

public class ProducerObj implements Runnable{
    private final Queue<String> queue;
    private final int capacity;
    private int item = 0;

    public ProducerObj(Queue<String> queue, int capacity){
        this.queue = queue;
        this.capacity = capacity;
    }
    @Override
    public void run() {
        synchronized (queue) {
            // Wait if the queue is empty
            while (queue.size() == capacity) {
                try {
                    System.out.println("Queue is full. Producer waiting...");
                    queue.wait(); // Releases the lock and waits
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Consume item from the queue
             queue.add("One");
             System.out.println("Adding");

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


