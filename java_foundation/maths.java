//QUESTIONS

// 1. Extracting each digit from number in reverse fashion (1 way)
// 2. Counting no of digits in a number                    (2 ways)
// 3. Reversing the Number
// 4. Palindrome
// 5. Amstrong Number
// 6. No of Divisors/factors
// 7. prime number
// 8. GCD/HCF of a number

//DIGITS

// '%'==> gives remainder(while doing soo quotient should be integer(integral division))
// '/'==> gives quotient(while doing so the quotient can  be either decimal or integer (deciaml or integral division))

//very important...java doesnot works like the general mathematics when it comes to rounding off concept (if  7789/10...it is 778.9==> it doesn't roundoff to 779...it just truncates or remove sthat .9 that's it)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//remember one rule....when you have both the numerator and denominator in division(devisor and dividend) are integers (not decimal values)
//  '%' works on integral division (always always % works if both the numbers are integer 9/10...7/6.....it will not work for 0.9/10....10/0.2)
//  '/' works on decimal division
//means when you are doing modulous % always the result /quotient shd be integer(not decimal)...not suppose to use .0 and all...just integer
//when you are doing normal division using '/' you can put . then 0 and do division the quotient can be decimal or integer

//if you are something like 0.7/10.....it is the decimal division the point is allowed in the quotient

//===========================================================================================================================================================================================

//Q1.EXTRACTING EACH digit from the number n [n is a number not a single digit think like that](in reverse fashion)(see picture)

//To extract the last digit in the number  ======> %10 (just always remember what is the work of %10 and /10 )
//To create the decimal point at the last of number and to round off the number=====> /10 (here very very very imppp thing to remember is ***** the number is mdifying itself ..itself...n=n/10; like n=n+1,n+=1,n++ by undergoing some arithmatic operation)

//Ex=7789(dry run it)

// 7789%10=9....here % and / is happening  again and again...soo loops 
// 7789/10=778.9==778%10=8
// 778/10=77.8==77%10=7
// 77/10=7.7==7%10=7
// 7/10=0.7==0%10=0

//Q1. Extracting the digits from number in *****REVERSE ORDER ****(Trick to remember==> while(n>0) do %10 , print , do /10)


// public class maths{
 
// public static void extract(long n){
//   while(n>0){                           //till where the loop should run ..till it becomes 0...here we are talking about the edge case
//             int lastdigit=n%10;              //gives the lastdigit simple..simple but number remains same ..//1. Extracting the last digit 2. printing it(still the number remains same) 3. making it a decimal number and truncationg it...repeate
//             System.out.println(lastdigit+" "); //print the last digit(don't forget it)
//             n=n/10;                          //keeps points and removes it and give the integer part...//analyse this line..when a numebr what to undergo any kind of modification..anykind  i mean any kind (whetehr it may be +,-,%,/)and modify itself then this is how you have to write it
// }                                            //Always remember one thing ..before moving to next iteration/loop after completing first iteration....for sure a number should undergo some change/modificxation  or should cut down itself otherwise infinte loop

// }
//  public static void main(String args[]){
//         int n=7789;
//         int digit=extract(n);       
//    }
// }

//============================================================================================================================================================================================================================================================================================================

//Q2. Given the number 'n'.Find out and return the NUMBER( IF 'NUMBER' is present THEN COUNT IS DEFINITLY GOING TO BE THERE) of digits present in a given number (num of  digits you find means count variable is definitely going to be there)(Trick to remeber ===>keep doing n/10 and keep counting digits or use formula)

//METHOD 1(don't use this method)

// public class maths{
    
//     public static int countdigits(long n){
//         int count1 = 0; //make sure you always define the variable in java ..not just declaring it .but you shoudl define it otherwise it is going to store teh garbage value
//         while (n > 0) {
//             count1 = count1 + 1;
//             n = n / 10;
//         }
//         return count1;   //remember the return keyword should be used immediately before the close bracket
//     }

//     public static void main(String args[]){
//     long n=79;
//     int digits=countdigits(n);
//     System.out.println(digits);
// }
// }


//METHOD 2(this is the best method)

// public class maths{

