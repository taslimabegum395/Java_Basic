package Java_Basic;

public class DuplicateCharecters {
    public static void main(String[] args) {
        String str = "I hate java";
        char[] mosammatbegum = str.toCharArray();
        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (mosammatbegum[i] == mosammatbegum[j]) {
                    System.out.print(mosammatbegum[j] + " ");
                    break;
                }
            }
        }





        }






    }

