package Java_Basic;
public class SwitchGate {
    //switch (Variable){
    // case "Value1" : statements:
    //                  break;
    // case "value2" : statements:
    //                 break;
    // default :      statement;
    // }
    public void sample(){  //input 7,30,365
        int a=7;
        switch(a){
            case 7 :{System.out.println("This is a week"); }break;
            case 30 : {System.out.println("This is a month");}break;
            case 365 :{System.out.println("This is a year");}break;
            default :{System.out.println("Enter legit value");

                }}}
    public static void main(String[] args) {
        SwitchGate obj =new SwitchGate();
        obj.sample();
    }}

