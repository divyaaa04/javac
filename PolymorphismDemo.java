import java.io.*;
import java.util.*;
class Animal{
public void animalSound(){
    System.out.println("An animal can make sounds");
}
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("A cow sounds-Mao Mao");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("A cat sounds-Meow Meow");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal An=new Animal();
        Animal Mycow= new Cow();
        Animal Mycat=new Cat();
        An.animalSound();
        Mycow.animalSound();
        Mycat.animalSound();
    }
}
