package Patternprinting;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if((i+j) > n) {
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