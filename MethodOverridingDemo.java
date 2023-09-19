import java.io.*;
import java.util.*;
class Bank{
    int gatRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest()
    {
        return 8;
    }
}
class HDFC extends Bank{
    int getRateOfInterest()
    {
        return 9;
    }
}
class UnionBank extends Bank{
    int getRateOfInterest()
    {
        return 10;
    }
}
public class MethodOverridingDemo{
    public static void main(String args[]){
        SBI s=new SBI();
        HDFC h=new HDFC();
        UnionBank u=new UnionBank();
        System.out.println("SBI rate of interest is " +s.getRateOfInterest());
        System.out.println("HDFC rate of interest is " +h.getRateOfInterest());
        System.out.println("UnionBank rate of interest is " +u.getRateOfInterest());
    }
}
