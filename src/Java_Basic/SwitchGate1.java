package Java_Basic;

public class SwitchGate1 {
    public void switchgate() {
        int weekday = 1;
        switch (weekday) {
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
        }}
    public static void main(String[] args) {
        SwitchGate1 obj=new SwitchGate1();
        obj.switchgate();
    }}
//switch (Variable){
// case "Value1" : statements:
//                  break;
// case "value2" : statements:
//                 break;
// default :      statement;
// }
