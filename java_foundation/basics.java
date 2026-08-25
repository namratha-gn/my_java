//developed by james gosling in 1995(by sun moicrosystem)
//for execution you just type 1.javac basics.java(file name)[compilation] 2.java basics(class name)[running]/ctrl+shift+B/run task at terminal or java file name (java basics.java)
//you can do one line execution in java like python using jshell in terminal

//Java is called "Platform independent language" (means java application may run on any machine irrespective of oS and hardware)because of present of JVM in all the OS(JVM=java vrtual machine)
//java is platform independent but JVM itself is platform dependent (for ex JVM is not present in ios)
// {JVM + LIBRARIES==JRE(java runtime environment)}=JDK(java development kit)...JVm,JRE is present in all the machine but not JDK...therefore..java is called WORA=>Write once run anywhere
//JVM looks for that one first file which have 'main' method(public static void main)..from that file only it start executing among 100 files

//Java's portability allows programs to run on various platforms without modification. This is achievable because Java code is compiled into bytecode, which is independent of the underlying hardware and operating system. The JVM on each system interprets this bytecode, ensuring platform compatibility.
//This portability makes Java ideal for cross-platform applications, allowing developers to write code once and run it anywhere with a compatible JVM. 

//================================================================================================================================================================================================================

//Leetcode learnings

//never right function another function in java
//you can write like this also int n =callfun(n);

//==========================================================================================================================================================================================================================

// IMPORTANR POINTS TO REMEMBER

// Java is platform agnostic; this implies that programs authored on any system can be executed on any other system that has a JVM.
// The object-oriented paradigm is fully supported IT Java, including inheritance, encapsulation, abstraction, and polymorphism.
// Memory can be managed automatically through the efficient process of Automatic Garbage Collection.
// No explicit pointers mean added security that simplifies processes.
// Portability and architectural neutrality are supported, whereby Java applications can be compiled once and run in multiple locations due to Java bytecode.
// Exception handling makes sure programs can anticipate problems and resolve them without terminating the application while running.
// Java supports multithreading, enabling the execution of multiple threads simultaneously to build efficient and responsive applications.

//=================================================================================================================================================================================================================================

//KEYWORDS IN JAVA

// class keyword is used to declare a class in Java.
// public keyword is an access modifier that represents visibility. It means it is visible to all.
// static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it does not require creating an object to invoke the main() method. So, it saves memory.
// void is the return type of the method. It means it does not return any value.
// The main() method represents the starting point of the program.
// String[] args or String args[] is used for command line argument. We will discuss it in coming section.
// System.out.println() is used to print statement on the console. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class. We will discuss the internal working of System.out.println() statement in the coming section.

//===================================================================================================================================================================================================================
//SYNTAX OF JAVA

// class basics                                      //basics  is file name
// {
//     public static void main(String args[])
//     {
//         System.out.println("Hello Namratha");     //make sure you use ; at end to terminate the statement
//         System.out.println(6+9);
//     }
// }


// class basics
// {
//     public static void main(String args[])
//     { 
//         String name="Namratha";
//         String place="Chikkaballapur";
//         String description="Hi"+" "+name+" "+"I assume you are from"+" "+place;
//         System.out.println(description);
//     }
// }

//======================================================================================================================================================================================================================

//3 TYPES OF VARIABLES IN JAVA

// 1.local variable ==> A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
// 2.Instance variable ==> A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
// It is called an instance variable because its value is instance-specific and is not shared among instances.
// 3.static variable ==> A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

// Ex. for static variable is 

// class Student{  
//     //static variable  
//    static int age;  
// }  
// public class Main{  
//    public static void main(

//=====================================================================================================================================================================================================================

// 1. Identifier = Name

// An identifier is simply a name that you give to something in your Java program.
// Examples:
// int age;
// String studentName;
// class Student {
// }
// Here:
// age → identifier
// studentName → identifier
// Student → identifier
// Identifiers can be names of variables, classes, methods, objects, etc.

// 2. Variable = Storage location
// A variable is a place in memory used to store a value.
// int age = 21;
// Here:
// int → keyword
// age → identifier
// 21 → value
// age → variable
// So, age is both a variable and an identifier.
// Why?
// Because age is the name (identifier) of a storage location (variable).
// Think:
// Identifier = name
// Variable = storage that has that name

