package Java_Basic;

public class main {
    public static void main(String[] args) {
       // Student ss=new Student(10,"hafca",'h');

       // Approach 01 - using referential variable
        Student tt=new Student(10,"hafca",'h');
        tt.sid=100;
        tt.sname="hafca";
        tt.grade='A';
        tt.printRR();
        //Approach 02 - using method
       Student ss=new Student(10,"hafca",'h');
       ss.printRR();
        //Approach 03 - using Constructor
        Student student = new Student(123, "Musa",'A');
        student.printRR();

        Employee em=new Employee();
   em.eid=100;
   em.eName="hafca";
   em.eSal=1000;
   em.job="hr";
  
    }
}
