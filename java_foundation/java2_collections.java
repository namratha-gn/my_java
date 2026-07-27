
// QUEUE INTERFACE --> Queue interface provides the functionality of the queue data structure. it extends the collection interface
//                 --> Imagine the realworld queue line to know how the queue data structure is going to be
//                 --> it works as FIFO(first in first out manner)
//                 --> first place in queue => front   (front where pop operation takes place)
//                  .....last place in queue => end/rear(rear where the push operation takes place)
//                 --> classes available for Queue=> ArrayDeque , LisnkedList , PriorityQueue


// Implementation of queue using ArrayDeque , LisnkedList , PriorityQueue

// //LinkedList implementation of Queue
// Queue<String> animal1 = new LinkedList<>();

// //Array implementation of queue
// Queue<String> animal2 = new ArrayDeque<>();

// //Priority Queue implementation of Queue
// Queue<String> animal3 = new PriorityQueue<>();

import java.util.LinkedList;
import java.util.Queue;

public class java2_collections{
    public static void main(String args[]){

        Queue<Integer> q=new LinkedList<>();

        //add(); --> it's function is to add an element to Queue if succeessfull, returns True else throws exception

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);

        //offer(); --> it's function is to add an element to Queue if succeessfull, returns True else returns false

        q.offer(50);
        q.offer(60);

        System.out.println(q);

        //element()

        System.out.println(q.element());

        //peek();

        System.out.println(q.peek());

        //remove()

        System.out.println(q.remove());
        System.out.println(q);

        q.clear();

        System.out.println(q);

        //poll()

        System.out.println(q.poll());



    }
}




