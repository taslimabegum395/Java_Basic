package Java_Basic;

public class DuplicateCharectersHMTime {
    public static void main(String[] args) {
        String x="This is long stringggggggggg";
        int y=x.length();//find the lenght of total char in
        int count=x.replace("g","").length();
        int z=y-count;
        System.out.println("g repeat "+z+" many times");
        System.out.println(y);// we can see that the string x has 28 character including the space
        //for g, it repeats 11 times
    }
}
