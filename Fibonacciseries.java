package Loops;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = SC.nextInt();

        int a=0, b=1, c;
        for(int i=1; i<n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b  = c;
        }
    }
}
