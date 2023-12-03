package Java_Basic;
import java.util.Scanner;
public class ScannerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//this mean i will type in compiler
        System.out.println("Enter you name");
        String Name = sc.next();
        if (Name.equalsIgnoreCase("Mosammat")) {
            System.out.println("Welcome " + Name + " Begum");
        }
        else {
            System.out.println("welcome " + Name + " you are a Student");
        }
    }
}
