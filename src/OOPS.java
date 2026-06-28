//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OOPS{
public static void main(String args[]){
   Pen pen1=new Pen();
   pen1.Color="blue";
   pen1.Type="Ball";

   Pen pen2=new Pen();
   pen2.Color="black";
   pen2.Type="gel";

   pen1.write();
   pen1.printColor();
   pen2.write();
   pen1.printColor();

}

}
class Pen{
    String Color;
    String Type;

// Functions that are defined in a class is known as method

    public void write(){
        System.out.println("Writting something");
    }

    public void printColor(){
        System.out.println(this.Color);

        // this basically ek keyword h jo function ko btaega ki kis object bne usko call kiya h
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


