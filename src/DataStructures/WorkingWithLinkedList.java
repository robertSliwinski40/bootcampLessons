package DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/*
head, tail, pointers, Linked List, doubly Linked List, addLast, addFirst, add(index, object)
using LinkedList is a bit costly, because of the nodes

 */
public class WorkingWithLinkedList {
    public static void main(String[] args) {

        LinkedList<WorkingWithQueue.Person> linkedList = new LinkedList<>();
        linkedList.add(new WorkingWithQueue.Person("Ala", 22));
        linkedList.add(new WorkingWithQueue.Person("Ela", 31));
        linkedList.add(new WorkingWithQueue.Person("Kate", 25));
        linkedList.add(new WorkingWithQueue.Person("John", 37));
        linkedList.addFirst(new WorkingWithQueue.Person("Mark",50));

        //looping
        ListIterator<WorkingWithQueue.Person> personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }


    }
}
