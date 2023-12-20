package Logical_Program;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int c=scan.nextInt();
        int ans=reverse(c);
        System.out.println(ans);

    }
    public static int reverse(int c){
        int ans=0;
        while(c>0){
            int rem=c%10;
            ans=ans*10+rem;
            c=c/10;
        }
        return ans;
    }
}