// 3. Keyword = Reserved word
// A keyword is a word that Java has already reserved for a specific purpose.
// Examples:
// int
// class
// public
// static
// if
// else
// while
// return
// new
// You cannot use these as your own identifiers.
// For example:
// int class = 10;   // ❌ Wrong
// Because class is already a Java keyword.

//======================================================================================================================================================================
//HOW TO INPUT FROM THE USER IN JAVA

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

//=========================================================================================================================================================================================================================================
//STEPS IN PROGRAMMING
// 1. take the input (from user/declare or define by yourself/for loop) 3 ways
// 2. Before doing operation THINK THINK THINK!!!! about edge cases and write code for it
// 3. Do the operation(important  thing to remember here is ===> before doing what ever the operation and storing the resultant value in the third variable ...think what is the datatype of the variable becomes or shd be ..{Ex.what the operators returns or by size} by analysing the datatypes of the individual variables)
//    while getting the logic think!! should i use loops???should i use ifelse??
// 4. printing the result or output (use the third varible to store while operation and print it...avoid doing the operation in the print statement itself)
//5. think how you are going to return something inside the function....bec the way of writing the return is very very important 
    // 1.just 1 value ===return a
    // 2.if(){
    //     return 
    // }
    // else return
     // if(){
    //     return 
    // }
    // return (both are same)
    // 3.return if (a==a )   ===>while returning true or false especially go with this kind of returning
//Don't keep if(N1==0) return N2;
//           if(N2==0) return N1;
//=========================================================================================================================================================================================================================================
//TIME COMPLEXITY 

//TC= loop is running the number of times the n is getting divisible by 10 ==if number is divisible by 10 then remember always tc=log10(N)..if it is getting dividible by 5 TC=log5(N)..if it is getting divisible by 2 log2(N)
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
//when the TC is going to be O(1),O(logn),O(n);

//=========================================================================================================================================================================================================================================
//EDGE CASES(not only writing edge case is  important .....but the order or cronology of write it is also important)

//NO.1 : n=0
//No.2 : n<0
//No.3 :edge case if n=00 or n=000.....then
//case 1= if you are taking the datatype as int or long (oure numbers)..then 00 or 000 is treated as 0 itself..soo it will return 1
//case 2= if you want to count 00 or 000 as 2 and 3 digits then..take the datatype as string..then find the length of string
//No.4 : n/10==0(only single digit)
//No.5 : overflow edge case()---->while dealing with overflow edge case...first thing that you have to think  is....boundary (left and write side boundary) and the just inside the boundary(inner boundary) by seeing the kind of operation that you are doing
// based upon the data the datayou will be knwing what is teh boundary is ....but how will you decide the inner boundaries???
//inner boundaries are decided based on the operation...based on thta operation come one step back

//=========================================================================================================================================================================================================================================================================================================================================

//remember(IF YOU WANT TO GET THE INTEGER PART THEN FOLLOW THIS)
//in java division '/10' ==== 7125.9 ---->7125 (just removes decimal part) if both the numbers are integers
// int(4534.2356)---->removes the decimal part (just gives the integer by removing the decimal part , don't round off to nearest number)
//floor(3.625)===>Remove the decimal part and go to the nearest integer on the left side of the number line. ...floor(-2.3)--->-3 ...Remove the decimal part and go to the nearest integer on the left side of the number line...because -3 is the greatest integer that is ≤ -2.3.

//========================================================================================================================================================================================================================================================================================================================================================
//TRICKS TO REMEMBER

// 1.MODIFICATION ITSELF TRICK(jodsbeku)
// yaarvdo ond number thagothiya ...aa number hange erobeku ninge...but aa number ge yeno operation apply maadi modify maadi...hange etkondiro number ge serusbeku.ade loop thara ond number aadmele ennond hange thagondu maadthaa erbeku..then you use
// sum=sum+10; VISALIZE IT VISUALIZE IT VISUALIZE IT 
// rev=(rev*10)+lastdigit

//===================================================================================================================================================================================================================================================================================================================
//Many ways of returning a value to the function

// 1.return a

// 2.if(N1==0) return N2

// return N1 (same as if else)

// You are not suppose to use..
// if(N1==0) return N2
// if(N2==0)return N1 ..Know the reason

