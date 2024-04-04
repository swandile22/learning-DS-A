/****************************************************
 *
 * you can't instantiate a queue because it is a interface, meaning it's a template which can be applied to a class
 * LinkedLists and PriorityQueue implements Queue
 * Queue = FIFO data structure - First In First Out
 * A collection designed for holding elements prior to processing
 * Linear data structure
 * enqueue - offer(); add to the queue
 * dequeue - poll(); remove from the queue
 * peek() - gives values of first value in queue
 * size() - gives the number of values inside of a queue
 * contains() - checks if a value exists inside of a queue
 * isEmpty() - checks if queue is empty then returns a boolean
 *
 * Where are queues useful?
 * 1.Keyboard Buffer (letters should appear on the screen in the order they're pressed)
 * 2.Printer queue (Print jobs should be completed in order)
 * 3.Used in LinkedLists, PriorityQueues, Breadth-first search
 ******************************************************
*/


package DataStructuresAndAlgorithms.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();



        queue.offer("Karen");
        queue.offer("Gaz");
        queue.offer("Steve");
        queue.offer("Harold");

//        queue.poll();
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        System.out.println(queue.contains("Gaz"));


        System.out.println(queue);
    }
}
