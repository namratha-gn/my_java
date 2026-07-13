//DIGITS

// '%'==> gives remainder(while doing soo quotient should be integer(integral division))
// '/'==> gives quotient(while doing so the quotient can  be either decimal or integer (deciaml or integral division))

//very  important...C++ doesnot works like teh general mathematics when it comes to rounding off concept (if  7789/10...it is 778.9==> it doesn't roundoff to 779...it just truncates or remove sthat .9 that's it)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//remember one rule....when you have both the numerator and denominator in division(devisor and dividend) are integers (not decimal values)
//  '%' works on integral division (always always % works if both the numbers are integer 9/10...7/6.....it will not work for 0.9/10....10/0.2)
//  '/' works on decimal division
//means when you are doing modulous % always the result /quotient shd be integer(not decimal)...not suppose to use .0 and all...just integer
//when you are doing normla division using '/' you can put . tehn 0 nad do dividion the quotient can be decimal or integer

//if you are something like 0.7/10.....it is the decimal division the point is allowed in the quotient

//===========================================================================================================================================================================================

//EXTRACTING EACH digit from the number(in reverse fashion)(see picture)

//To extract the last digit in the number  ======> %10
//To create the decimal point at the last of numebr and to round off the number=====> /10

//Ex=7789

// 7789%10=9
// 7789/10=778.9==778%10=8
// 778/10=77.8==77%10=7
// 77/10=7.7==7%10=7
// 7/10=0.7==0%10=0

//Q1. Extracting the digits from number


// public class maths{
 
// public static void extract(long n){
//   while(n>0){                           //till where the loop should run ..till it becomes 0
//             int lastdigit=n%10;              //gives the lastdigit simple..simple but number remains same ..//1. Extracting the last digit 2. printing it(still the number remains same) 3. making it a decimal number and truncationg it...repeate
//             System.out.print(lastdigit+" "); //print the last digit(don't forget it)
//             n=n/10;                          //keeps points and removes it and give the integer part...//analyse this line..when a numebr what to undergo any kind of modification..anykind  i mean any kind (whetehr it may be +,-,%,/)and modify itself then this is how you have to write it


//         }

// }
//  public static void main(String args[]){
//         int n=7789;
//         int digit=extract(long n);       
//    }
// }


//Q2. Given the number 'n'.Find out and return the number of digits present in a given number

//METHOD 1(don't use this method)

// public class maths{
    
//     public static int countdigits(long n){
//         int count1 = 0;
//         while (n > 0) {
//             count1 = count1 + 1;
//             n = n / 10;
//         }
//         return count1;
//     }

//     public static void main(String args[]){
//     long n=79;
//     int digits=countdigits(n);
//     System.out.println(digits);
// }
// }


//METHOD 2(this is the bets method)

// public class maths{

//     public static int countdigits(long n){  //be mindfull about taking datatype
//         if(n==0) return 1;      //edge cases
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


public class maths{

    public static int countdigits(long n){  //be mindfull about taking datatype
        if(n==0) return 1;      //3 edge cases(n=0, n<0)
        if(n<0) n=-n;  //or Math.abs(n)
        int count1 = 0;
        while (n > 0) {
            count1 = count1 + 1;
            n = n / 10;
        }
        return count1;

    }

    public static void main(String args[]){
       long n=5689;
       int digits = countdigits(n);
       System.out.println(digits);

    }
}






// EXPLAINATION== see log10(4215)=3.89 something,3.89+1=4.89,if you take integer portiuon of it int(4.89)==4
// soo int(log10(n)+1)=you'll get thw number of digits in the number

//TC= loop is running the number of times the n is getting divisible by 10 ==if number is divisible by 10 then remember always tc=log10(N)..if it is getting dividible by 5 TC=log5(N)..if it is getting divisible by 2 log2(N)
//REMEMMBER THSI ALWAYS***===if the no. of iteration is based on the division then always always always the TC is going to be interns of log
//TC for method 3 is O(1)
//TC for method 2 is (since it involve the loop in it nad doind divisibele by 10 )==O(log10(N))==O(log N)


//Another edge case if n=00 or n=000.....then
//case 1: if you are taking the datatype as int or long long(oure numbers)..then 00 or 000 is treated as 0 itself..soo it will return 1
//case 2: if you want to count 00 or 000 as 2 and 3 digits then..take the datatyepa as string..then find the length of string

//remember
//in c++ division '/10' ==== 7125.9 ---->7125 (just removes decimal part) if both the numbers are integers
// int(4534.2356)---->removes the decimal part (just gives the integer by removing the decimal part , don't round off to nearest number)
//floor(3.625)===>Remove the decimal part and go to the nearest integer on the left side of the number line. ...floor(-2.3)--->-3 ...Remove the decimal part and go to the nearest integer on the left side of the number line...because -3 is the greatest integer that is ≤ -2.3.

//Q3. write a program to generate reverse of a given number N.Print the corresponding reverse number NOTE:if a number has trailing zeros,then it's reverse will not include them.for EG.Reverse of 10400 will be 401 instead of 00401

// //Extraction of digits from the number(see the picture)

// public class maths{
//     public static void main(String args[]){


//         int n=7789;
//         while(n>0){
//             int lastdigit=n%10;              //gives the lastdigit simple..simple but number remains same
//             System.out.print(lastdigit+" "); //print the last digit(don't forget it)
//             n=n/10;                          //keeps points and removes it and give the integer part


//         }
//     }
// }

// //Given the number 'n',find out and return the number of digits present in a number

// public class maths{
//     public static void main(String args[]){


//         int n=7789;
//         while(n>0){
//             int lastdigit=n%10;              
//             System.out.print(lastdigit+" "); 
//             n=n/10;                          


//         }
//     }
// }