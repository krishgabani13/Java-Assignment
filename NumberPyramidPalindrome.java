package PatternPrinting_Composite;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j=1; j <= n - i; j++){
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
