import java.io.*;
import java.util.*;
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzzzzz");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat sounds-Meow MEow");
    }
        }
        public class AbstractionDemo{
            public static void main(String args[]){
                Cat C=new Cat();
                C.animalSound();
                C.sleep();
            }
        }
