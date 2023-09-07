class Rectangle{
    int l,b,a;
    Rectangle(){
        l=0;
        b=0;
        a=l*b;
    }
    Rectangle(int x, int y){
        l=x;
        b=y;
        a=l*b;
    }
    Rectangle(Rectangle r){
        this.l=r.l;
        this.b=r.b;
    }
}
public class ConstructorOverloadingDemo{
    public static void main(String args[]){
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle(5,10);
        Rectangle R3=new Rectangle(R2);
        System.out.println("Area of Rectangle1 is " +R1.a);
        System.out.println("Area of Rectangle2 is " +R2.a);
        System.out.println("Area of Rectangle3 is " +R3.a);
    }
}
