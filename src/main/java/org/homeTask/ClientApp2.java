package org.homeTask;
import java.util.*;
import java.io.*;
public class ClientApp2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int principal = 0, time = 0, n = 0;
        double rate = 0;
        boolean exit = false;
        InterestCalculator i = new InterestCalculator();
        System.out.write("Enter principal amount: ".getBytes());
        principal = sc.nextInt();
        System.out.write("Enter rate: ".getBytes());
        rate = sc.nextDouble();
        System.out.write("Enter time: ".getBytes());
        time = sc.nextInt();
        System.out.write("press 1 to calculate simple interest\npress 2 to calculate compound interest\npress 3 to exit\n".getBytes());
        do {
            System.out.write("\nEnter your choice:".getBytes());
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double ans = i.calculateSi(principal, rate, time);
                    System.out.write(("S.I. is Rs " + ans).getBytes());
                    break;
                case 2:
                    double ci = i.calculateCi(principal, rate, time);
                    System.out.write(("C.I. is Rs " + ci).getBytes());
                    break;
                case 3:
                    exit = true;
                    break;
            }
        } while (exit != true);
        System.out.write("Program complete!".getBytes());
    }
}
