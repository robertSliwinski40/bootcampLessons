package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

/*
FIFO
Queue is an interface, and it has many different implementations, the most popular are LinkedList, PriorityQueue

 */
public class WorkingWithQueue {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Maria", 18));
        queue.add(new Person("Ali", 40));
        queue.add(new Person("Dexter", 35));

        System.out.println(queue.peek());
        System.out.println("size is: " + queue.size());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println("size is: " + queue.size());

    }

    static record Person(String name, int age) {
    }
}
