public class Student{

    //attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default contstructor // attr.-> garbage
    public Student(){
        System.out.println("Student default constructor is called");
    }

    //Method / Behaviours/functions

    public void study(){
        System.out.println(name+" "+ "is"+" "+"studying");
    }
    public void sleep(){
        System.out.println(name+" "+"is"+" "+"Sleeping");
    }
    public void bunk(){
        System.out.println(name+" "+"is"+" "+"Bunking");
    }
}