//     public static int countdigits(long n){  //be mindfull about taking datatype
//         if(n==0) return 1;      //edge cases (here edge cases are 0 and <0[-ve values])
//         if(n<0) n=-n;
//         int count1=0;
//         while(n>0){
//             count1=count1+1;    // While loop iterates until 'n' becomes 0 (no more digits left).
//             n=n/10;
//         }
//         return count1;

//     }

//     public static void main(String args[]){
//        long n=5689;
//        int digits=countdigits(n);
//        System.out.println(digits);

//     }
// }


//method 3(prefer this)


// public class maths{

//     public static int countdigits(long n){         //be mindfull about taking datatype
//         if(n==0) return 1;                         //3 edge cases(n=0, n=-ve,sometimes log10(n) provies floating number likes 2.99999)
//         if(n<0) n=-n;                              //or abs(n) for positive number
//         int count = (int)(Math.log10(n) + 1);      //I want the integer part of the result not just the decimal part..so i kept int()
//         //or int count=(int)(Math.log10(n)+1e-9)   //sometimes log10(N) gives 2.999999 for like 1000 (but i expect 3.566 and adding 1 becomes ans 4)..so 1e-9 just pushes 2.999 to 3

//         return count;

//     }

//     public static void main(String args[]){
//        long n=5689;
//        int digits=countdigits(n);
//        System.out.println(digits); 

//     }
// }

// EXPLAINATION== see log10(4215)=3.89 something,3.89+1=4.89,if you take integer portiuon of it int(4.89)==4
// soo int(log10(n)+1e-9)=you'll get the number of digits in the number directly

//==================================================================================================================================================================================================================================

//TC= loop is running the number of times the n is getting divisible by 10 == if number is divisible by 10 then remember always tc=log10(N)..if it is getting dividible by 5 TC=log5(N)..if it is getting divisible by 2 log2(N)
//REMEMMBER THSI ALWAYS***===if the no. of iteration is based on the division then always always always the TC is going to be interms of log
//TC for method 3 is O(1)====> constant time complexity(bec it is the mathematical function operation)
// if(n==0)
// if(n<0)
// n=-n
// (int)(...)
// return count
//this above operations TC is also O(1)-->soo overall constant or unit tc
//TC for method 2 is (since it involve the loop in it and doing divisibele by 10 )==O(log10(N))==O(log N)

//Questions
//when the TC is going to be O(1),O(logn),O(n)???

//-------------------------------------------------------------------------------------------------------------------------------------------------------------
//Another edge case if n=00 or n=000.....then
//case 1: if you are taking the datatype as int or long (oure numbers)..then 00 or 000 is treated as 0 itself..soo it will return 1
//case 2: if you want to count 00 or 000 as 2 and 3 digits then..take the datatype as string..then find the length of string

//remember(IF YOU WANT TO GET THE INTEGER PART THEN FOLLOW THIS)
//in java division '/10' ==== 7125.9 ---->7125 (just removes decimal part) if both the numbers are integers
// int(4534.2356)---->removes the decimal part (just gives the integer by removing the decimal part , don't round off to nearest number)
//floor(3.625)===>Remove the decimal part and go to the nearest integer on the left side of the number line. ...floor(-2.3)--->-3 ...Remove the decimal part and go to the nearest integer on the left side of the number line...because -3 is the greatest integer that is ≤ -2.3.

//==========================================================================================================================================================================================================================================================================================

//Q3. write a program to generate reverse of a given number N.Print the corresponding reverse number NOTE:if a number has trailing zeros,then it's reverse will not include them.for EG.Reverse of 10400 will be 401 instead of 00401(Trick to remember is: first number na reverse maadi imagine maado then,ond ondee numbers na thago then jodsu )


//(NOTE:Don't think in the foolish way like...extract the digit in the reverse order than it becomes reverse number..NOOo it is the individial numbers in reverse manner I want the number in reverse order all at once in the form of once , tens , hundreds , thousands manner)
//But keep extraction of digits concept as handy and add some other logic to do athor problems
//DRY RUN---->soo here we should think that we should start it from 0(think 0 is there in front of 9)******important thing is that
//then again remember on thing ...the variable you are using in modification concept(which is constantly changing)
// 7789 =====> 9877

