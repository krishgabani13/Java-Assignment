package Loops;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = SC.nextInt();

        System.out.println("The table of " + n + " is :");

        for(int i=n; i<= (n * 10); i+=n)
        {

            System.out.println(i);
        }
    }
}
