package Loops;

import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = SC.nextInt();

        int sum = 0;

        for (int i=1; i<=n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
