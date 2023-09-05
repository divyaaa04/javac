import java.io.*;
import java.util.*;
class Rectangle{
int l,b,a;
Rectangle(){
l=5;
b=8;
a=l*b;
}
}
public class DefaultConstructorDemo{
public static void main(String args[]){
Rectangle R1= new Rectangle();
Rectangle R2= new Rectangle();
System.out.println("Area of rectangle-1 is " +R1.a);
System.out.println("Area of rectangle-2 is " +R2.a);
}
}
