package gcd;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        int num1, num2, gcd;
        Scanner sc = new Scanner(System.in);
        System.out.print("input number");
        num1 = sc.nextInt();
        System.out.print("input number");
        num2 = sc.nextInt();

        System.out.print(gcd(num1, num2));

    }

    static int gcd(int m, int n) {
        if (n != 0) {
            return gcd(n, n = m % n);
        } else {
            return m;
        }
    }

}
