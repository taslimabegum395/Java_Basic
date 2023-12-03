package Java_Basic;

public class WrapperClassPractice {

    public static void main(String[] args) {
        int a = 5;// int ekta variable nilam
        double d=50.6;//double ekta variable nilam

     //AutoBoxing meaning: convert primitive to object(Wrapper)

        Integer i = Integer.valueOf(a);//eikhane convert korlam  a value ta //autoboxing
        System.out.println("i = " + i);

        Double j = Double.valueOf(d);//eikhane convert korlam  d value ta //autoboxing //eikhane obj j
        System.out.println("d = " + d);

       //  or
        //  int n = 20;
       // Integer h = n;//autoboxing //primitive data dype k object e rupantorito kora
        //System.out.println("h = " + h);

       //outBoxing meaning: convert object(Wrapper)  to primitive data type

        Integer y = Integer.valueOf(24);//object create korlam//valu iniatize korlam //primitive data type k valueof er moddome object e ropantorito korvo

        //now convert kore divo primitive data type e
        int b=y.intValue();//obj nam disi b, ager line er je object create korlam tar nam diye call korte hobe//double er khetre double valu dite hobe
        System.out.println("Convert successfully " +b);







    }
}
//Wrapper classes are used to convert primitive into object and objec tinto primitive
//AutoBoxing= converting primitive to  Object
//unboxing= converting Object to  primitive
//Primitive Data Type	    Wrapper Class
//byte	                    Byte
//short	                    Short
//int	                    Integer
//long	                    Long
//float	                    Float
//double	                Double
//boolean	                Boolean
//char	                    Character

