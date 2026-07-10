
/*objects will be having both properties and method Ex.book is a object that is going to have some properties like color, height,no of pages etc..
JVM is going to create the object ...To craete any objcet a blueprint is needed that is called class..once the blueprint is given the JVM is going to craete us the object*/

//class is a blueprint (Ex.maruthi car blueprint then that blueprint is given to the factory)
//object is all the  cars manufactured by factory by seeing that blue print of car
//functions written inside the class are called methods   

//object=properties + behaviour/action
//class = variables +Constructor + methods(function)

// class Calculator    //class name is calculator and  class include   1.variable 2.methods
// {
//     int num1,num2; //variable

//     public int add(int num1,int  num2){                                 //methods (is going to do something)
        
//         //System.out.println("In add");                 //public is the access specifier==>this function can be called from anywhere   //int means what the method after doing the operation is going to return
//         int r=num1+num2;                                           
//         return r;                                     //here it shd return int bec we wrote int as the return type of method add() soo writing return 0;..here we are both printing and returning
//     }
// }


// public class class_object{
//     public static void main(String args[]){

//         int num1=4;
//         int num2=1;

//         Calculator calc=new Calculator();   //Calculator is class,calc is the reference varibale ti access the method,

//         int result=calc.add(num1,num2);
//         System.out.println(result);

//     }
// }


//=================================================================================================================================


// class = blueprint of object 

// class tells = "Every student should have these variables and these functions(Methods)."

// object = real world entity(Ex.car,pen, student)
// object have 1.properties 
//             2.behavior / actions 
//object is created inside the main class

// Creation of class 👇👇

// class Student{        //class name should start from capital word

//     String name;      //object properties is written in the form of variables /instance variables,Every object gets it's own copy,They don't share values
//     int age;          //These are the  basic properties every student must have (This is the blueprint)

//     void study(){   // methods
//         System.out.println("Studying..."); //Inside method we can do 3 kinds of operation 1.printing 2.storing into variable and printing 3.returning the value
//     }

// }

// Creation of object 👇👇

// Student s1 = new Student();
// Student s2 = new Student();

// -Student = datatype of object (class name)=It tells Java what type of object you're going to create.
// -s1,s2 = Reference variable (points to or stores the address of object not object itself)
// -new=creats the space for objects in memory 
// RAM
// - new Student() = creats the object 

// -The object doesn't have a name. It is an anonymous object until a reference variable points to it.

// Methods

// Functions inside a class are called methods.
// Example
// class Student{

//     void study(){
//         System.out.println("Studying");
//     }

// }

//As soon as you craete the object and class
// Java creates this

// Student Object

// name = null

// age = 0

// marks = 0

//Now you have to create / assign the values 


// Assigning values to two diff students 👇👇

// s1.name = "Rahul";
// s1.age = 20;

// s2.name = "Anjali";
// s2.age = 19;



// Calling it👇👇

// Student s1 = new Student();

// s1.study();

// Output👇👇
// Studying

//YOU CANNOT ASSIGN TEH AVLUES TO THE 50000 STUDENTS SOO GO FOR CONSTRUCTOR CONCEPT
//while you craete the object then only you send the value..then inside the class there will be something called "CONSTRUCTOR"
//Constructor with 1.same name as class 2.No return type
//that constructor is going to store this values before it was stored by the java itself while you assign the values(or you used to send them as parameters by calling the function..function will assign them to the variables)

//CONSTRUCTOR CONCEPT

// Java sees

// new Student(...)

// The keyword

// new

// means

// Create memory.

// So Java creates

// Student Object

// name = null

// age = 0

// marks = 0

// Notice

// The constructor has NOT run yet.

// Step 2

// After creating memory,

// Java immediately looks inside the Student class.

// It asks

// "Is there a constructor?"

// Yes.

// Student(String n,int a,int m)
// Step 3

// Java automatically calls it.

// You NEVER write

// s1.Student();

// Never.

// Java does it automatically.

// Step 4

// Java sends

// Rahul

// 20

// 95

// into the constructor.

// Internally Java does

// n = "Rahul";

// a = 20;

// m = 95;

// You never write this.

// Java does it.

// Now the constructor becomes

// Student(String n,int a,int m){

//     name = n;

//     age = a;

//     marks = m;

// }

// But remember

// n = Rahul

// a = 20

// m = 95

// So Java actually executes

// name = "Rahul";

// age = 20;

// marks = 95;

// Now the object becomes

// Student

// name = Rahul

