package Java_Basic;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) throws IOException {
        // Method 1: getRuntime()
        // Getting the current runtime associated
        // with this process
        Runtime run = Runtime.getRuntime();

        // Method 2: freeMemory()
        // Printing the number of free bytes
        System.out.println("Total Memory: "+run.totalMemory());

        // Method 3: totalMemory()
        // Printing the number of total bytes
        System.out.println("Total Memory: "+run.totalMemory());

        // Java Program to Illustrate Runtime class
// Via exec() Method

        // Creating a process and execute google-chrome
        Process process = Runtime.getRuntime().exec("google-chrome");
        System.out.println("Google Chrome successfully started");

        // Method 1: availableProcessors()
        // Check the number of processors available
        // and printing alongside
        System.out.println("" + Runtime.getRuntime()
                .availableProcessors());


        // Method 2: exit()
        // Making program to exit
        Runtime.getRuntime().exit(0);

        // Nothing will run now
        System.out.println("Program Running Check");

        // Note: here we will notice that there will be no
        // output generated on console



        // Print statement
        System.out.println("Finalized");

        // Method 3: gc()
        // Run the garbage collector
        Runtime.getRuntime().gc();

        System.out.println("Running");

        // Method 4: maxMemory()

        // Printing  the maximum memory
        System.out.println(
                "" + Runtime.getRuntime().maxMemory());
    }
    }


