//developed by james gosling in 1995(by sun moicrosystem)
//for execution you just type 1.javac basics.java(file name)[compilation] 2.java basics(class name)[running]/ctrl+shift+B/run at terminal
//you can do one line execution in java like python using jshell in terminal

//Java is called "Platform independent language" (means java application may run on any machine irrespective of oS and hardware)because of present of JVM in all the OS(JVM=java vrtual machine)
//java is platform independent but JVM itself is platform dependent (for ex JVM is not present in ios)
// {JVM + LIBRARIES==JRE(java runtime environment)}=JDK(java development kit)...JVm,JRE is present in all the machine but not JDK...therefore..java is called WORA=>Write once run anywhere
//JVM looks for that one first file which have 'main' method(public static void main)..from that file only it start executing among 100 files

//SYNTAX OF JAVA

// class basics                                      //basics  is file name
// {
//     public static void main(String a[])
//     {
//         System.out.println("Hello Namratha");     //make sure you use ; at end to terminate the statement
//         System.out.println(6+9);
//     }
// }


class basics
{
    public static void main(String a[])
    { 
        String name="Namratha";
        String place="Chikkaballapur";
        String description="Hi"+" "+name+" "+"I assume you are from"+" "+place;
        System.out.println(description);
    }
}