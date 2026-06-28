public class Student_ConstructorChaining {

    Student_ConstructorChaining(){
        this(101);
        System.out.println("Constructor Cjaoining");
    }

    Student_ConstructorChaining(int id){
        System.out.println("Studrnt"+id);
    }
    public static void main(String[] args) {
         Student_ConstructorChaining s1=new Student_ConstructorChaining();
         Demo d1=new Demo();
    }
}

class Demo {

    Demo() {
        this("Atharva");
        System.out.println("Default Constructor");
    }

    Demo(String name) {
        this("Atharva", 22);
        System.out.println("Name Constructor");
    }

    Demo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}
