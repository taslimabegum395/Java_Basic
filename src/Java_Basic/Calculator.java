package Java_Basic;
public class Calculator {
    int a=20;
    int b=10;
    public void getSum() {
        int c= (a+b);
        System.out.println(c);

    }public void getSub() {
        int d = a - b;
        System.out.println(d);

    }public void getMul(){
        int r=a*b;
    System.out.println(r);

}public void getDivision(){
       int v=a/b;
        System.out.println(v);
    }
    public static void main(String[] args) {
        Calculator cc=new Calculator();
        cc.getSum();
        cc.getSub();
        cc.getMul();
        cc.getDivision();
    }

    }



