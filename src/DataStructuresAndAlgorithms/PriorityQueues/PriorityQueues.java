/*
* Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with a
* lower priority
* Diferrence between a LinkedList Queue and Priority Queue is that a Priority Queue
* lists values in an ascending order
* Collections.reverseOrder is a method which returns a comparator which is used for reverse ordering
* it can also reverse order alphabet characters
* */
package DataStructuresAndAlgorithms.PriorityQueues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {


    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("D");
        queue.offer("F");
        queue.offer("B");
        queue.offer("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