//recognize the pattern here

// (0*10)+9= 9
// (9*10)+8  = 98                 see one thing here...here we are retaining the same value as it is , but at the same time doing some modifications to it=====>then what  you shd think of?? you should think like this n=n/10, n=n+1, rev=(rev*10)+lastdigit
// (98*10)+7 = 987
// (987*10)+7 = 9877



// public class maths{

//     public static long reversenumber(long n){
//         if(n/10==0) return 1;          //edge case(if the number is just one digit tehn we cannot reverse it just return 1)
//         if(n<0) n=-n;

//         long rev=0;
//         while(n>0){
//             //int rev=0;                      //never ever initialize inside the loop..it will be looping..again you end up being 0 after each loop
//             long lastdigit=n%10;             
//             rev=(rev*10)+lastdigit;           //see first first first of all the rev = 0...9 is  lasdtdigit then it is becoming rev ,8 is last digit then it is becomeig rev means means means .....now you should think that, it has stores in one variable then it is getting stored in another variable===>mean second variable should  be 0 at first rev=0; (Example=count=0)  mean at this point you are suppose to think that...rev is reducing itself soo rev=rev  (n=n/)
//             n=n/10;                           //see this logic rev=(rev*10)+lastdigit; is very very important just analyse it very carefully... n%10 is going to gte me the last digit 9 ....I wnat to make it first digit ****(bec of reverse order)...soo now 1. I want to keep that 9 exactly as it is ..No change should be there 2.get the second number 5 do some connection bw 9 & 5(i.e., 9*10+8)..you got the logic now but the carefull thing here is you should keep 9 asit is as soon as you get it from %...soo you should think of rev=0
//         }
//         return rev;
//     }


//     public static void main(String args[]){
//        long n=21159;
//        long reverse=reversenumber(n);
//        System.out.println(reverse);
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//LEETCODE PROBLEM(REVERSING A  NUMBER)


// Q.Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1

// class Solution {
//     public int reverse(int x) {

//        int reversedigit=0;
//        while(x!=0){              //it is allowing both +ve nad -ve numbers ....soo if it si not 0 then for alll the numbers you run the code
         
//         int lastdigit=x%10;      //analys ehwy you are putting overflow edgecase before reversing the digit

//         if((reversedigit>Integer.MAX_VALUE/10) || (reversedigit==Integer.MAX_VALUE/10 && lastdigit>7) || (reversedigit<Integer.MIN_VALUE/10)|| (reversedigit==Integer.MIN_VALUE/10 && lastdigit<-8)){ //overflow edge case
//             return 0;
//         }
//         reversedigit=(reversedigit*10)+lastdigit;
       
//         x=x/10;
//        }
//        return reversedigit;
//     }
// }

//EXPLAINATION
 
//(reversedigit>Integer.MAX_VALUE/10) WHY I AM USING THIS???? ==> bec precaution is better than cure(think what happens next  earlier only)..if any reversed value comes nad tells I am alraedy graeter than Interger.MAX_VALUE/10...Interger.MAX_VALUE/10 tells you are aleardy graeter than me(further if you go nad do operation rev=rev*10+lastdigit) you'll become *10+lastdigit still greater ..even greater than Integer.MAX_VALUE(analyse with the example)..soo prevention is better than cure soo i ma checking now only soo return 0
//2. if  you are equal to Interger.MAX_VALUE/10 and lastdigit<7 then there is a posiibility for you to complete this iteration and give final rev value
//2. if  you are equal to Interger.MAX_VALUE/10 and lastdigit>7 then further you cannot go here only eliminated..bec you are greater than me now only..further you go mean syou'll become still greater


//===========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================

//Q4.Wrie a program to determine if a number is  palindrome or not.Print true if it is plaindrome ,false otherwise
//(palindrome are the numbers for which Reverse is Excatly same as the original one)
//Trick to remember: take a original number ******** not after doing opearation, reverse it ,compare it(NOTE: n shd be stored in any variable and use for comparision)

// public class maths{

//     public static boolean palindromeNum(long n){

