package Java_Basic;
public class DataType_And_Variable {
public static void main (String [] args){
    /* primitive data type*/
    byte by=127; //when we create variable ,data type is must within the same variable
    by =125;// we can change the value of variable and the latest is always  count.
    System.out.println("The value of byte variable is "  + by);
    byte bb=111;
    bb=100;
    System.out.println("The value of byte variable is " + bb);
    Short sh=32767;
    System.out.println(" This value of short variable is " + sh);
    int i=1234567890;
    System.out.println("This value of integer variable " + i );
    float f=2232.3223f; //float and double come by decimal
    System.out.println("This value of float variable " + f );
    double rr = 33773333877.9999d;
    System.out.println("This value of double variable is " + rr);
    long l = 233435659l;
    System.out.println("This value of long variable is " + l );
    boolean bo =true;
    bo=false;
    System.out.println("This value of boolean variable is " + bo);
    char ch= 'A'; // only one character  with single quote
    ch ='B';
    System.out.println("This value of char variable is " + ch) ;
    int x = 4;
    int y = 3;
    int z = x+y;
    System.out.println(z);
    System.out.println("The sum of x and y is " + z);
    int a=10;
    int b=20;
    int c= a*b;
    System.out.println(c);
    System.out.println("The sum of  a and b is " +c );
    // non primitive  data type
    String m= "Sayed";
    String n= "Mahtab";
    String p=m +" " + n;
    System.out.println(p);
    System.out.println("My son name is " + p);
    String xx="I love my family";
    System.out.println(xx);
    String yy="Hello Group Study !!!";
    System.out.println(yy);


}
}
