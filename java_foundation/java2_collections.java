
// QUEUE INTERFACE --> Queue interface provides the functionality of the queue data structure. it extends the collection interface
//                 --> Imagine the realworld queue line to know how the queue data structure is going to be
//                 --> it works as FIFO(first in first out manner)
//                 --> first place in queue => front   (front where pop operation takes place)
//                  .....last place in queue => end/rear(rear where the push operation takes place)
//                 --> classes available for Queue=> ArrayDeque , LinkedList , PriorityQueue
//                 --> out of many methods we use 3 important methods that's it ----> 1. offer()[for inserting an element] 2. poll() [for removing an element] 3. peek() [for getting the front element]--->these are common methods not any class specific UNDERSTAND
   

// Implementation of queue using ArrayDeque , LinkedList , PriorityQueue

// //LinkedList implementation of Queue
// Queue<String> animal1 = new LinkedList<>();

// //ArrayDeque implementation of queue
// Queue<String> animal2 = new ArrayDeque<>();

// //Priority Queue implementation of Queue
// Queue<String> animal3 = new PriorityQueue<>();

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

//IMPLEMENTING QUEUE USING LINKEDLIST CLASS

// public class java2_collections{
//     public static void main(String args[]){

//         Queue<Integer> q=new LinkedList<>(); //Don't forget to keep<>

//         //add(); --> it's function is to add an element to Queue if succeessfull, returns True else throws exception

//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);

//         System.out.println(q);

//         //offer(); --> it's function is to add an element to Queue if succeessfull, returns True else returns false

//         q.offer(50);
//         q.offer(60);

//         System.out.println(q);

//         //element()

//         System.out.println(q.element());

//         //peek();

//         System.out.println(q.peek());

//         //remove()

//         System.out.println(q.remove());
//         System.out.println(q);

//         q.clear();

//         System.out.println(q);

//         //poll()

//         System.out.println(q.poll());

    

//     //--> every method used in list using linkedlist here also same but ..except one thing that here we cannot use addfirst(), addlast() methos bec here in queue we can add only at teh end/last soo there is no add first add last concept here
//     // if you are implementing DEQUE using LinkedList only --> then you will get addFirst addLast option but not in QUEUE  using LinkedList only

//     }
// }


//=====================================================================================================================================================================================================

//IMPLEMENTING QUEUE USING ARRAYDEQUE==>same as linkedlist ..offer(),poll(),peek()

//======================================================================================================================================================================================================

//IMPLEMENTING DEQUE USING ARRAYDEQUEU; ==>same as implementing queue from ArrayDeque but includes offerFirst(), offerLast(), pollLast(), pollFirst, peekFirts(), peekLast()..then clear(),size() are all common

//public class java2_collections{
//     public static void main(String args[]){
       
//        Deque<Integer> q=new ArrayDeque<>();

//        //offer(),offerFirst(),offerLast()

//        q.offer(10);
//        q.offerFirst(5);
//        q.offerLast(25);

//        System.out.println(q);

//        //poll(),pollLast(),pollFirst()

//        System.out.println(q.poll());
//        System.out.println(q);

//        q.pollLast();
//        System.out.println(q);

    
//     }
// }

//=================================================================================================================================================================================================================
 
//IMPLEMENTING DEQUE (using it as STACK depending upon the methods you use) USING ARRAYDEQUE

//see stack is a class it cannot be implemented again by the class arraydeque ...soo we replicate the behaviour of stack using deque
//In deque it is double sided queue insertion , deletion can be done on both the sides and it uses offerFirst(),offerLast(),peekFirst(),peekLast(),pollFirst(),pollLast()==>when you use this methods we'll use this as deque
//after implementing deque using arraydeque and if you use push(),pop(),peek() ==>it it becomes stack
//while using stack..you think pile of plates( plate1 palte2 plate3) but while implementing the stack in laptop it looks like ( palte3 plate2 plate1)..when you pop()==>plate3 will removes...just a confustion part look at it carefully 
//TRICK TO VIZUALISSE==>VIZUALISE IT AS YOU ARE PILING UP THE PLATES IN LEFT SIDE NOT FROM RIGHT SIDE
public class java2_collections{
    public static void main(String args[]){
        Deque<Integer> stack=new ArrayDeque<>();

        //push()

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        //pop();
         stack.pop();
        
        System.out.println(stack);

        //peek()

        System.out.println(stack.peek());
        System.out.println(stack);

        
    }
}