//         //if(n/10==0) return "false"; single number is also a palindrome
//         if(n<0) return false;     //Most interview questions consider -121 not to be a palindrome because reversing it gives 121- which is not the same.
//         long rev=0;
//         long original=n;
//         while(n>0){    //n 0 aadmele loop end aagutte AT last n=0;
//            long lastdigit=n%10;
//            rev=(rev*10)+lastdigit;
//            n=n/10;
//         }

//         // if(rev==n) return "true";   see the mistake you have done here ...after each loop n is getting reduced and finally it become 0 then loop ends ..now you rae comapting n=0 with rev=121 soo false even though it is palindrome    
//         // else return "false";

//         if(rev==original) return true;
//         else return false;

//         //return reverse == original;(OPTIMIZED WAY)no need to write true or false...== returns true or false only(use this simplese way especially when you wnat to return true or false)
//     }

//     public static void main(String args[]){
//         long n=122;
//         boolean pal=palindromeNum(n);
//         System.out.println(pal);
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//LEETCODE QUESTION ON PALINDEOME

// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

//SOLUTION

// class Solution {
//     public boolean isPalindrome(int x) {
//         int original=x;
//         int reverse=0;
//         if(x<0){
//             return false;
//         }
//         while(x>0){
//             int lastdigit=x%10;
//             reverse=(reverse*10)+lastdigit;
//             x=x/10;
//         }
//         if(reverse==original){
//             return true;
//         }
//         else return false;
//     }
// }

//=======================================================================================================================================================================================================================================

//Q5. Check if a number is Amstrong number or not
//(Amstrong number= take a number , count the number of digits in it, raise teh number to the power of number of digits , sum it comapre with original/an Armstrong number is a number that equals the sum of its digits raised to the power of the number of digits in the number. )
//TRICK TO REMEMBER ==> take a number , extract total no of digits, ectract each digit, rase each digit to the total no of digits and sum it
//if you find somewhere ..where you need to sum some numbers one after another then it is nothing but keep adding one after another ..means modifying means sum=sum+

// public class maths{

//     public static boolean isAmstrong(long n){
        
//         //EDGE CASES
//         if(n<0) return false; //bec nagative  numbers are not amstrong numbers
//         if(n==0) return true; //bec here my code does not allow 0, it allows only numbers after 0...and also log(0)=undefined

//         long sum=0;
//         long original=n;
//         long digits=(int)(Math.log10(n) + 1 + 1e-9);
//         while(n>0){

//             long lastdigit=n%10;  //**** if n%10 is there then n/10 is going to be there for sure tehy are like mates
//             sum = sum + (long)Math.pow(lastdigit,digits); //you cannot use ** java, nor lastdigit**digits
//             //if you wnat to take power use..Math,power(down number,up number)==>but it returns double ...soo type cast it
//             n=n/10;

//         }
//         if(sum==original) return true;
//         else return false;

//         //return sum==original
//     }


//     public static void main(String args[]){
//        long n=153;
//        boolean amstrongnum=isAmstrong(n);
//        System.out.println(amstrongnum);
//     }
// }

//==============================================================================================================================

//Q6.Printing all the DIVISORS of a number
//(Trick to remember==> the divisors of a number n is going to be inbetween 1 to n, loop from 1 to n , check i%n==0, print )
//Tc=since the loop is running n time s====>O(N)


//METHOD 1

// public class maths{

//     public static void printDivisors(long n){
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }

//     public static void main(String args[]){
//         long n=4;
//         printDivisors(n);
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------------------------

// //METHOD 2 (divisors occurs in pairs ..soo check till root n not till n)(OPTIMIZED CODE===USE THIS)

//(Trick to remember= loop till  root n, n%i==0, n/i)
// if n=36
// 1 36  
// 2 18
// 3 12
// 4 9
// 6 6 ----> to avoid this 6 printing 2 times we are using the condition if(1 != n/1) then print n/i

// public class maths {

//     public static void printDivisors(long n) {

//         for (long i = 1; i * i <= n; i++) {

//             if (n % i == 0) {

//                 System.out.print(i + " ");

