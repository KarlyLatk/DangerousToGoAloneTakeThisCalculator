package org.example;

public class TriangleNumberCalculator {
    // Returns the nth triangular number
    public int value(int n) {
        if(n==1){
            return 1;
        }
        else if(n < 1){
            return 0;
        }
        return n+value(n-1);
    }

    // Adds the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(m) + value(n);
    }

    // Subtracts the nth and mth triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    // Multiplies the nth and mth triangular numbers
    public int multiply(int n, int m) {
        return value(m) * value(n);
    }

    // Divides the nth and mth triangular numbers
    public int divide(int n, int m) {
        return value(n) / value(m);
    }

    // Returns a list of triangular numbers up to the nth number
    public String sequence(int n) {
        return sequence(n-1) + ", " + value(n);
    }
}
