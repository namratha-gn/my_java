// why oops==>to store the numbers (same  data type==>integer array),,, to store names==> string type array,,,To strore name(string),marks(int),rollnumber(float) all at once===> use class
// class==>named group of properties and methods
//         class is a blueprint(that has some basic properties(but values are different ) and performs some functions) and using this blueprint different objects are created
//             -object is the instance of the class(instance means the physical stuff of the class)
//             -object is the physical stuff that actually exist not just the blueprint
//             -object actually occupies the memory , objects are stored in heap memory(reverence variables are stored in stack memory)
//             -object has 
//                1.state=its own value from its datatype
//                2.Identity = how one object is different from other(interms of where it is stored...like where the value is stored in the memory)
//                3.Behaviour 
//         EXAMPLE:
//         Car is the class(blue print)
//         - properties = engine, price, seats
//         - performs different functions

//         Lamborgini(object created from class)
//         - values = petrol engine, $20000, 5
//         -performs one function

//         Banz(object created from class)
//         - values = diezel engine, $80000, 7
//         - performs another function
//         [SEE THE PICTURE: class example]

OOPS===>object oriented programming systems

//WHY OOPS?????(see the picture)

for Ex:you want  to store the info of one student

main(){

    //variables

    int id;
    int no's;
    string name;
    int age;

    // calling some function

    study(id, no's ,name ,age)
}

//If I want to store the info of 100 students(HERE CODE BECOMES MESSY...YOU CANNOT HAVE 100 VATIALES TO STORE TEH DATA)

main(){

  //variables
  int id1, id2, id3....id100
  int no1,no2,no3,no4....no100
  string name1,name2, name3...name10

  //calling 100 functions
  study1(id1, id2, id3);
  study2();
}

//drawbacks of functional/procedural programming(see the picture)

class = template/blueprint(contains basic properties and the functions that the object can have)==>contains attributes and behaviours
object=instance of the class

attributes = attributes are state, properties of an object
behaviour = method/function that the object can perform

constuctor= doesnot return anything soo no return type==>have the name same as class ==>By deafult keeps the attribute value as garbage value