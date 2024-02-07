package Loops;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter first value :");
        int n1 = SC.nextInt();
        System.out.print("Enter the second value :");
        int n2 = SC.nextInt();

        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}
