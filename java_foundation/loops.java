//LOOPS
// | Loop       | Remember as        | When to use                                          |
// | ---------- | ------------------ | ---------------------------------------------------- |
// | `while`    | **"Check → Run"**  | When you don't know how many times the loop will run |
// | `do-while` | **"Run → Check"**  | When the loop must execute at least once             |
// | `for`      | **"Counted Loop"** | When you know the number of iterations               |


// you can start i from i=0 =====> i<10 or <=9 (10 iterations)
// if you  start i from i=1=======> i<=10      (10 iterations)
// if you start i from  i=10======> i>=1       (10 iterations)

// i can be from any value
// i can be till any value
// i can jump with any value

//for(start;end;inc/dec)

//sometimes you use i in the printing also soo make sure you start the i from 1 not 0 i=1;

//while using loop anywhere make sure you vizualize that it is loop again and again continuously
//you just think about one iteration or first iteration not all the iterations***important..then you will get to know what is happening after what

//be careful about infinite loop especially during while(true) not if(true) , i>0,
//try to use the run->start debug option to see each step in looping

// public class loops{
//     public static void main(String args[]){
        
//         int i=1;
//         while(i<=5){   //Don't keep while(true)=>infinite loop
//             System.out.println("Hello NamrathaNagaraj");
//             i++;
//         }
//         System.out.println(i);    //now i=6

//     }
// }

//NESTED WHILE LOOP

// public class loops{
//     public static void main(String args[]){

//         int i=1;
//         while(i<=5){
//             System.out.println("Hello" + i);
//             int j=1;
//             while(j<=3){
//                 System.out.println("Namratha" + i);
//                 j++;
//             }
//         i++;
//         }
//     }
// }



//  Using String.format() (✅ Yes)
// System.out.println(String.format("Namratha %d", i));

// Output:

// Namratha 1
// Namratha 2



//DO WHILE LOOP

// public class loops{
//     public static void main(String args[]){

//         int i=1;
//         do{
//             System.out.println("Hii Namratha");
//             i++;
//         }while(i<=4);
//     }
// }

//FOR LOOP  when i want to print same line multiple times and we use for loop, for also taking input ex.arrays (just think how many number of times that you want to print something....its your wish that how ypu print)


    //BASICS OF FOR LOOP


    //int i;  //declaring the variable outside the loop(Global variable) so that we can access it inside and outside,if we declare inside the loop means we can't access it outside the block
    //for(i=1;i<=5;i=i+1)    //printing 5 times    //initializing;condition;increment/decrement  //always remember to take i=1 not 0
    //for(i=5;i>0;i=i-1)    //reverse
    //for(i=0 ; i<5 ; i++)  //it can start from zero  also just think about that way also..soo what to take at the conditional part
    //for(i=1;i<=50;i=i+5)  // 5 bit difference (when to use,think logically).....whatever you want you can do ...increment  by 1 step ...2 step...5 steps ....decrement at any steps...do * operation
    // for(int i=1;i<=5;i=i+1) //declaring  inside the block(local variable),can access inside the block of for loop only {        
    //    System.out.println("Namratha" + i)   //printing both name and i value beside inside the block
    // }
    //System.out.println(i);    //printing i value ouside the block 
    //In for loop first you think think....how many time si should run this...and think what number to keep at the condition part ...not the initial part
    //for loop is mainly used to take the input from users



//printing 1 to 10 in straight
// public class loops{
//     public static void main(String args[]){
//         int i;                                //declaring the variable outside the loop(Global variable) so that we can access it inside and outside,if we declare inside the loop means we can't access it outside the block
//         for(i=1;i<=10;i+=2){
//             System.out.println("Namratha");
//         }
//     }
// }

//printing 10 to 1 in reverse manner

// public class loops{
//     public static void main(String args[]){

//         for(int i=10;i>=1;i--){
//             System.out.println(i);
//         }
//     }
// }


//  public class loops{
//        public static void main(String args[]){

//         for(int i=1;i<=7;i++){
//             System.out.println("Day"+" "+i);
             
//              for(int j=9;j<=17;j++){
//                 System.out.println("   "+j+" "+"-"+ "  "+(j+1));  //see why i am giving the bracket here bec it will get concatenated otherwise
//              }//see here ...THInk about the format to use ..it's about fromatDon't overwhelm with the kin dof reprentation dashes and all it's all about format you write inside the print statement
//               //and for  numbers just loops ...where to start , where to end...how much to incremnet ..that's it
//         }
//        }
//  }
   
