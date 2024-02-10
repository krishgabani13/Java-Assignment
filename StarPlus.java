package Patternprinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int mid = (n/2) + 1;

                if (i==mid || j==mid) {
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
