package Java_Basic;

public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0;
        int sale[] = new int[12];            //int variable data type,sale= this is the name of variable,
        sale[0] = 6;
        sale[1] = 5;                        // 12 how many box or Array i declare or how many container i want
        sale[2] = 7;                      // normally we regular create int variable only one array
        sale[3] = 4;                    // array non primitive data type  thats why
        sale[4] = 9;                     //we can declare multiple container in data type
        sale[5] = 6;
        sale[6] = 3;                  // Array is follow index theory like 0123456789
        sale[7] = 6;
        sale[8] = 5;
        sale[9] = 4;
        sale[10] = 8;
        sale[11] = 2;

        for (int i = 0; i < 12; i++) {
            System.out.println(sale[i]);


            double avg = (double) sum / sale.length;
            int counter = 0;
            for (int j = 0; j < sale.length; j++)
                if (sale[j] > avg)
                    counter = counter + 1;

        System.out.println("The sale more than average  " + counter );
        System.out.println("more than ave sale count  " + counter);
        System.out.println("result" + sum);
        System.out.println("Average number " + avg);
        System.out.println("more than average sale count " + counter);
        System.out.println("Average number " + avg);

}}}