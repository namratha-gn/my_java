
/*object means something that have something and it does something i.e., object
object swill be having both properties and method Ex.book is a object that is going to have some properties like color, height,no of pages etc..
JVM is going to create the object ...To craete any objcet a blueprint is needed that is called class..once the blueprint is given the JVM is going to craete us the object*/

//class is a blueprint (Ex.maruthi car blueprint then that blueprint is given to the factory)
//object is all the  cars manufactured by factory by seeing that blue print of car
//functions written inside the class are called methods   

//object=properties+methods
//class = variables+methods(function)

class Calculator    //class name is calculator nad clas include   1.variable 2.methods
{
    int a; //variable

    public int add(int num1,int  num2){                                 //methods (is going to do something)
        
        //System.out.println("In add");                 //public is the access specifier==>this function can be called from anywhere   //int means what the method after doing the operation is going to return
        int r=num1+num2;                                           
        return r;                                     //here it shd return int bec we wrote int as the return type of method add() soo writing return 0;..here we are both printing and returning
    }
}


public class class_object{
    public static void main(String args[]){

        int num1=4;
        int num2=1;

        Calculator calc=new Calculator();   //Calculator is class,calc is the reference varibale ti access the method,

        int result=calc.add(num1,num2);
        System.out.println(result);

        // int result=num1+num2;
        // System.out.println(result);
    }
}
//=================================================================================================================================

class = blueprint of object 

class tells = "Every student should have these variables and these functions."

object = real world entity(Ex.car,pen, student)
object have 1.properties 
            2.behavior / actions 

