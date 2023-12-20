package Logical_Program;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number  ");
        int n = scanner.nextInt();
        int diff=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                diff+=i;
            }
        }
        if(diff==n){
            System.out.print("This is a perfect number :  "+n);
        }
        else{
            System.out.print("This is not a perfect number :  "+n);
        }
    }
}
