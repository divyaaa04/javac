import java.io.*;
import java.util.*;
class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Jerrymouse extends Animal{
    public void display(){
        System.out.println("My name is " +name);
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        Jerrymouse Jm=new Jerrymouse();
        Jm.name="Jerry-The mouse";
        Jm.display();
        Jm.eat();
    }
}
