class Student{
    public String Sname;
    private String Sphone;
    public String getSphone(){
        return Sphone;
    }
    public void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
 public class EncapsulationDemo{
    public static void main(String args[]){
    Student S=new Student();
    S.Sname="Divya";
    S.setSphone("xxxxxxxx19");
    System.out.println("student name is " +S.Sname);
    System.out.println("student phonenumber is " +S.getSphone());
    }
}
