// java collection  framework==> It is  a tool/interface  that provides some functions /utilities inorder to implement the different data  structures(hash, Ques, arrays etc....)

// Collection (Interface)                   ---->object cannot be craeted directly
//     |
//   List     (Sub interface)               ---->object cannot be created directly
//     |
// ArrayList  (Class created inside the List)--->using this class we create the object

// - ArrayList, LinkedList, Stack, Vector ===> all are concrete class of the List interface

// -You can use all the methods under the Collection framework inside the sub interfaces also(Ex:list)
// -The methods of List interfaces  can be used inside it's classes like ArrayList, LisnkedList, Stack, Vector 



//--------------------------------------------------------------------------------------------------------------------------------------------

//REMEMBER THIS

// JAVA COLLECTION FRAMEWORK --> It is a root interface in the java collection hirarchy that contains sub interfaceses and classes to implement various data structures
// - Every interface or the sub interface containes various methods for doing operation
// - The methods which are common and accessible throughout the collection hirarchy are--> add(),remove(),addAll(),removeAll(),size(),clear(),iterator()
// - Collection interface cannot be implemented directly
// - subinterrfaces(List, sjtack , queue) can be implemented directly

// LIST INTERFACE --> it is an order collection that allows us to store and access the elements sequentially
//                --> how to use it??
//                     ArrayList<Integer> list = new ArrayList<>();
//                     List<Integer> list = new ArrayList<>();
//                     Collection<Integer> collection = new ArrayList<>(); 
//                -->  List interface classes = ArrayList,LinkedList, stack vector
//                -->  List Method = get(), set(), toArray(), contains() [includes all the Collection methods]

// ArrayList --> we use the ArrayList class to implement the functionality of resizable-arrays, it implements the List interface of the collections framework   
//     - ArrayList<Integer> list = new ArrayList<>(); //created the list data structure using array list
//     - All the methods of the Collection and the list can be accessible and usabe inside the array list
//     - The methods of ArrayList -->sort(), clone(), ensureCapacity(), isEmpty(), indexOf()

//very very very important thing in java collections is to first import the required interfaces and classes
//Don't forget to keep<>
//REMEMBER, while applying any method on any interface make sure that you use the q.(variable.) then apply teh method ...know that!!

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;


// public class java_collection{

//     public static void main(String args[]){

//     //     //LIst orr Collection -> Interface
//     //     //ArrayList -> Concrete class

//     //     //This is how you are going to create the object from the class ArrayList (Not able to create the object directly from the List and collection)
//     //     //Implementation -> ArrayList(concrete class)
//     //     //Reference -> ArrayList, List, Collection

//     //     //Now the list is available(This is how you are going to create the list (3 ways)using its class ArrayList and it name is list)

//     //     // ArrayList<Integer> list = new ArrayList<>();
//     //     // List<Integer> list = new ArrayList<>();
//     //     // Collection<Integer> collection = new ArrayList<>();  

        
//     //     ArrayList<Integer> list = new ArrayList<>(); //created the list data structure
//     //     All the methods of the Collection and the list can be accessible and usabe inside the array list
//     //     The methods of ArrayList -->sort(), clone(), ensureCapacity(), isEmpty(), indexOf()

//     //     //add() method

//     //     list.add(10);
//     //     list.add(20);
//     //     list.add(30);
//     //     System.out.println(list);
//     //     list.add(40);
//     //     System.out.println(list);

//     //     //remove() method -> removes element from the specific index

//     //     list.remove(0);
//     //     System.out.println(list);

//     //     //addAll()

//     //     List<Integer> list2 = new ArrayList<>();
//     //     list2.add(101);
//     //     list2.add(102);
//     //     list2.add(20);
//     //     System.out.println(list2);

//     //     list.addAll(list2);
//     //     System.out.println(list);

//     //     //removeAll() -> removes all same kind of elements (removes 20)-->look at this carefully
       
//     //    list.removeAll(list2);
//     //    System.out.println(list);

//     //    //size()
//     //    list.add(5);
//     //    list.add(10);
//     //    list.add(25);
//     //    System.out.println(list.size());
//     //    System.out.println(list);

