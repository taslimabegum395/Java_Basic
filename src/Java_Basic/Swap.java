package Java_Basic;

public class Swap {
    public static void main(String[] args) {
        // Using arithmetic operation

//   int num1 = 20;
//   int num2 =  10;
//        num1 = num1 + num2;//  num1 now hold 30
//        num2 = num1 - num2;//num2 now hold 20
//        num1 = num1 - num2;//num1 now hold  10
//
//        System.out.println(" using arithmetic operator");
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//
//}}
//int temp;
//int x =100;
//int y = 200;
//temp = x;
//x=y;
//y=temp;
//        System.out.println(x);
//        System.out.println(y);


//    int j = 12;
//    int k =13;
//    int h;
//    h=j;
//    j=k;
//    k=h;
//        System.out.println(j);
//        System.out.println(k);


        int num1 = 20;
        int num2 =  10;

        //before swapping
        System.out.println("Before swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //swapping
        int swap = num1;//swap now hold 20
        num1 = num2;//num1 now hold 10
        num2 = swap;//num2 now hold 20
        System.out.println("After swapping");
        System.out.println("using temporary variable");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
       // Using arithmetic operation
        num1 = num1 + num2;//num1 now hold 30
        num2 = num1 - num2;//num2 now hold 20
        num1 = num1 - num2;//num1 now hold  10
        System.out.println(" using arithmetic operator");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //using multiplication and division
        num1 = num1 * num2;//num1 now hold 200
        num2 = num1 / num2;//num2 now hold 20
        num1 = num1 / num2;// num1 now hold 10
        System.out.println("Using multiplication and division");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }}