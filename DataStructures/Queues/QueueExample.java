/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructures.Queues;

/**
 *
 * @author Admin
 */
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public static void main(String args[])
    {
      Queue<Integer>queue=new LinkedList<>();
      System.out.println("The Queue "+queue);
        System.out.println("This shows an empty array, which is the queue");
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("The queue after all of the offers "+queue);
        System.out.println("This shows an array with the values that we offered, which is the queue");
        queue.poll();
        System.out.println("Here is the queue after one poll, notice the first element that we offered is polled first. "+queue);
        queue.poll();
        System.out.println("Here is the queue after two polls. "+queue);
        queue.poll();
        System.out.println("Here is the queue after three polls. "+queue);
    }
}