//     //    //clear()

//     //    System.out.println("list 2 :" + list2);
//     //    list2.clear();
//     //    System.out.println(list2);
//     //    System.out.println(list2.size());    

//     //iterator() -> This is the standard way thr which we can travel through any data structure under the java collection

//     //    if you want to travel through the ArrayList then you need ArrayList iterator
//     //    if you want to travel through the LinkedList then you need LInkedList iterator
//     //    if you want to travel through the Stack then you need Stack iterator

//     //Iteartor has one special method called 
//     // * hasNext() ==> Two works it will do 1.Returns True if next  element is there in the list 2.Move to the next number ,Iterator.hasNext()
//     // * next()    ==> use it to access the next element                                                                   , Iterator.next()    

//     //Initially Iterator points before the first element                          


//     // ArrayList<Integer> list=new ArrayList<>();

//     // list.add(10);
//     // list.add(20);
//     // list.add(30);
//     // list.add(40);
//     // System.out.println(list);

//     // Iterator<Integer> it= list.iterator();   //create the iterator
//     // while(it.hasNext()){
//     //     System.out.println("element:" + it.next());
//     // }

//     //------------------------------------------------------------------------------------------------------------------------------
//     //List interface methods

//     // //get()
//     // ArrayList<Integer> list3= new ArrayList<>();

//     // list3.add(11);
//     // list3.add(12);
//     // list3.add(13);

//     // System.out.println(list3.get(0));

//     // //set()

//     // System.out.println("before set:"+list3);
//     // list3.set(0,101);
//     // System.out.println("After set:"+list3);

//     // //toArray
//     // Object[] arr = list3.toArray();
//     // for(Object obj : arr){
//     //     System.out.println(obj);
//     // }

//     // //contains

//     // System.out.println(list3.contains(101));

//     //------------------------------------------------------------------------------------------------------------------------------
//     //ArrayList interface methods

//     //sort()
    
//     // ArrayList<Integer> list4=new ArrayList<>();
//     // list4.add(42);
//     // list4.add(96);
//     // list4.add(78);
//     // list4.add(99);
//     // list4.add(100);
//     // System.out.println(list4);

//     // Collections.sort(list4);
//     // // HW--> how can we sort in decending order

//     // System.out.println(list4);  

//     //clone()

//     //if there is a collection/ArrayList/datastructure ..now you wnat to clone it soo  us clone() method
//     //**** Important thing here is that...clone() method only doe sthe shollow copy 
//     //know the difference bw teh shalllow copy and the deep copy

//     // ArrayList<Integer> list = new ArrayList<>();  //first list
//     // list.add(46);
//     // list.add(78);
//     // list.add(25);    
//     // ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone();  //second list
    
//     // System.out.println(newlist);
//     // System.out.println(list);


//     //ensureCapacity();

//     //ArrayList is dynamic in nature when you want to insert the new number then you can do so..
//     //but it effects the capacity(see the picture)
//     //soo while craeting the ArrayList only you set the minimum  size of the ArrayList using the ensureCapacity() function

//     // ArrayList<Integer> marks= new ArrayList();
//     // marks.add(10);
//     // marks.add(20);
//     // marks.add(30);
//     // marks.ensureCapacity(100);  

//     //isEmpty()

//     //  ArrayList<Integer> marks= new ArrayList();
//     // marks.add(10);
//     // marks.add(20);
//     // marks.add(30);
//     // System.out.println(marks.isEmpty());

//     //indexOf()

//     ArrayList<Integer> marks= new ArrayList();
//     marks.add(10);
//     marks.add(20);
//     marks.add(30);
//     System.out.println(marks.indexOf(20));
   
//     }
// }

//======================================================================================================================================================

// public class java_collection{
//     public static void main(String args[]){

//         //LINKED LIST 

// // - Unlike array linkedlist stores the values in the non contigious memory location(at random  places)
// // - the elements in the linkedlist is called Node
// // - each node will be of 3 parts 1. previous value address 2. value 3.next value address


// // CREATION OF LINKEDLIST

