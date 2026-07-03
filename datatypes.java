//Primitive Datatypes

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

class datatypes
{
    public static void main(String a[])
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

       int d=15;
       byte b=(byte)d;
       System.out.println(b);



    }
}

// //TYPE CONVERSION AND TYPE CASTING

// byte b=127;
// int a=256;
// b=a;       (error bec you cannot assign  int to byte bec int has bigger range and byte has smaller range ...we cannot assign the larger range value to a smaller range value)
// a=b;       (here we are assigning the smaller value into the larger one)===>This is called Type coversion(Implicit one)
// b=(byte)a; ====>This is called Type casting(Explicit conversion)

// Example:
// float f=5.6f;
// int x=(int)f; //it is going to store 5

// int a=258 //we cannot assign 258 to int bec the range is -127 to +128 which is of the range 256 then it will implicitely do a%256=1;


