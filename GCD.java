package gcd;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        int num1, num2, gcd;
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number : ");
        num1 = sc.nextInt();
        System.out.print("input second number : ");
        num2 = sc.nextInt();

        System.out.print("GCD : "+ gcd(num1, num2) + "\n");

    }

    static int gcd(int m, int n) {
        if (n != 0) {
            return gcd(n, n = m % n);
        } else {
            return m;
        }
    }

}
