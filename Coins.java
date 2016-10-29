package coins;

import java.util.Scanner;

/**
 *
 * @author cpisidro
 */
public class Coins {

    public static void main(String[] args) {
        double invalue, c25, p10, p5, p1;
        Scanner sc = new Scanner(System.in);
        System.out.print("input value: ");
        invalue = sc.nextDouble();

        p10 = invalue / 10;
        p5 = (invalue % 10) / 5;
        p1 = invalue % 5;
        c25 = (invalue % 1) / 0.25;

        System.out.println("10 peso coins: " + (int) p10);
        System.out.println("5  peso coins: " + (int) p5);
        System.out.println("1  peso coins: " + (int) p1);
        System.out.println("25 cent coins: " + (int) c25);

    }

}
