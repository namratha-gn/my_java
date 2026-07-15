//DIGITS

// '%'==> gives remainder(while doing soo quotient should be integer(integral division))
// '/'==> gives quotient(while doing so the quotient can  be either decimal or integer (deciaml or integral division))

//very  important...java doesnot works like the general mathematics when it comes to rounding off concept (if  7789/10...it is 778.9==> it doesn't roundoff to 779...it just truncates or remove sthat .9 that's it)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//remember one rule....when you have both the numerator and denominator in division(devisor and dividend) are integers (not decimal values)
//  '%' works on integral division (always always % works if both the numbers are integer 9/10...7/6.....it will not work for 0.9/10....10/0.2)
//  '/' works on decimal division
//means when you are doing modulous % always the result /quotient shd be integer(not decimal)...not suppose to use .0 and all...just integer
//when you are doing normla division using '/' you can put . tehn 0 nad do dividion the quotient can be decimal or integer

//if you are something like 0.7/10.....it is the decimal division the point is allowed in the quotient

//===========================================================================================================================================================================================

//EXTRACTING EACH digit from the number n [n is a number not a single digit think loike that](in reverse fashion)(see picture)

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
//             System.out.print(lastdigit+" "); //print the last digit(don't forget it)
//             n=n/10;                          //keeps points and removes it and give the integer part...//analyse this line..when a numebr what to undergo any kind of modification..anykind  i mean any kind (whetehr it may be +,-,%,/)and modify itself then this is how you have to write it


//         }

// }
//  public static void main(String args[]){
//         int n=7789;
//         int digit=extract(n);       
//    }
// }


//Q2. Given the number 'n'.Find out and return the number of digits present in a given number (num of  digits you find means count variable is definitely going to be there)(Trick to remeber ===>keep doing n/10 and keep counting digits or use formula)

//METHOD 1(don't use this method)

// public class maths{
    
//     public static int countdigits(long n){
//         int count1 = 0; //make sure you always define the variable in java ..not just declaring it .but you shoudl define it
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
//         int count = (int)(Math.log10(n) + 1);    //I want the integer part of the result not just the decimal part..so i kept int()
//         //or int count=(int)(Math.log10(n)+1e-9) //sometimes log10(N) gives 2.999999 for like 1000 (but i expect 3.566 and adding 1 becomes ans 4)..so 1e-9 just pushes 2.999 to 3

//         return count;

//     }

//     public static void main(String args[]){
//        long n=5689;
//        int digits=countdigits(n);
//        System.out.println(digits); 

//     }
// }

// EXPLAINATION== see log10(4215)=3.89 something,3.89+1=4.89,if you take integer portiuon of it int(4.89)==4
// soo int(log10(n)+1)=you'll get thw number of digits in the number

//TC= loop is running the number of times the n is getting divisible by 10 ==if number is divisible by 10 then remember always tc=log10(N)..if it is getting dividible by 5 TC=log5(N)..if it is getting divisible by 2 log2(N)
//REMEMMBER THSI ALWAYS***===if the no. of iteration is based on the division then always always always the TC is going to be interns of log
//TC for method 3 is O(1)
//TC for method 2 is (since it involve the loop in it nad doing divisibele by 10 )==O(log10(N))==O(log N)


//Another edge case if n=00 or n=000.....then
//case 1: if you are taking the datatype as int or long (oure numbers)..then 00 or 000 is treated as 0 itself..soo it will return 1
//case 2: if you want to count 00 or 000 as 2 and 3 digits then..take the datatype as string..then find the length of string

//remember
//in java division '/10' ==== 7125.9 ---->7125 (just removes decimal part) if both the numbers are integers
// int(4534.2356)---->removes the decimal part (just gives the integer by removing the decimal part , don't round off to nearest number)
//floor(3.625)===>Remove the decimal part and go to the nearest integer on the left side of the number line. ...floor(-2.3)--->-3 ...Remove the decimal part and go to the nearest integer on the left side of the number line...because -3 is the greatest integer that is ≤ -2.3.

//Q3. write a program to generate reverse of a given number N.Print the corresponding reverse number NOTE:if a number has trailing zeros,then it's reverse will not include them.for EG.Reverse of 10400 will be 401 instead of 00401
//(NOTE:Don't think in the foolish way like...extract the digit in the reverse order than it becomes reverse number..NOOo it is the individial numbers in reverse manner I want the number in reverse order all at once in the form of once , tens , hundreds , thousands manner)

//DRY RUN
// 7789 =====> 9877
// (0*10)+9=9
// (9*10)+8  =98
// (98*10)+7 =987
// (987*10)+7 =9877

public class maths{

    public static long reversenumber(long n){
        if(n/10==0) return 1;
        if(n<0) n=-n;

        long rev=0;
        while(n>0){
            //int rev=0;                      //never ever initialize inside the loop..it will be looping..aggain you end up being 0 after each loop
            long lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        return rev;
    }


    public static void main(String args[]){
       long n=1144562000;
       long reverse=reversenumber(n);
       System.out.println(reverse);
    }
}