// age = 20

// marks = 95

// Done.

// PART 8: So what exactly is a constructor?

// Many beginners think

// Constructor creates object.

// Wrong.

// The object is created by

// new

// Constructor simply fills the object.

// 2 types of constructor 
// 1.default/non-argumnet constructor(created by java internally)
// 2.parameterized constructor(created by you)

// Case 1: You DON'T write any constructor
// class Student {

//     String name;
//     int age;

// }

// You wrote only the class.

// No constructor.

// Now you write:

// Student s1 = new Student();

// Will it work?

// YES.

// Why?

// Because Java secretly writes

// Student() {

// }

// This is called the default constructor.

// Internally Java behaves like this
// class Student {

//     String name;
//     int age;

//     Student() {

//     }

// }

// So Java creates an object.

// name = null

// age = 0

// That's all.

// Rule 1

// ✅ If you don't write any constructor, Java automatically creates a default (no-argument) constructor.

// Case 2: You write a parameterized constructor

// Suppose you write

// class Student {

//     String name;
//     int age;

//     Student(String n, int a) {

//         name = n;
//         age = a;

//     }

// }

// Now you try

// Student s1 = new Student();

// Will this work?

// NO. ❌

// Why?

// Because Java says:

// "You have already written your own constructor."

// So Java does not create

// Student() {

// }

// automatically.

// Now the only constructor available is

// Student(String n, int a)

// So you must write

// Student s1 = new Student("Rahul",20);
// Rule 2

// ✅ If you write any constructor yourself, Java stops creating the default constructor.

// Case 3: You want BOTH

// Sometimes you want both.

// You want this to work

// Student s1 = new Student();

// AND

// Student s2 = new Student("Rahul",20);

// Then you must write both constructors.

// class Student {

//     String name;
//     int age;

//     Student() {

//     }

//     Student(String n,int a) {

//         name = n;
//         age = a;

//     }

// }

// Now both object creations work.

// Case 1: You don't write ANY constructor
// class Student {

//     String name;
//     int age;

// }

// You wrote zero constructors.

// Now Java automatically writes this internally:

// Student() {

// }

// ✅ You do NOT write it.
// ✅ Java writes it automatically.

// Case 2: You write a parameterized constructor
// class Student {

//     String name;
//     int age;

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

// }

// Now Java says:

// "You have written your own constructor. I will NOT create the default constructor."

// So this:

// Student s1 = new Student();

// ❌ Gives an error.

// If you want this to work, you must write the no-argument constructor yourself.

// class Student {

//     String name;
//     int age;

//     Student() {          // You wrote this
//     }

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

// }

// Now both work:

// Student s1 = new Student();

// Student s2 = new Student("Rahul", 20);

/*

/*

#############################################################
##################### CLASS IN JAVA ##########################
#############################################################

Definition:
-----------
A Class is a blueprint or template used to create objects.

It defines:
1. Properties (Variables)
2. Behaviors (Methods)

Real-Life Example:
------------------

Suppose we are creating software for a college.

Every student has

Name
Age
Marks

Every student can

Study()
Dance()
Sing()

Instead of writing these repeatedly,
we write them once inside a Class.

Example:

class Student{

    String name;
    int age;
    int marks;

    void study(){}

    void dance(){}

}

Student class is only a DESIGN.
It is NOT an actual student.

==================================
WHY DO WE NEED CLASS?
==================================

Without class:

student1Name
student2Name
student3Name

student1Age
student2Age
student3Age

Huge repetition.

With Class:

Write structure only once.

Create unlimited students using it.

==================================
VERY IMPORTANT
==================================

Class = Blueprint

Object = Actual Thing

One Class

↓

Many Objects

Memory Trick:
-------------

Class = House Blueprint

Object = Actual House

*/