// 3.return N1==N2 

//=========================================================================================================================================================================================================================================================

//Just memorize this table:

//Q.How you are going to remember these??

// Data Type	Bits	Range
// byte	8	-128 to 127
// short	16	-32,768 to 32,767
// int	    32	-2³¹ to 2³¹−1
// long	64	-2⁶³ to 2⁶³−1

// Notice that you can even remember the powers (2³¹, 2⁶³) instead of the full decimal numbers. That's enough most of the time.
// System.out.println(Integer.MAX_VALUE);
// System.out.println(Integer.MIN_VALUE);
// Output:
// 2147483647
// -2147483648
// Similarly,
// System.out.println(Long.MAX_VALUE);
// System.out.println(Long.MIN_VALUE);
// For DSA and interviews
// Whenever you see:
// "32-bit signed integer"
// Immediately think:
// int
// Range:
// -2^31 to 2^31 - 1

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//OVERFLOW
//Q.how the overflow will take place?? (like clock)??'
//Q.what is java's secret in overflow concept

// int x = 2147483647;
// x = x + 1;
// System.out.println(x);
// What do you think the output should be?
// Many beginners think
// 2147483648
// ❌ Wrong.
// Output is
// -2147483648
//because It wraps around like  a clock
// No exception.
// No compiler error.
// Nothing.
// Java silently overflows.
// What happens after overflow?
// Suppose
// int rev = 964632435;
// rev = rev * 10 + 1;
// You might think
// rev = 9646324351
// No.
// Actually,
// rev becomes some incorrect wrapped-around value.
// For example (the exact value isn't important),
// rev = 1056389759
// or even a negative number.
// The important thing is:
// the original correct value is lost.
// !!here Java does NOT give an error!

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 6. Rule for DSA

//Q. when you are going to check for overflow..before or after operation why??
// Whenever you see
// ans = ans * something + something;
// OR
// ans = ans * 10 + digit;
// Immediately think
// Can multiplication overflow?
// 7. Never check AFTER overflow
// ❌ Wrong
// ans = ans * 10 + digit;
// if(ans > Integer.MAX_VALUE)
// Reason
// Overflow has already happened.
// 8. Always check BEFORE overflow
// Think
// Next operation
// ↓
// Will it overflow?
// If yes
// return 0;
// Else continue.

// 9. Why divide by 10?
// Suppose
// ans = ans * 10 + digit;
// Maximum value
// 2147483647
// Before multiplying,
// find the largest safe value.
// 2147483647
// ↓
// /10
// ↓
// 214748364
// So compare
// ans > Integer.MAX_VALUE/10
// instead of
// ans > Integer.MAX_VALUE
// 10. Why compare last digit?
// Maximum value
// 214748364 | 7
// Suppose
// ans = 214748364
// Multiplication is safe.
// Now only the last digit decides.
// If
// digit = 5
// Safe
// If
// digit = 7
// Safe
// If
// digit = 8
// Overflow
// Hence
// digit > 7
// Minimum value
// -214748364 | 8
// If
// digit = -8
// Safe
// If
// digit = -9
// Overflow
// Hence
// digit < -8

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//very very important concept

//Q.for what and all operation I should think that it may overflow??

// 12. When should I think about overflow?
// Whenever you see
// ✅ Multiplication
// ans = ans * 10
// ans = ans * n
// ✅ Addition after multiplication
// ans = ans * 10 + digit
// ✅ Exponential
// pow *= x;
// ✅ Factorial
// fact *= i;
// ✅ Fibonacci
// a + b


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Check overflow BEFORE operation.
// ⭐ Golden Rule (Memorize this)

// Whenever I see
// answer = answer * something + something;
// I immediately ask:
// "Can this multiplication make the answer exceed the limits of the data type?"
// If YES, check before performing the operation using:
// Integer.MAX_VALUE
// Integer.MIN_VALUE
// Never check after the operation because overflow may already have happened.
// 🔥 One final note
// You do not need to memorize the exact condition:
// if (ans > Integer.MAX_VALUE / 10 ||
//     (ans == Integer.MAX_VALUE / 10 && digit > 7))
// Instead, memorize the thinking process:
// What is the next operation?
// Can it overflow?
// If multiplication by 10 is coming, divide the limit by 10.*************************************************
// If the prefixes are equal, compare the last digit.*****************************************************
// Perform the operation only if it's safe.

