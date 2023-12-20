package Logical_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coupon_Numbers {
    private static int generateRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }
    public static int generateDistinctCoupons(int n) {
        List<Integer> distinctCoupons=new ArrayList<>();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < n) {
            int randomCoupon = generateRandomCoupon(n);
            totalRandomNumbers++;

            if (!distinctCoupons.contains(randomCoupon)) {
                distinctCoupons.add(randomCoupon);
                System.out.println("Generated Coupon: " + randomCoupon);
            }
        }
        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        int N = 10;
        int totalRandomNumbers = generateDistinctCoupons(N);
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }

}