/*

#############################################################
##################### OBJECT IN JAVA #########################
#############################################################

Definition:
-----------
An Object is an instance of a class.

Object is the actual real-world entity.

Example:

Student s1 = new Student();

Here

Student
-------
Class

s1
--
Reference Variable

new Student()
-------------
Creates Object

====================================
WHY DO WE NEED OBJECTS?
====================================

Suppose there are

10,000 Students.

Each student has

Different Name

Different Age

Different Marks

One Class cannot store
10,000 different values.

Therefore,

Every Student needs
its own Object.

Example

Student Class

↓

Rahul (Object)

↓

Anjali (Object)

↓

Kiran (Object)

Each object stores
its own data.

====================================
OBJECT CONTAINS
====================================

Every object contains

Instance Variables

Example

s1

name = Rahul

age = 20

marks = 95

Methods are NOT copied separately.

They are shared through the class.

====================================
MEMORY TRICK
====================================

Class

↓

Blueprint

↓

Object

↓

Real Student

*/
/*

#############################################################
###################### NEW KEYWORD ###########################
#############################################################

Definition:
-----------
new keyword creates an object in memory.

Example:

Student s1 = new Student();

Here

new Student()

creates memory.

====================================
WORK OF new
====================================

1. Allocates memory in Heap.

2. Creates Object.

3. Calls Constructor automatically.

4. Returns object's address.

====================================
IMPORTANT
====================================

Many beginners think

Constructor creates object.

Wrong.

new creates object.

Constructor initializes object.

====================================
FLOW
====================================

new Student()

↓

Memory Allocated

↓

Constructor Called

↓

Object Initialized

*/
/*

#############################################################
################## REFERENCE VARIABLE ########################
#############################################################

Example:

Student s1 = new Student();

Here

s1

is called

Reference Variable.

====================================
WHAT DOES IT STORE?
====================================

It stores

Address of Object.

It DOES NOT store
the object itself.

Memory:

Stack

s1

↓

Heap

Student Object

====================================
REAL-LIFE EXAMPLE
====================================

TV = Object

Remote = Reference Variable

Remote controls TV.

Similarly,

Reference Variable points
to Object.

*/
/*

#############################################################
################# INSTANCE VARIABLES #########################
#############################################################

Definition:
-----------
Variables declared inside the class
but outside methods,
constructors and blocks.

Example

class Student{

    String name;

    int age;

}

name

age

are Instance Variables.

====================================
WHY INSTANCE VARIABLE?
====================================

Because every instance (object)
gets its own copy.

Example

Student s1

↓

age = 20

Student s2

↓

age = 18

Each object stores
its own values.

====================================
DEFAULT VALUES
====================================

int -> 0

double -> 0.0

boolean -> false

char -> '\u0000'

Object -> null

====================================
MEMORY TRICK
====================================

Object

↓

Contains

↓

Instance Variables

*/
/*

#############################################################
###################### METHODS ###############################
#############################################################

Definition:
-----------
Functions written inside a class
are called Methods.

Purpose:
--------
Methods define

"What an object can do."

Example

class Student{

    void study(){

        System.out.println("Studying");

    }

}

====================================
CALLING METHOD
====================================

Student s = new Student();

s.study();

Output

Studying

====================================
WHY DO WE CALL METHODS?
====================================

Object knows HOW to study.

But Java will NOT execute it
automatically.

You must call it.

Example

s.study();

====================================
METHOD TYPES
====================================

1. Without Parameters

void study(){}

Call

study();

------------------------

2. With Parameters

void setMarks(int m){

}

Call

setMarks(95);

====================================
METHOD PARTS
====================================

public

Access Modifier

void

Return Type

study

Method Name

()

Parameters

{}

Method Body

====================================
MEMORY TRICK
====================================

Variables

↓

What Object HAS

Methods

↓

What Object DOES

*/
/*

#############################################################
############ PARAMETERS vs ARGUMENTS #########################
#############################################################

Parameter:
----------
Variable declared in Method or Constructor.

Example

void setAge(int age)

Here

int age

is Parameter.

------------------------------------

Argument:
---------
Actual value passed while calling.

Example

setAge(20);

20

is Argument.

====================================
FLOW
====================================

setAge(20)

↓

Java automatically does

age = 20

↓

Method executes.

====================================
IMPORTANT
====================================

Parameter

↓

Receives Value

Argument

↓

Supplies Value

====================================
MEMORY TRICK
====================================

Parameter

=

Receiver

Argument

=

Sender

*/
/*

#############################################################
################### CONSTRUCTOR IN JAVA ######################
#############################################################

Definition:
-----------
A Constructor is a special member of a class that is
automatically called whenever an object is created.

Purpose:
--------
Used to INITIALIZE (give initial values to) an object.

Example:

class Student{

    String name;
    int age;

    Student(String n,int a){

        name = n;
        age = a;

    }

}

====================================
WHY DO WE NEED CONSTRUCTORS?
====================================

Without Constructor:

Student s = new Student();

s.name = "Rahul";
s.age = 20;

Need multiple statements.

------------------------------------

With Constructor:

Student s = new Student("Rahul",20);

Everything happens in one statement.

Constructor initializes object
during object creation.

====================================
IMPORTANT
====================================

Constructor DOES NOT create object.

new Keyword

↓

Creates Object

Constructor

↓

Initializes Object

====================================
RULES OF CONSTRUCTOR
====================================

1. Constructor name MUST be same as Class name.

Example:

Student()

2. Constructor has NO return type.

Correct:

Student(){}

Wrong:

void Student(){}

Wrong:

int Student(){}

3. Constructor runs automatically.

You never write

s.Student();

Java automatically calls it.

====================================
FLOW
====================================

Student s =
new Student("Rahul",20);

↓

new creates object

↓

Constructor receives values

↓

Object initialized

↓

Ready to use

====================================
MEMORY TRICK
====================================

new

↓

Birth of Object

Constructor

↓

First Information given to Object

*/
/*

#############################################################
################ DEFAULT CONSTRUCTOR #########################
#############################################################

Definition:
-----------
A constructor with NO parameters.

Example:

Student(){

}

Called using:

Student s = new Student();

====================================
WHEN JAVA CREATES IT?
====================================

Case 1

You write NO constructor.

Example:

class Student{

    int age;

}

Java automatically creates

Student(){

}

internally.

This is called the
Default Constructor.

====================================
WHEN JAVA DOES NOT CREATE IT?
====================================

Suppose you write

Student(String name){

}

Now Java will NOT create

Student()

automatically.

If you need it,

YOU must write it.

====================================
IMPORTANT RULE
====================================

No Constructor Written

↓

Java creates Default Constructor

------------------------------------

Any Constructor Written

↓

Java creates NOTHING

You must write all constructors.

====================================
MEMORY TRICK
====================================

No Constructor

↓

Java Helps You

Any Constructor

↓

Java Stops Helping

*/
/*

#############################################################
############ PARAMETERIZED CONSTRUCTOR ########################
#############################################################

Definition:
-----------
Constructor that accepts parameters.

Purpose:
--------
Used when values are already known
while creating object.

Example

Student(String name,int age){

    this.name = name;

    this.age = age;

}

Call

Student s =
new Student("Rahul",20);

====================================
FLOW
====================================

Arguments

↓

Constructor Parameters

↓

Instance Variables

Example

"Rahul"

↓

name(parameter)

↓

this.name(instance variable)

====================================
WHY PARAMETERIZED CONSTRUCTOR?
====================================

Without it

Student s = new Student();

s.name="Rahul";

s.age=20;

------------------------------------

With it

Student s =
new Student("Rahul",20);

Cleaner

Shorter

Professional

====================================
MEMORY TRICK
====================================

Constructor

↓

Receives Values

↓

Stores into Object

*/
/*

#############################################################
############ CONSTRUCTOR vs METHOD ###########################
#############################################################

CONSTRUCTOR

Purpose
-------
Initialize Object

Runs
----
Automatically

Return Type
-----------
No Return Type

Name
----
Same as Class Name

Called
------
When object is created

Example

Student(){

}

------------------------------------

METHOD

Purpose
-------
Perform Work

Runs
----
Only when called

Return Type
-----------
void/int/String etc.

Name
----
Any Valid Name

Called
------
Using Object

Example

study()

====================================
MEMORY TRICK
====================================

Constructor

↓

Birth

Method

↓

Life Activities

*/
/*

#############################################################
################### THIS KEYWORD #############################
#############################################################

Definition:
-----------
this refers to the CURRENT OBJECT.

Used to differentiate

Instance Variable

and

Method Parameter

when both have same name.

Example

class Student{

    String name;

    Student(String name){

        this.name = name;

    }

}

====================================
WHY DO WE NEED this?
====================================

Without this

name = name;

Both refer to parameter.

Instance variable never changes.

------------------------------------

With this

this.name = name;

Left Side

↓

Object Variable

Right Side

↓

Parameter

====================================
FLOW
====================================

Student s =
new Student("Rahul");

↓

Parameter

name = Rahul

↓

this.name = name

↓

Object

name = Rahul

====================================
MEMORY TRICK
====================================

this

↓

Current Object

*/
/*

#############################################################
################ OBJECT LIFE CYCLE ###########################
#############################################################

1.

Write Class

↓

Contains

Instance Variables

Constructor

Methods

------------------------------------

2.

Create Object

Student s =
new Student();

↓

new creates object.

------------------------------------

3.

Constructor Runs

↓

Initial Values Assigned

------------------------------------

4.

Methods are called

↓

Object Performs Work

study()

dance()

etc.

------------------------------------

5.

Setter modifies object

↓

Object Updated

------------------------------------

6.

Getter reads object

↓

Returns Values

====================================
MEMORY TRICK
====================================

Blueprint

↓

Object Born

↓

Constructor

↓

Methods

↓

Setter

↓

Getter

*/
/*

#############################################################
################ INTERVIEW POINTS ############################
#############################################################

Q) Who creates Object?

Answer

new Keyword

------------------------------------

Q) Who initializes Object?

Answer

Constructor

------------------------------------

Q) Can Constructor return value?

No.

------------------------------------

Q) Can Constructor be overloaded?

Yes.

(Multiple constructors with
different parameters.)

------------------------------------

Q) Can Constructor be private?

Yes.

(Advanced Topic)

------------------------------------

Q) Can we call Constructor?

No.

Java automatically calls it.

------------------------------------

Q) Constructor or Setter?

Constructor

↓

Initial Values

Setter

↓

Modify Existing Object

------------------------------------

Q) Getter Purpose?

Read Data

------------------------------------

Q) Setter Purpose?

Modify Data

------------------------------------

Q) Why use Encapsulation?

Protect Object Data

Provide Controlled Access

*/
// ==========================
// ENCAPSULATION IN JAVA
// ==========================

