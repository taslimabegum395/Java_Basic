package Java_Basic;

public class ObjectInitialization {
    int i;
    String name;

    public static void main(String[] args) {
        ObjectInitialization obj=new ObjectInitialization();
       obj.i=10;
       obj.name="Mosammat";
        System.out.println(obj.i + "   "+ obj.name );//printing members with a white space
    }
}