//                 if (i != n / i) {
//                     System.out.print((n / i) + " ");
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {

//         long n = 36;
//         printDivisors(n);
//     }
// }

//-----------------------------------------------------------------------------------------------------------------------------------------
//Getting the devisiors in the sorted manner
//first store the unorder factors in a list(bec we don't know how amny factors and what is their size..doo for storing the undefined data structure use the list) then sort that list

//TC=O(srwt(N))


// import java.util.*;

// public class Main {
//     static void printDivisors(int n) {
//         ArrayList<Integer> ls = new ArrayList<>();

// TC = O(sqrt(n))===>motive is that the no of dividiors can be finde out using O(sqrt(n) time complexity also)
//         for (int i = 1; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 ls.add(i);
//                 if ((n / i) != i) {
//                     ls.add(n / i);
//                 }
//             }
//         }
// TC: O(n log n ) n=no of factors

//         Collections.sort(ls);

// TC= O(n) = for printing 
//         for (int it : ls) {
//             System.out.print(it + " ");
//         }
//     }

//     public static void main(String[] args) {
//         printDivisors(36);
//     }
// }


//=======================================================================================================================================================

//Q.PRIME NUMBER (the number which it divisible by 1 nad itself is wrong bec it is wrong in case of 1 bec 1 has only 1 factor not 2)
//CORRECT DEFINITION =====>  a number shd have 2 factors 1 and itself 

// public class maths{

//    public static boolean isprime(int x){

//     if(x==0 || x==1) return false;
//     if(x<0) return false;
//     int count=0;
//     for(int i=1;i*i<=x;i++){

//         if(x%i==0){
//             count++;
//             if(x/i !=i){
//                 count++;
//             }
//         }
//     }
//     if(count==2) return true;
//     else return false;

//    }

//    public static void main(String args[]){
//       int x=25;
//       boolean pri=isprime(x);
//       System.out.println(pri);
//    }
// }

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//METHOD 2(OPTIMISED CODE having TC as sqrt(n))=====> just loop from 2 and check till sqrt(n)...if any divisoprd false, no divideoors return true(no need to check for1 . 1 is divisible  by all)

//TC=O(sqrt(N))

// public class Maths {

//     public static boolean isPrime(int x) {

//         // Prime numbers are greater than 1
//         if (x <= 1) {
//             return false;
//         }

//         // Check divisibility from 2 to √x
//         for (int i = 2; i * i <= x; i++) {

//             if (x % i == 0) {
//                 return false; // Found a divisor
//             }
//         }

//         return true; // No divisor found
//     }

//     public static void main(String[] args) {

//         int x = 29;

//         System.out.println(isPrime(x));
//     }
// }

//==============================================================================================================================================================================================================

//Q. FINDING THE GCD OR HCF OF TWO NUMBERS GIVEN

//BRUTE FORCE MEETHOD
//N1, N2


// import java.util.*;

// public class maths{

//     public static int gcd(int N1, int N2){
//              int gcdorhcf=1;                       //here you should know why they are teking gcd=1 before only
//         for(int i=1;i<=Math.min(N1,N2);i++){

//             if((N1%i==0)&&(N2%i==0)){
//                 gcdorhcf=i;
//             }
//         }
//         return gcdorhcf;
//     }

//     public static void main(String args[]){
//         int N1=9;
//         int N2=13;
//         int hcf=gcd(N1,N2);
//         System.out.println(hcf);
//     }
// }

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//OPTIMISED METHOD /WORST CASE METHOD

// import java.util.*;

// public class maths{

//     public static int gcd(int N1, int N2){
//         for(int i=Math.min(N1,N2);i<=1;i--){
//             if(N1%i==0 && N2%i==0){
//                 return i;
//                 break;
//             }

//         }
//     }

//     public static void main(String args[]){
//          int N1=9;
//         int N2=13;
//         int hcf=gcd(N1,N2);
//         System.out.println(hcf);
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//EUCLIDIAN ALGORITHM

// gcd(a,b) = gcd(a-b,b)--->you do it tell one of them become 0 then the other one is the gcd of that two numbers -->tedious process

// go with this

// gcd(a,b) = gcd(a%b,b) [where a>b] --> then go till one of them is 0 and the other is your gcd









