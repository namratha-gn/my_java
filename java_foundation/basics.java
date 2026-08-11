//developed by james gosling in 1995(by sun moicrosystem)
//for execution you just type 1.javac basics.java(file name)[compilation] 2.java basics(class name)[running]/ctrl+shift+B/run at terminal or java file name (java basics.java)
//you can do one line execution in java like python using jshell in terminal

//Java is called "Platform independent language" (means java application may run on any machine irrespective of oS and hardware)because of present of JVM in all the OS(JVM=java vrtual machine)
//java is platform independent but JVM itself is platform dependent (for ex JVM is not present in ios)
// {JVM + LIBRARIES==JRE(java runtime environment)}=JDK(java development kit)...JVm,JRE is present in all the machine but not JDK...therefore..java is called WORA=>Write once run anywhere
//JVM looks for that one first file which have 'main' method(public static void main)..from that file only it start executing among 100 files


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
// 4. printing the result or output (use the third varible to store while operation ad print it...avoid doing the operation in the print statement itself)

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
//EDGE CASES
//NO.1 : n=0
//No.2 : n<0
//No.3 :edge case if n=00 or n=000.....then
//case 1= if you are taking the datatype as int or long (oure numbers)..then 00 or 000 is treated as 0 itself..soo it will return 1
//case 2= if you want to count 00 or 000 as 2 and 3 digits then..take the datatype as string..then find the length of string
//No.4 : n/10==0(only single digit)
//No.5 : overflow edge case()



//=========================================================================================================================================================================================================================================================================================================================================

//remember(IF YOU WANT TO GET THE INTEGER PART THEN FOLLOW THIS)
//in java division '/10' ==== 7125.9 ---->7125 (just removes decimal part) if both the numbers are integers
// int(4534.2356)---->removes the decimal part (just gives the integer by removing the decimal part , don't round off to nearest number)
//floor(3.625)===>Remove the decimal part and go to the nearest integer on the left side of the number line. ...floor(-2.3)--->-3 ...Remove the decimal part and go to the nearest integer on the left side of the number line...because -3 is the greatest integer that is ≤ -2.3.

//========================================================================================================================================================================================================================================================================================================================================================
//TRICKS TO REMEMBER

// 1. MODIFICATION ITSELF TRICK(jodsbeku)
// yaarvdo ond number thagothiya ...aa number hange erobeku ninge...but aa number ge yeno operation apply maadi modify maadi...hange etkondiro number ge serusbeku.ade loop thara ond number aadmele ennond hange thagondu maadthaa erbeku..then you use
// sum=sum+10;
// rev=(rev*10)+lastdigit

Step 2: What should you actually memorize?

Just memorize this table:

Data Type	Bits	Range
byte	8	-128 to 127
short	16	-32,768 to 32,767
int	    32	-2³¹ to 2³¹−1
long	64	-2⁶³ to 2⁶³−1

Notice that you can even remember the powers (2³¹, 2⁶³) instead of the full decimal numbers. That's enough most of the time.

Step 3: In Java, you don't even need to memorize the decimal values!

Java provides them for you.

System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);

Output:

2147483647
-2147483648

Similarly,

System.out.println(Long.MAX_VALUE);
System.out.println(Long.MIN_VALUE);
For DSA and interviews

Whenever you see:

"32-bit signed integer"

Immediately think:

int
Range:
-2^31 to 2^31 - 1

You don't need to mentally compute 2147483647 every time.

My advice for you

Since you're just starting DSA, don't waste time memorizing huge numbers like 2147483647 digit by digit.

Instead, remember this:

✅ int → 32-bit → -2³¹ to 2³¹ - 1
✅ long → 64-bit → -2⁶³ to 2⁶³ - 1

After solving 20–30 DSA problems, you'll naturally remember that Integer.MAX_VALUE is 2147483647.

This is exactly how most experienced programmers remember it—they don't recalculate it; they've simply seen it many times.

//OVERFLOW CONCEPT IN DSA

Example 1 (No Overflow)
int x = 100;
x = x + 50;
System.out.println(x);

Output

150

No problem.

Example 2 (Overflow)
int x = 2147483647;
x = x + 1;
System.out.println(x);

What do you think the output should be?

Many beginners think

2147483648

❌ Wrong.

