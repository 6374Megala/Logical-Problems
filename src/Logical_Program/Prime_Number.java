package Logical_Program;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number  ");
        int N = scanner.nextInt();
        boolean check=false;
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print("The number is not a Prime Number "+N);
                check=true;
                break;
            }
        }
        if(!check){
            System.out.print("The number is  a Prime Number "+N);
        }


    }
}
