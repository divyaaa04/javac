import java.io.*;
import java.util.*;
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
       this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println("Student details are ");
        System.out.println(rollno+ " " +name+ " " +fee+ " ");
    }
}
public class ThisDemo2{
    public static void main(String args[]){
        Student s1=new Student(15,"Divya",45700);
        Student s2=new Student(58,"Lahari",125000);
        s1.display();
        s2.display();
    }
}
