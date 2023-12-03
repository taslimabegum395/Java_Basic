package Java_Basic;

public class StaticMethod {
    void display(){
        System.out.println("I am a void Method nothing return any value");
    }
    static  void display1(){
        System.out.println("I am a static Method ");
    }

    public static void main(String[] args) {
       // StaticMethod.display1();// static method er object create korar proyozon hoi na

        StaticMethod obj=new StaticMethod();
        obj.display();

        StaticMethod.display1();
    }
}
