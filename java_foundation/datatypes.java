//PRIMITIVE DATATYPES

// 1.integer
    //   int =4 bytes
    //   long = 8 bytes
    //   long l=125l; (keep l at the end)
    //   short = 2 bytes
    //   byte = -2**7 to +2**7-1 i.e.,-128 to +127  (1 byte=8bits) {Total range is 256}
    //   means byte b=127(correct way)
    //         byte b=129(gives error)
  
// 2.float (4 bytes)and double 

    //    //double is bydefault value in java not the float

    // double num=5.6;
    // float num=5.6f;

// 3.Character(2 bytes not 1 byte) ..java is acc to UNICODE not ASCII

    // char c='K';

    // c=c+1; doesnot  work in java
    // c++ ..correct
    // c=(char)(c+1); correct

// 4.Boolean(0 or 1 doesn't work in java only true or false)

    // boolean b=true/false
//=======================================================================================================================

// //TYPE CONVERSION AND TYPE CASTING AND TYPE PROMOTIONS

// byte b=127;
// int a=256;
// b=a;       (error bec you cannot assign  int to byte bec int has bigger range and byte has smaller range ...we cannot assign the larger range value to a smaller range value)
// a=b;       (here we are assigning the smaller value into the larger one)===>This is called Type coversion(Implicit one)
// b=(byte)a; ====>This is called Type casting(Explicit conversion)

// Example:
// float f=5.6f;
// int x=(int)f; //it is going to store 5

// int a=258 //we cannot assign 258 to int bec the range is -127 to +128 which is of the range 256 then it will implicitely do a%256=1;

// byte a=25;
// byte b=42;
// int result =a*b; //see here a and b are byte...but after multiplication it is not byte anymore it is going out of range and getting into integer range ...soo jav ais telling no need for explicit casting..i'll promote you...This is called "Type promotion"

//=========================================================================================================================
// ARITHMATIC OPERATORS

// +,-,*,**,/,%
// num++,num+=1;num=num+2;
// num--,num-=1;num=num-3;
// num*=3

// post increment and pre increment
// int num=7;

// System.out.println(num++);  //8
// System.out.println(++num);  //8

// means when you are performing pre increment and post increment operation and just printing it it workes in the same way no difference

// int result = num++;  //7
// int result = ++num;  //8

// means when you are fetching the value out by assigning ,into another variable 
// In post increment = first it fetches the value then incremenst it soo //7
// In pre increment = first it increments then it fetches the value soo //8

//--------------------------------------------------------------------------------------------------------------------------------
//RELATIONAL OPERATORS (outputs boolean value true or false)

// <, >, == ('=' stands for assignment), !=, <=, >=

//--------------------------------------------------------------------------------------------------------------------------------
//LOGICAL OPERATORS (outputs boolean value true or false)

//&&, ||, !

//=========================================================================================================================

class datatypes
{
    public static void main(String args[])
    {
        // //literals
        // int num1=659;
        // int num2=0b101;          //binary format of 5
        // int num3=0x7E;           //hexadecimal format
        // int num4=100_000_00_0;   //same as 100000000

        // double d=125;
        
        // char c='a';
        // c=(char) (c+1); //or c++

        // System.out.println(c);

        
       //type conversion
            //    byte b=125;
            //    int c=b;
            //    System.out.println(c);

       //type casting

            //    int d=15;
            //    byte b=(byte)d;
            //    System.out.println(b);

            //    float m=2.658f;
            //    int n=542;              
            //    int n=(int)m;
            //    System.out.println(n); // expected output is going to be 2 but gives error bec Java does not allow two local variables with the same name in the same scope.
            
            //CORRECT WAY
            //   float m=2.6587f;
            //   int n=(int)m;
            //   System.out.println(n);
        
        //Type Promotion

            //    byte b=25;
            //    byte n=12;
            //    int result =b*n;
            //    System.out.println(result);

        //Relational operators

        int n=4;
        int m=6;
        boolean result = n>m;   //remember you use boolean not int here
        System.out.println(result);





    }
}



