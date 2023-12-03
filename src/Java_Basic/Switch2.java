package Java_Basic;

public class Switch2 {
    public static void main(String[] args) {
        String levelString="Beginner";
        int level=0;
        //using String in switch expression
       switch (levelString){
           //using String literal in switch case
        case "Beginner": level=1;
           case "Intermediate": level=2; break;
           case "Expert" : level=3;break;
           default: level=0; break;
       }
        System.out.println("Your level is: "+ level);
    }
}