// Definition:
// ------------
// Encapsulation is the process of hiding an object's data using private variables
// and allowing controlled access to that data through public methods
// (getters and setters).

// Real-Life Example:
// ------------------
// Think of a college admission office.

// Student Record:
// ---------------
// Name
// Age
// Marks

// The record is kept inside the office.
// Nobody can directly modify it.

// Instead,
// - To update the record -> Fill an official form (Setter)
// - To view the record -> Ask the office (Getter)

// Similarly,
// Object's variables are hidden using 'private'.

// ====================================
// WHY DO WE NEED ENCAPSULATION?
// ====================================

// Without Encapsulation:

// class Student{
//     public int age;
// }

// Student s = new Student();

// s.age = -500;      // Invalid
// s.age = 1000;      // Invalid

// Anybody can change the object's data.

// Problem:
// --------
// Object can store invalid values.

// Solution:
// ---------
// Hide variables using private and allow modification only through methods.

// ====================================
// PRIVATE KEYWORD
// ====================================

// private int age;

// Meaning:

// - Variable belongs to every object.
// - Cannot be accessed directly outside the class.
// - Only methods inside the same class can access it.

// Wrong:

// s.age = 20;      // Error

// ====================================
// SETTER METHOD
// ====================================

// Purpose:
// --------
// Used to MODIFY (update) the value of an existing object.

