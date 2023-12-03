package Java_Basic;
public class Operators {
    public static void main(String[] args) {
        /*Java operator: Symbol which will perform certain operation
        This is called expression. Here + is an operator and = is an operator too and
        1. Arithmetic operators +  -  *  /  %
        2.Relational /Comparison operator >>=  <<=  != ==

        3.Logical operators && || ! [and or not/negation]
        4.Incremental and decremental operations ++ --
        5 Assignment = += -= *= /= %=
        6 conditional / ternary operator? :  */ // just leave it for now

        int x=30;
        int y=20;
        int z=x+y;

        int c=x-y;
        int d=x*y;
        System.out.println("Substructure of X and Y is : " +c );
        System.out.println("Sum of x and y is : " +z );
        System.out.println("Substructure of X and Y is : " +c );
        System.out.println("Multiplication of X and Y is : " + (x*y) );
        System.out.println("Division of X and Y is : " + (x/y) );
        System.out.println("Modulus Division of X and Y is : " + (x%y) );

     //2.Relational /Comparison operator >>=  <<=  !=  ==
     int p =30;
     int l =10;
        System.out.println(p>=l);//return is true
        System.out.println(p<=l);//return is false
        System.out.println(p!=l);//return is true
        System.out.println(p==l);//return is false

         l=30;
        System.out.println(p>=l);//return is false
        System.out.println(p<=l);//return is false
        System.out.println(p!=l);//return is false
        System.out.println(p==l);//return is true

        //   3.Logical operators && || ! [&&(and), || (or),  !(not/negation)]
        Boolean a=true;
        Boolean b=false;
        System.out.println("This is the value coming from logical operators: " + (a&&b));//false
        System.out.println("This is the value coming from logical operators: " + (a||b));//true
        System.out.println("This is the value coming from logical operators: " + (!a));//false

        boolean b1=10>20; //10 is not greater than 20 now  result will come false
        boolean b2=20>10;// 20 is greater than 10 now result will come true
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(!b2);

       /* 4.Incremental and decremental operations ++ --
        Incremental operator ++  : pre and post
        decremental operator --

         Incremental operator ++
        int k= 10;
        k=k+1; */
        int i=10;//there is no different between pre- and post- increment in this scenario
       // i++
       // ++i
        //System.out.println(i);
        int total=i++;
        System.out.println(total);// here first i value is storing in the total variable and incremental
        System.out.println(i);// if i is printed then we can see i value is incremented
        int total1 = ++i;
        System.out.println(total1);// here incremental happen first then 1 value is storing in the total

/* decremental operator --
        int dec=100;
        a--;
        --a;
        int dec1=--100;
         System.out.println(a);
          System.out.println(dec)
 */
        int aq=100;
        //aq--;
        //--aq
        int dec1=--aq;
       // System.out.println(aq);
        System.out.println(dec1);

      //  5 Assignment = += -= *= /= %=
        int a1=10;
        a1 +=5;
        System.out.println(a1);

        a1=15;
        a1 -=5;
        System.out.println(a1);
        a1=3;
        a1 *=3;
        System.out.println(a1);
        a1=6;
        a1 /=3;
        System.out.println(a1);
        a1=8;
        a1 %=2;

       // 6 conditional / ternary operator? :  */

int f=200,h=100;
int r=f>h? f:h;
        System.out.println(r);//200
        int r1=f<h ? f:h;//100
        System.out.println(r1);

        int pp=(1==1)? 100:200;//we can directly declare the numbers instead of variable
        System.out.println(pp);

        int age=5;
        String outcome =(age>=18) ? "Eligible for vote" : "Not Eligible for vote";
        System.out.println(outcome);

    }
}
//relational operators
//==equal to
//!=not equal to
//>greater than
//>=greater than or equal to
//<less than
//<=less than or equal to