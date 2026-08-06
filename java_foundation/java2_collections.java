
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
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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

// public class java2_collections{
//     public static void main(String args[]){
//         Deque<Integer> stack=new ArrayDeque<>();

//         //push()

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.push(40);

//         System.out.println(stack);

//         //pop();
//          stack.pop();
        
//         System.out.println(stack);

//         //peek()

//         System.out.println(stack.peek());
//         System.out.println(stack);

        
//     }
// }

//====================================================================================================================================================================================================================================

//IMPLEMENTING QUEUE USING PRioRITY QUEUE

//you add the elements into the queue in the order 20,80,90,70..but it prints inn the order [20, 70, 90, 80]...because 
//The reason is:

// PriorityQueue stores elements internally as a Heap (a binary heap), not as a sorted list.

// A heap only guarantees one thing:

// The smallest element is always at the front (the root).

// It does not guarantee that all the remaining elements are in sorted order.

// So internally it may look like:

//         20
//        /  \
//      70    90
//     /
//   80

//-----------------------------------------------------------------------------------

//default behaviour in priority queue (if you are dealing with integers)-->less value --> Highest priority {This is nothing but min heap}
//high value--> Highest priority-->{This is nothing but max heap} --> use this to make it to behave as max heap using this lambda expression--> Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
//pq-->strings-->Comparator(will be taught in next classes)


// public class java2_collections{
//     public static void main(String args[]){

//     Queue<Integer> pq=new PriorityQueue<>();

//     //pq.offer()

//     pq.offer(20);
//     pq.offer(80);
//     pq.offer(90);
//     pq.offer(70);

//     System.out.println(pq);

//     //poll()

//     System.out.println(pq.poll());

//     }
// }

//===============================================================================================================================================================

//SET

// HashSet --> order is not going to be preserved(random order) --> Tc=O(1){bec all the insertion deletion or accsessiing eveything happens simply& easily no such complexity }
// LinkedHashSet --> order is going to be preserved (sma eorder given by user) --> TC=O(N){bec the removal or accessing element happens by travelling to one partiicular node (LinkedList concept)}
// TreeSet --> order is going to be in sorted manner --> TC=O(logN){this is based on binary search tree concept  where the Tc=log(N) soo here also O(logN)}


// //IMPLEMENTING SET USING HASHSET

//the order is not preserved while printing the set(bec when you provide the vlaues into it in order wise..it take seach value and stores it in set in one particular place using hascodes ..and that hashcodes are random soo that order is also random )
//Only unique values are allowed no duplicate values are allowed


// public class java2_collections{
//     public static void main(String args[]){
     
//      Set<Integer> set1=new HashSet<>();
//      Set<Integer> set2=new HashSet<>();

//      //add()

//     //  st.add(10);
//     //  st.add(20);
//     //  st.add(10);
//     //  st.add(10);
//     //  st.add(10);
//     //  st.add(20);
//     //  st.add(10);
//     //  st.add(10);
//     //  st.add(30);
//     //  System.out.println(st);

//     //retainAll() -->Intersection of set(common among the 2 sets gets retained)

//     // set1.add(1);
//     // set1.add(2);
//     // set1.add(3);
//     // set1.add(4);

//     // set2.add(3);
//     // set2.add(4);
//     // set2.add(5);
//     // set2.add(6);

//     // System.out.println(set1);
//     // System.out.println(set2);

//     // set1.retainAll(set2);
//     // System.out.println(set1);

//     //containsAll()

//     set1.add(1);
//     set1.add(2);
//     set1.add(3);
//     set1.add(4);

//     set2.add(3);
//     set2.add(4);
//     set2.add(5);
//     set2.add(6);

//     System.out.println(set1);
//     System.out.println(set2);

//     System.out.println(set2.containsAll(set1));


//     }
// }

//==================================================================================================================================

//IMPLEMNETIING SET USING LINKEDHASHSET

//here the order is going to preserve

// public class java2_collections{
//     public static void main(String args[]){
    
//     Set<Integer> lhs = new LinkedHashSet<>();

//     //add()

//         lhs.add(10);
//         lhs.add(20);
//         lhs.add(10);
//         lhs.add(10);
//         lhs.add(10);
//         lhs.add(20);
//         lhs.add(10);
//         lhs.add(10);
//         lhs.add(30);
//         System.out.println(lhs);
//     }
// }

//===================================================================================================================================

//IMPLEMNETIING SET USING TREESEt

//here the order is going to be in sorted manner

public class java2_collections{
    public static void main(String args[]){
    
    Set<Integer> lhs = new TreeSet<>();

    //add()
        
        lhs.add(40);
        lhs.add(10);
        lhs.add(20);
        lhs.add(10);
        lhs.add(10);
        lhs.add(10);
        lhs.add(20);
        lhs.add(10);
        lhs.add(10);
        lhs.add(30);
        System.out.println(lhs);
    }
}