// Syntax:

// public void setAge(int age){

//     if(age>=0 && age<=120){

//         this.age = age;

//     }

// }

// Keyword Explanation:
// -------------------

// public
// -------
// Method can be called from outside the class.

// void
// ----
// Returns nothing.

// setAge
// ------
// Method name.

// int age
// --------
// Method parameter.
// Receives the value sent while calling the method.

// Example:

// s.setAge(20);

// Java internally does:

// age = 20

// this.age
// ---------
// Current object's instance variable.

// age
// ---
// Method parameter.

// this.age = age;

// means

// Object's age = Method parameter value

// ====================================
// GETTER METHOD
// ====================================

// Purpose:
// --------
// Used to READ the value of private variables.

// Syntax:

// public int getAge(){

//     return age;

// }

// Keyword Explanation:
// -------------------

// public
// -------
// Can be called from outside the class.

// int
// ---
// Method returns an integer.

// return
// ------
// Sends the object's value back to the caller.

// Example:

// System.out.println(s.getAge());

// Output:

// 20

// ====================================
// CONSTRUCTOR vs SETTER
// ====================================

// Constructor:
// ------------
// Used while CREATING the object.

// Example:

// Student s =
// new Student("Rahul",20);

// Flow:

// Object Created
//       ↓
// Constructor Runs
//       ↓
// Initial values assigned

// Constructor initializes the object only once.

// ------------------------------------

// Setter:
// -------
// Used AFTER object creation.

// Example:

// s.setAge(21);

// Flow:

// Object already exists
//         ↓
// Setter called
//         ↓
// Object updated

// Setter can be called many times.

// ====================================
// WHEN TO USE CONSTRUCTOR?
// ====================================

// Use constructor when values are known
// at the time of object creation.

// Example:

// Student s =
// new Student("Rahul",20);

// ====================================
// WHEN TO USE SETTER?
// ====================================