Output is

-2147483648

Surprised? 😄

Why?

Think of a clock.

A clock goes

10
11
12
1
2
3

After 12 it doesn't become 13.

It wraps around.

Integers do the same.

After the largest possible value,

2147483647

comes

-2147483648

This is called integer overflow.

Similarly
int x = -2147483648;
x = x - 1;
System.out.println(x);

Output

2147483647

Again it wraps around.

Java does NOT give an error!

This surprises many people.

int x = 2147483647;
x++;

System.out.println(x);

Output

-2147483648

No exception.

No compiler error.

Nothing.

Java silently overflows.
What happens after overflow?

Suppose

int rev = 964632435;

rev = rev * 10 + 1;

You might think

rev = 9646324351

No.

Actually,

rev becomes some incorrect wrapped-around value.

For example (the exact value isn't important),

rev = 1056389759

or even a negative number.

The important thing is:

the original correct value is lost.

📘 DSA Notes: 32-bit, 64-bit & Overflow (Must Know)
1. Memory Concept

Every variable occupies a fixed amount of memory.

Example

Data Type	Memory	Bits
byte	1 byte	8 bits
short	2 bytes	16 bits
int	4 bytes	32 bits
long	8 bytes	64 bits

👉 More bits = Larger range.

2. Signed Integer

Signed means it stores

Negative Numbers
Zero
Positive Numbers

Example

int

-2147483648
     ...
-1
0
1
...
2147483647
3. Java Ranges

Always remember these.

Integer.MAX_VALUE

↓

2147483647
Integer.MIN_VALUE

↓

-2147483648
Long.MAX_VALUE

↓

9223372036854775807
Long.MIN_VALUE

↓

-9223372036854775808
4. Overflow

Overflow means

The result cannot fit inside the data type.

Example

int x = Integer.MAX_VALUE;

x++;

Output

-2147483648

Because Java wraps around.

5. Underflow

Example

int x = Integer.MIN_VALUE;

x--;

Output

2147483647
6. Rule for DSA

Whenever you see

ans = ans * something + something;

OR

ans = ans * 10 + digit;

Immediately think

Can multiplication overflow?

7. Never check AFTER overflow

❌ Wrong

ans = ans * 10 + digit;

if(ans > Integer.MAX_VALUE)

Reason

Overflow has already happened.

8. Always check BEFORE overflow

Think

Next operation

↓

Will it overflow?

If yes

return 0;

Else continue.

9. Why divide by 10?

Suppose

ans = ans * 10 + digit;

Maximum value

2147483647

Before multiplying,

find the largest safe value.

2147483647

↓

/10

↓

214748364

So compare

ans > Integer.MAX_VALUE/10

instead of

ans > Integer.MAX_VALUE
10. Why compare last digit?

Maximum value

214748364 | 7

Suppose

ans = 214748364

Multiplication is safe.

Now only the last digit decides.

If

digit = 5

Safe

If

digit = 7

Safe

If

digit = 8

Overflow

Hence

digit > 7

Minimum value

-214748364 | 8

If

digit = -8

Safe

If

digit = -9

Overflow

Hence

digit < -8
11. Final Overflow Template (VERY IMPORTANT)

Whenever you see

ans = ans * 10 + digit;

use

if (ans > Integer.MAX_VALUE / 10 ||
   (ans == Integer.MAX_VALUE / 10 && digit > 7))
    return 0;

if (ans < Integer.MIN_VALUE / 10 ||
   (ans == Integer.MIN_VALUE / 10 && digit < -8))
    return 0;
12. When should I think about overflow?

Whenever you see

✅ Multiplication

ans = ans * 10
ans = ans * n

✅ Addition after multiplication

ans = ans * 10 + digit

✅ Exponential

pow *= x;

✅ Factorial

fact *= i;

✅ Fibonacci

a + b
13. Interview Thinking Process

Whenever interviewer says

32-bit signed integer

Your brain should automatically think

↓

int

↓

Range

↓

Integer.MIN_VALUE

to

Integer.MAX_VALUE

↓

Any operation?

↓

Check overflow BEFORE operation.
⭐ Golden Rule (Memorize this)

Whenever I see

answer = answer * something + something;

I immediately ask:

"Can this multiplication make the answer exceed the limits of the data type?"

If YES, check before performing the operation using:

Integer.MAX_VALUE
Integer.MIN_VALUE

Never check after the operation because overflow may already have happened.

🔥 One final note

You do not need to memorize the exact condition:

if (ans > Integer.MAX_VALUE / 10 ||
    (ans == Integer.MAX_VALUE / 10 && digit > 7))

Instead, memorize the thinking process:

What is the next operation?
Can it overflow?
If multiplication by 10 is coming, divide the limit by 10.
If the prefixes are equal, compare the last digit.
Perform the operation only if it's safe.

If you remember this reasoning, you'll be able to derive

//===============================================================================================================================================================================================

//THINKING ABOUT THE EDGE CASES

⭐ The 7-Step Edge Case Checklist (Memorize This)

Whenever you solve any DSA problem, ask these 7 questions.

1. Smallest Input

Ask yourself:

"What is the smallest input possible?"

Example:

Reverse Integer

x = 0

Example:

Array

[]

or

[5]
2. Largest Input

Ask yourself:

"What is the biggest input according to constraints?"

Reverse Integer

2147483647
-2147483648

Array

100000 elements
3. Negative Numbers

Ask

"Can the input be negative?"

If yes

Test

-1

-123

-999

Reverse Integer

-123

↓

-321
4. Zero

Ask

"Can input be zero?"

Example

0

Reverse Integer

0

↓

0
5. Boundary Values

These are the exact limits.

Example

Integer.MAX_VALUE

2147483647

Example

Integer.MIN_VALUE

-2147483648

These usually reveal overflow bugs.

6. Special Pattern

Ask

"Is there any special input?"

Example

Reverse Integer

1000

Expected

1

because leading zeros disappear.

Another

1111

or

1221
7. Overflow / Underflow

Ask

"Can my calculation exceed the data type?"

Whenever you see

ans = ans * 10 + digit;

or

sum += x;

or

product *= i;

Think

Overflow?
Let's apply this checklist to Reverse Integer

Question 1

Smallest?

0

Question 2

Largest?

2147483647

-2147483648

Question 3

Negative?

-123

Question 4

Overflow?

1534236469

↓

9646324351

Return

0

Question 5

Trailing zeros?

120

↓

21

Question 6

One digit?

7

↓

7

Question 7

Already reversed?

121

↓

121
This is how interviewers think

Suppose they give

Two Sum

They immediately think

Empty array?

One element?

Negative numbers?

Duplicates?

Target = 0?

Large values?

Suppose they give

Binary Search

Immediately

Target first element?

Target last element?

Target absent?

One element?

Empty array?

Suppose they give

Linked List

Immediately

Empty list

One node

Two nodes

Cycle

No cycle
Universal Edge Case Table
Ask Yourself	Example
Smallest input?	0, empty array
Largest input?	MAX_VALUE, biggest array
Negative values?	-1, -100
Zero?	0
One element?	[5]
Special pattern?	duplicates, sorted, palindrome, trailing zeros
Overflow?	multiplication, addition, exponent
⭐ My Interview Rule

Before writing even one line of code, I spend 30 seconds asking:

1. What is the minimum input?

2. What is the maximum input?

3. Can it be negative?

4. Can it be zero?

5. Can overflow happen?

6. Any special pattern?

7. What happens if there is only one element?

If you make this a habit, you'll naturally start spotting edge cases.

🔥 For you (VERY IMPORTANT)

Since you're beginning Striver's DSA sheet, I recommend writing this checklist at the top of your notebook.

For every new problem, before coding, spend 30–60 seconds answering those seven questions.

Do this for the next 100 problems.

By the time you reach trees and graphs, you won't need the checklist anymore—your brain will automatically start thinking like an interviewer. That's exactly how experienced programmers develop this skill.

give me detaied notes of this checklist soo taht i revise it many times nad think edge cases in problem

Absolutely! Since you're preparing for Striver's DSA Sheet, I'll make these notes like placement revision notes, not textbook notes.

These are the notes I wish every beginner had before starting DSA.

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
What datatype should I use?
Example
Constraints

1 <= n <= 10

Easy.

Brute force works.

Example

1 <= n <= 10^9

Brute force will fail.

Need optimization.

Rule

👉 Constraints tell you

possible inputs
datatype
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