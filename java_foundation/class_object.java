
/*objects will be having both properties and method Ex.book is a object that is going to have some properties like color, height,no of pages etc..
JVM is going to create the object ...To craete any objcet a blueprint is needed that is called class..once the blueprint is given the JVM is going to craete us the object*/

//class is a blueprint (Ex.maruthi car blueprint then that blueprint is given to the factory)
//object is all the  cars manufactured by factory by seeing that blue print of car
//functions written inside the class are called methods   

//object=properties + behaviour/action
//class = variables + methods(function)

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

Java sees

new Student(...)

The keyword

new

means

Create memory.

So Java creates

Student Object

name = null

age = 0

marks = 0

Notice

The constructor has NOT run yet.

Step 2

After creating memory,

Java immediately looks inside the Student class.

It asks

"Is there a constructor?"

Yes.

Student(String n,int a,int m)
Step 3

Java automatically calls it.

You NEVER write

s1.Student();

Never.

Java does it automatically.

Step 4

Java sends

Rahul

20

95

into the constructor.

Internally Java does

n = "Rahul";

a = 20;

m = 95;

You never write this.

Java does it.

Now the constructor becomes

Student(String n,int a,int m){

    name = n;

    age = a;

    marks = m;

}

But remember

n = Rahul

a = 20

m = 95

So Java actually executes

name = "Rahul";

age = 20;

marks = 95;

Now the object becomes

Student

name = Rahul

age = 20

marks = 95

Done.

PART 8: So what exactly is a constructor?

Many beginners think

Constructor creates object.

Wrong.

The object is created by

new

Constructor simply fills the object.
//=======================================================================================================================

class Student{

    String name;
    int age;

    public void study(){
        System.out.println("Students are styudying");
    }
}

public class class_object{
    public static void main(String args[]){
         

        Student s1=new Student();
        Student s2=new Student();

        s1.name="Namratha";
        s1.age=23;
        s2.name="Bhuvan";
        s2.age=18;

        s1.study();
        s2.study();

    }
}