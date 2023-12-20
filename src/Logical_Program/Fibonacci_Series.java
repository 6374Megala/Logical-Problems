package Logical_Program;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number  ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive  number ");
        } else {
            System.out.println("Fibonacci series for " + n + " terms:");
            printFibonacciSeries(n);
        }
    }

    static void printFibonacciSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");

            int nextTerm = n1+n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
