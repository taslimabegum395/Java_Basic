package Java_Basic;

public class Student {
    public static void main(String[] args) {
        Student s=new Student(20,"hafca",'h');


    }

    int sid;
    String sname;
    char grade;

    void printRR(){

        System.out.println(sid+"  "+sname+"   "+grade);
    }

    void setData(int id, String name, char g) {
        sid = id;
        sname = name;
        grade = g;
    }

    Student(int id, String name, char g){

        sid = id;
        sname = name;
        grade = g;


    }

}

