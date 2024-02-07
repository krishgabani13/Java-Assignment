package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        String S = new String();
        S = SC.nextLine();

        int i, j, flag;
        flag = 0;
        i = 0;
        j = S.length() - 1;

        while (i<j && flag == 0)
        {
            if (S.charAt(i) != S.charAt(j))
                flag = 1;
                i++;
                j--;
        }
        if (flag == 0)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
