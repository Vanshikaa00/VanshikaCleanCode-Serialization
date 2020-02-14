package org.homeTask;
import java.io.*;
public class InterestCalculator {
    public double calculateSi(int principal, double rate, int time) {
        double ans = (double) ((principal * rate * time) / 100);
        return ans;
    }
    public double calculateCi(int p, double r, int t) throws IOException {
        double amount = p * Math.pow(1 + (r / 100),  t);
        double cinterest = amount - p;
        return cinterest;
    }
}
