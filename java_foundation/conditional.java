// public class conditional {
//     public static void main(String[] args) {

//         // //ifelse
//         // int x = 17;
//         // if(x>10)
//         // System.out.println("graeter than 10");
//         // else
//         // System.out.println("Lesser than 10");
//         //-----------------------------------------------------------

//         //if x is greater print Y , if Y is greater than print x

//         int x=10;
//         int y=41;
//         if(x>y){
//             System.out.println(y);
//         }
//         else{
//             System.out.println(x);
//         }
//     }
// } 

//Taking age as input and printing if person is eligible to vote or not (if means ifelse statement)

// public class conditional{
//     public static void main(String args[]){
//         int age=1;
//         if(age>=18){
//             System.out.println("Eligible to vote");
//         }
//         else{                                              //taking condition is important and analyse why we dont write condition for else(bec we are sure that)  //using else or if else is optional  and its not mandatory to use it , you can ommit it                                          
//             System.out.println("Not eligible to vote");
//         }
//     }
// }

// /*Using multiple if statements is not good because compiler is going to check all if condition even though previous conditions is true and executed
// so go with if ,else condition for simple questions and
// go with else if condition while solving the problems having multiple conditions....multiple co   ndition ...multiple condiyion
// Be very careful while taking the condition inside the if , else if and Think the logic to  use there
// you can use if , else if and else statements together (can use else for writing the last invalid statements)*/

//Taking the marks from the user and  printing the respective grades


// public class conditional {
//     public static void main(String args[]){
//         int marks=100;

//         if(marks>=90){            //we can write the condition as (marks>25 && marks<=44),but here the if case has failed then you came to check else if,then marks is not <25 means then it is assured  and it is obvious that marks>25 so why should i write it
//             System.out.println("A");
//         }
//         else if(marks>=75){
//             System.out.println("B");
//         }
//         else if(marks>=60){
//             System.out.println("C");
//         }
//         else{
//             System.out.println("D and failed");
//         }
//     }
// }

//Nested if

public class conditional{
    public static void main(String args[]){

       int age=40;

       if(age>=60){
        System.out.println("eligible to vote but retairement period");
       }
       else if(age>=50){
        System.out.println("Eligible to vote");
        if(age>=58){
            System.out.println("but retirenmnet soon");
        }
       }
       else if(age>=18){
        System.out.println("Eligible to vote but retirenment is not there in the near future");
       }
       else{
        System.out.println("Not eligible to vote");
       }
    }
}