// If you remember this reasoning, you'll be able to derive

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//THINKING ABOUT THE EDGE CASES

//Q.What are the different possible edge cases thta you  have to follow while solving any problem??
//Q. what do you mean by edge cases???


// smallest
// largest
// zero
// negative
// boundaries
// single digit
// overflow
// special edge cases

// ⭐ The 7-Step Edge Case Checklist (Memorize This)
// Whenever you solve any DSA problem, ask these 7 questions.
// 1. Smallest Input
// Ask yourself:
// "What is the smallest input possible?"
// Example:
// Reverse Integer
// x = 0
// Example:
// Array
// []
// or
// [5]
// 2. Largest Input
// Ask yourself:
// "What is the biggest input according to constraints?"
// Reverse Integer
// 2147483647
// -2147483648
// Array
// 100000 elements
// 3. Negative Numbers
// Ask
// "Can the input be negative?"
// If yes
// Test
// -1
// -123
// -999
// Reverse Integer
// -123
// ↓
// -321
// 4. Zero
// Ask
// "Can input be zero?"
// Example
// 0
// Reverse Integer
// 0
// ↓
// 0
// 5. Boundary Values
// These are the exact limits.
// Example
// Intege.MAX_VALUE
// 2147483647
// Example
// Integer.MIN_VALUE
// -2147483648
// These usually reveal overflow bugs.
// 6. Special Pattern
// Ask
// "Is there any special input?"
// Example
// Reverse Integer
// 1000
// Expected
// 1
// because leading zeros disappear.
// Another
// 1111
// or
// 1221
// 7. Overflow / Underflow
// Ask
// "Can my calculation exceed the data type?"
// Whenever you see
// ans = ans * 10 + digit;
// or
// sum += x;
// or
// product *= i;
// Think
// Overflow?
// Let's apply this checklist to Reverse Integer

// Question 1
// Smallest?
// 0
// Question 2
// Largest?
// 2147483647
// -2147483648
// Question 3
// Negative?
// -123
// Question 4
// Overflow?
// 1534236469
// ↓
// 9646324351
// Return
// 0
// Question 5
// Trailing zeros?
// 120
// ↓
// 21
// Question 6
// One digit?
// 7
// ↓
// 7
// Question 7
// Already reversed?
// 121
// ↓
// 121
// this is how interviewers think
//===============================================================================================================================================================================================

📘 DSA MASTER NOTES - HOW TO THINK OF EDGE CASES
⭐ Golden Rule

Every problem has two parts:

Main Logic (Normal cases)
Edge Cases (Special cases that can break your code)

A good programmer doesn't just solve the normal case.
A good programmer asks:
"When can my code fail?"
STEP 1 : READ THE CONSTRAINTS FIRST
Never jump directly into coding.
Always read
Constraints
Example
-2^31 <= x <= 2^31-1
Immediately ask

Is overflow possible?
Is negative possible?
Is zero possible?
What datatype should I u
algorithm complexity
STEP 2 : THINK OF THE SMALLEST INPUT

Ask

"What is the smallest valid input?"

Because small inputs often break loops.

Examples

Reverse Integer

0

Array

[]

Linked List

NULL

String

""

Tree

root = null
Questions to ask

Can my loop run?

Can recursion stop?

Can indexing fail?

Example

while(x!=0)

Input

0

Loop never executes.

Correct.

STEP 3 : THINK OF THE LARGEST INPUT

Ask

"What is the biggest input?"

Examples

Integer.MAX_VALUE

2147483647
Integer.MIN_VALUE

-2147483648

Array

100000 elements

String

length = 100000

Questions

Will overflow happen?

Will recursion overflow?

Will TLE occur?

Example

Reverse Integer

1534236469

Reverse

9646324351

Overflow.

Need checking.

STEP 4 : THINK ABOUT ZERO

Ask

Can input be 0?

Examples

0
[]
""

Many beginners forget zero.

Questions

Does division by zero happen?

Will loop execute?

Will answer remain zero?

Example

Reverse Integer

Input

0

Output

0
STEP 5 : THINK ABOUT NEGATIVE VALUES

Ask

Can input be negative?

Examples

-1

-5

-100