// Use setter when values need to be changed later.

// Example:

// s.setAge(21);

// ====================================
// OBJECT LIFE CYCLE
// ====================================

// Step 1
// -------
// Create Class

// Contains:
// - Instance Variables
// - Constructor
// - Getter
// - Setter
// - Other Methods

// Step 2
// -------
// Create Object

// Student s = new Student("Rahul",20);

// Step 3
// -------
// Constructor initializes object.

// Step 4
// -------
// Later update object using setter.

// s.setAge(21);

// Step 5
// -------
// Read object values using getter.

// s.getAge();

// ====================================
// VERY IMPORTANT
// ====================================

// Constructor
// -----------
// Initializes object.

// Setter
// ------
// Modifies existing object.

// Getter
// ------
// Reads object data.

// private
// -------
// Protects object data.

// ====================================
// INTERVIEW DEFINITION
// ====================================

// Encapsulation is the process of hiding an object's data using private variables
// and providing controlled access to that data through public getter and setter methods.

// ====================================
// ONE-LINE MEMORY TRICK
// ====================================

// private  -> Hide Data

// Setter   -> Modify Data

// Getter   -> Read Data

// Constructor -> Initialize Object

// */

// // //=======================================================================================================================

// class Student{

//     String name;
//     int age;

//     public void study(){
//         System.out.println("Students are styudying");
//     }
// }

// public class class_object{
//     public static void main(String args[]){
         

//         Student s1=new Student();
//         Student s2=new Student();

//         s1.name="Namratha";
//         s1.age=23;
//         s2.name="Bhuvan";
//         s2.age=18;

//         s1.study();
//         s2.study();

//     }
// }

// //Instead of assigning the value on our own we use constructors to do that
// // bec of 2 reasons
// // 1.very easy to handles large number of objects
// // 2.if for ex marks is -ve value constructor makes it poitive with some condition and assignes it to the variables

// class Student{

//     String name;
//     int age;

//     public void study(){
//         System.out.println("Students are styudying");
//     }

//     Student(String name,int age){
//         if(a>=0 && a<=100){
//             this.name=n;     //this keyword says that name is the variable not the parameter
//             this.age=a;      //this keyword says that age is the variable not the parameter
//         }
//     }
// }

// public class class_object{
//     public static void main(String args[]){
         

//         Student s1=new Student("Namratha",23);
//         Student s2=new Student("Bhuvan",18);

//     }
// }

class Student {

    // ==========================================
    // Instance Variables (Properties)
    // ==========================================

    private String name;
    private int age;
    private int marks;

    // ==========================================
    // Parameterized Constructor
    // Automatically called when object is created
    // ==========================================

    public Student(String name, int age, int marks) {

        System.out.println("Constructor Called...");

        this.name = name;

        if (age >= 0 && age <= 120) {
            this.age = age;
        }

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    // ==========================================
    // Setter Methods
    // Used to modify existing object
    // ==========================================

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }

    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }

    }

    // ==========================================
    // Getter Methods
    // Used to read values
    // ==========================================

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    // ==========================================
    // Normal Methods (Behaviors)
    // ==========================================

    public void study() {
        System.out.println(name + " is Studying.");
    }

    public void dance() {
        System.out.println(name + " is Dancing.");
    }

    public void sing() {
        System.out.println(name + " is Singing.");
    }

    public void displayStudentDetails() {

        System.out.println("---------------");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("---------------");

    }

}

// ==========================================
// Main Class
// ==========================================

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // Object Creation
        // ==========================================

        Student s1 = new Student("Rahul", 20, 95);

        Student s2 = new Student("Anjali", 19, 88);

        // ==========================================
        // Display Initial Details
        // ==========================================

        s1.displayStudentDetails();

        s2.displayStudentDetails();

        // ==========================================
        // Calling Normal Methods
        // ==========================================

        s1.study();
        s2.dance();
        s2.sing();

        // ==========================================
        // Modify Object using Setter
        // ==========================================

        s1.setAge(21);

        s1.setMarks(98);

        s1.setName("Rahul Sharma");

        // ==========================================
        // Reading Data using Getter
        // ==========================================

        System.out.println();

        System.out.println("Updated Name : " + s1.getName());

        System.out.println("Updated Age : " + s1.getAge());

        System.out.println("Updated Marks : " + s1.getMarks());

        System.out.println();

        // ==========================================
        // Display Again
        // ==========================================

        s1.displayStudentDetails();

    }
}