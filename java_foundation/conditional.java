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

//Nested if ....NESTED CONDITIONAL STATEMENT (If i want to say extra thing  to a particular group i use this nested concept)


// public class conditional{
//     public static void main(String args[]){

//        int age=40;

//        if(age>=60){
//         System.out.println("eligible to vote but retairement period");
//        }
//        else if(age>=50){
//         System.out.println("Eligible to vote");
//         if(age>=58){
//             System.out.println("but retirenmnet soon");
//         }
//        }
//        else if(age>=18){
//         System.out.println("Eligible to vote but retirenment is not there in the near future");
//        }
//        else{
//         System.out.println("Not eligible to vote");
//        }
//     }
// }


//if else  if

//Q. CHECKING THE GREATEST OF ALL THE THREE NUMBERS(brute force solution)

// public class conditional{
//     public static void main(String args[]){
//         int x=5;
//         int y=4;
//         int z=9;

//         if(x>y && x>z){
//             System.out.println(x);
//         }
//         else if(y>z){
//             System.out.println(y);
//         }
//         else{
//             System.out.println(z);
//         }
//     }
// }

//OPTIMAL SOLUTION(handles ties also)

// public class conditional {
//     public static void main(String args[]) {

//         int x = 5;
//         int y = 4;
//         int z = 9;             //see what this optimal solution doing here is ...first it checks whetehr x is graeter than y and z..if falsethere will be 3 cases
//                                //if first condition is only true, then GAME OVER ..x is the highest...if false..then 3 condition
//         if (x >= y && x >= z) {      //1.x is lesser than y ...2.x is lesser than z ...3.x is lesser than both x and y
//             System.out.println(x);   //In all this 3 cases one thing is clear that ..if , if condition is failing then is "not largest of all three"..it is smallest than atleast any one
//         }                            //then the control is moving to else if 
//         else if (y >= z) {           //now it is very sure that x is lesser than any one or both..then very sure that x is not 1st largest then x is out of the game..now the game is bw y and z only
//             System.out.println(y);   //soo in  else if condition we are checking y>z...then in else condition z>y...
//         }                            //soo during this problem on thing i am braining here is....we are trying to remove that one variable which is "not 1st greater"...then it is out of game ..then comparing another 2...eliminating candidates
//         else {
//             System.out.println(z);
//         }
//     }
// }

//FINDING THE 1ST GREATEST,2ND GREATEST,3RD GREATEST NUMBER AMONG TEH THREE NUMBERS(IF MANY NUMBERS THEN YOU AHVE TO GO WITH THE SORTING TECHNIQUE)

// public class GreatestOrder {
//     public static void main(String[] args) {

//         int x = 5;
//         int y = 4;
//         int z = 9;

//         int first, second, third;

//         // Find the greatest
//         if (x >= y && x >= z) {
//             first = x;

//             // Find 2nd and 3rd among y and z
//             if (y >= z) {
//                 second = y;
//                 third = z;
//             } else {
//                 second = z;
//                 third = y;
//             }

//         } else if (y >= x && y >= z) {
//             first = y;

//             // Find 2nd and 3rd among x and z
//             if (x >= z) {
//                 second = x;
//                 third = z;
//             } else {
//                 second = z;
//                 third = x;
//             }

//         } else {
//             first = z;

//             // Find 2nd and 3rd among x and y
//             if (x >= y) {
//                 second = x;
//                 third = y;
//             } else {
//                 second = y;
//                 third = x;
//             }
//         }

//         System.out.println("1st Greatest : " + first);
//         System.out.println("2nd Greatest : " + second);
//         System.out.println("3rd Greatest : " + third);
//     }
// }

//"Print the greatest value and also tell which variable(s) have that greatest value."(using max function)

// public class Greatest {
//     public static void main(String[] args) {

//         int x = 5;
//         int y = 5;
//         int z = 1;

//         int max = Math.max(x, Math.max(y, z));

//         System.out.println("Greatest Value = " + max);

//         if (x == max)
//             System.out.println("x is greatest");

//         if (y == max)
//             System.out.println("y is greatest");

//         if (z == max)
//             System.out.println("z is greatest");
//     }
// }

//"Find the greatest number using only if-else and also print all variables that share the greatest value."(using if else method)


// public class Greatest {
//     public static void main(String[] args) {

//         int x = 5;
//         int y = 5;
//         int z = 1;

//         if (x >= y && x >= z) {

//             System.out.println("Greatest Value = " + x);

//             System.out.println("x is greatest");

//             if (y == x)
//                 System.out.println("y is also greatest");

//             if (z == x)
//                 System.out.println("z is also greatest");

//         }
//         else if (y >= x && y >= z) {

//             System.out.println("Greatest Value = " + y);

//             System.out.println("y is greatest");

//             if (x == y)
//                 System.out.println("x is also greatest");

//             if (z == y)
//                 System.out.println("z is also greatest");

//         }
//         else {

//             System.out.println("Greatest Value = " + z);

//             System.out.println("z is greatest");

//             if (x == z)
//                 System.out.println("x is also greatest");

//             if (y == z)
//                 System.out.println("y is also greatest");

//         }
//     }
// }

//checking even or odd, IF EVEN THEN GIVE ME 10 IF ODD GIVE ME 20

// public class conditional{
//     public static void main(String args[]){
//         int n=10;
//         int result=0;

//         if(n%2==0){
//             result=10;  //SEE HERE THEY ASKED US TO GIVE 10 MEANS ..YOU ARE SUPPOSE TO PRINT 10..INSTAED YOU USE STORE THE VALUE 10 IN A VARIABLE INITIALIZED BEFORE
//         }
//         else{
//             result=20;
//         }
//     }
// }

//TERNARY OPERATOR(?:) [variable= condition:true:false]

public class conditional{
    public static void main(String args[]){
        int n=2;

        int result = n%2==0?10:20;

        System.out.println(result);
    }
}