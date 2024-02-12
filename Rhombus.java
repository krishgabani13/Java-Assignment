package PatternPrinting_Composite;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the no :");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
