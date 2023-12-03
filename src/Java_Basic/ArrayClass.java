package Java_Basic;                             // pakage name
public class ArrayClass {                       // class name
    int i = 5;                                 //int data type, i variable,5 value

    public static void main(String[] args) {    //main method for run
        ArrayClass ac=new ArrayClass();         // class er object create korlam
        ac.arrayJava();
    }
    public void arrayJava() {                     // method name
       // int[] runShortForm={200,100,300,400,500}

        int[] run = new int[5];                //can run 0-4;//5 means how many box or array declare/how many container we want
        run[0] = 200;                         // array is follow is index theory like 0123456789
        run[1] = 100;                        // run is name of the variable
        run[2] = 300;                         //  I++ means increase by one//i+1;i++ same
        run[3] = 400;                          //i=0 means start with the 0 index
        run[4] = 500;                          //int  salary1=200 //int =data type/salary1=name/200= value

        for(int i=0; i<5;i++) {                     // we can print i<6 or i<=5 ,we should print i<5
            if (run[i] > 300) {                    // if i want gatter than 300
                System.out.println(i);              // when i print only index

                System.out.println(run[i]);        // when i print only  gibe me run value
                                                  // if we want print all the array value  we must mention array name of hare
                                                    // like;System.out.println(run[i])
                                                   //if we don't mention array name is gone print out only i
                                                    //  System.out.println(i)then print out 01234
            }}}}



// array: a variable can not handle more than one value .or
//array can handle multiple at the same data or
// multiple value of number type /int type or
// array in object in Java which contains similar type of data
// why use array: Array are used when there is a need to use many variables  of the same type data
// regular variable only handle one value
//()parentheses
//{} body