Questions

Will my loop run?

Will comparison fail?

Will modulo work?

Example

Wrong

while(x>0)

Input

-123

Loop never executes.

Wrong Answer.

Correct

while(x!=0)
STEP 6 : THINK ABOUT THE BOUNDARIES

Boundary values are the MOST IMPORTANT.

Example

Integer.MAX_VALUE

Example

Integer.MIN_VALUE

Example

0

Example

1

Example

-1

Many interview bugs happen only at boundaries.

Example

Reverse Integer

2147483647

Reverse

Overflow.

STEP 7 : THINK ABOUT OVERFLOW

Whenever you see

answer=answer*10+digit;

or

sum+=x;

or

product*=i;

Immediately ask

Can this exceed Integer.MAX_VALUE?

If yes

Need checking.

Golden Rule

Never check

AFTER

overflow.

Always check

BEFORE

overflow.

STEP 8 : THINK ABOUT SPECIAL PATTERNS

Every problem has special patterns.

Reverse Integer

1000

↓

1

Leading zeros disappear.

Another

1111

Another

121

Array

Already sorted

Reverse sorted

All same

Duplicates

String

All same

Palindrome

Single character

Empty

Linked List

One node

Two nodes

Cycle

No cycle

Binary Search

Target first

Target last

Target absent

One element

STEP 9 : THINK ABOUT LOOP CONDITIONS

Ask

Will loop stop?

Can it become infinite?

Example

Wrong

while(x>=0)

Input

0

Infinite loop.

Correct

while(x!=0)
STEP 10 : THINK ABOUT SPECIAL OPERATIONS

Whenever you see

/

Ask

Division by zero?

Whenever you see

%

Ask

Negative remainder?

Whenever you see

*

Ask

Overflow?

Whenever you see

array[i]

Ask

Index out of bounds?

Whenever you see

node.next

Ask

Can node be null?

STEP 11 : THINK LIKE AN INTERVIEWER

Suppose interviewer gives

Reverse Integer.

Your brain should automatically ask

Positive?

Negative?

Zero?

Overflow?

Trailing zeros?

MAX_VALUE?

MIN_VALUE?

Suppose interviewer gives

Binary Search

Immediately ask

Empty array?

One element?

Target first?

Target last?

Target missing?

Suppose interviewer gives

Linked List

Immediately ask

Empty?

One node?

Two nodes?

Cycle?

Suppose interviewer gives

String

Immediately ask

Empty?

One character?

Uppercase?

Lowercase?

Spaces?

Special characters?
UNIVERSAL EDGE CASE TABLE
Category	Questions to Ask
Smallest Input	Can input be empty, 0, null, one element?
Largest Input	Can it overflow? Can it cause TLE?
Zero	Does 0 change the logic?
Negative	Can negatives break my code?
Boundary	MAX_VALUE, MIN_VALUE, first, last?
Overflow	Any multiplication/addition?
Loop	Infinite loop possible?
Array	Index out of bounds?
String	Empty? One character?
Linked List	Null? One node?
Tree	Null root? One node?
Binary Search	First? Last? Missing?
Sorting	Already sorted? Reverse sorted? Duplicates?
⭐ THE 30-SECOND DSA CHECKLIST (REVISION)

Before writing code, ask yourself:

✓ What are the constraints?

✓ Smallest input?

✓ Largest input?

✓ Can input be 0?

✓ Can input be negative?

✓ Any boundary values?

✓ Can overflow happen?

✓ Any special pattern?

✓ Will my loop terminate?

✓ Can indexing go out of bounds?

✓ Can NullPointerException occur?

✓ Time Complexity acceptable?
🔥 GOLDEN RULES (Memorize These)
Rule 1

Never trust your code with only one example.

Rule 2

Test your code mentally on the smallest input.

Rule 3

Test your code mentally on the largest input.

Rule 4

Whenever you multiply, think Overflow.

Rule 5

Whenever you divide, think Division by Zero.

Rule 6

Whenever you access an array, think Index Out of Bounds.

Rule 7

Whenever you use a pointer/reference (node, root, etc.), think Null.

⭐ The Mindset of a Strong DSA Programmer

Before coding, their brain automatically asks:

"If I were trying to break my own solution, what inputs would I use?"

That's the essence of thinking about edge cases.