// // LinkedList<Integer> linkedlist = new LinkedList<>();
// // LinkedList<String> linkedlist = new LinkedList<>();
// // List<Integer> linkedlist = new LinkedList<>(); 
// // Collection<Integer> linkedlist = new Linkedlist<>();

// // - all the methods that  are working for the ArrayList works the sam eway inside the LinkedList as well Except clone()

// LinkedList<Integer> linkedlist = new LinkedList<>();
// linkedlist.add(4);
// linkedlist.add(8);
// linkedlist.add(14);
// linkedlist.add(25);
// linkedlist.add(4);
// linkedlist.add(4);
// System.out.println(linkedlist.lastIndexOf(4));

//     }
// }

//==================================================================================================================================================

// public class java_collection{
//     public static void main(String args[]){

//         //LINEKD LIST AS QUEUE AND DEQUE
//         //-->  Since the LinkedList also implements Queue and Deque interface, it can implemnet methods of this interfaces as well.here are some of the commonly used methods

//         LinkedList<Integer> ll= new LinkedList<>();

//         ll.add(25);
//         ll.add(35);
//         ll.add(45);
//         ll.add(55);

//         System.out.println(ll);

//         //addFirst()

//         ll.addFirst(15);
//         System.out.println(ll);

//         //addLast()

//         ll.addLast(65);
//         System.out.println(ll);

//         //removeFirst()

//         ll.removeFirst();
//         System.out.println(ll);
   
//         //removeLast()

//         ll.removeLast();
//         System.out.println(ll);

//         //getFirst()

//         System.out.println(ll.getFirst());

//         //getLast(      )

//         System.out.println(ll.getLast());

//         //peek()

//         System.out.println(ll.peek());

//         //poll() --> Returns and remove sthe first element from the LInkedList

//         System.out.println(ll.poll());
//         System.out.println(ll);

//         //offer() --> addLast()

//         ll.offer(75);
//         System.out.println(ll);


//     }
// }

//==================================================================================================================================================================

//KNOW THE DIFFERENCE B/W THE VECTOR AND THE ARRAYLIST (SEE THE PICTURE)

// public class java_collection{
//     public static void main(String args[]){

//         //VECTOR --> The Vector class is an implementation of the List interface  that allows us to create resizable-arrays similar to the ArrayList class

//         // Vector<Integer> v=new Vector<>();
//         // List<Integer>   v=new Vector<>();
//         // Collection<Integer> v=new Vector<>();

//         //Almost all the methods working inside the ArrayList do work here also inside the Vector
//         //EXCEPT isEmpty(), ensureCapacity(), addFirst(), addLast(), and LinkedList specific method swill not work here

//     }
// }

//==========================================================================================================================================

// public class java_collection{
//     public static void main(String args[]){

//         //STACK -->Java collection framework  has a Stack named class that provides the functionality of the stack data structure The Stack class extends the vector class
//         // - Stack class and the stack datastructure are not sam ethey are different know that
//         //- Stack works in the LIFO order (Ex.plates)
//         //- the common methods of the collection framework works in the stack also and there are some of the Stack specific methods such as 
//         // push(), pop(), peek(), search(), empty()--->This all are stack specific functions (works only when the reference is also Stack only)

//         // Stack<Integer> st=new Stack<>();   //creating  the stack(The refence and implementation both should be stack only )
//         // Stack<String> st=new Stack<>();
//         // List<Integer> st= new Stack<>();-->wrong if you are using stack specific functions

//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         System.out.println(st);
//         st.push(20);
//         System.out.println(st);
//         st.push(30);
//         System.out.println(st);
//         st.push(40);
//         System.out.println(st);

//         //pop()
//         st.pop();
//         System.out.println(st);

//         //peek() ->returns the top most element

//         System.out.println(st.peek());

//         //search()--> returns -1 if the element is not available , returns 1 if it finds element in first place, returns 2 if the element is there in 2nd place and soo on
//         System.out.println(st.search(10));

//         //empty()
//         System.out.println(st.empty());


// // see if you use list/ collections as the reference and craete the object using LinkedList, ArrayList, Stcak, Vector--> the all the Clases methods works in all other classes with some exception methods


//     }
// }

//==========================================================================================================================================================================================
