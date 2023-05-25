package com.vansh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);


/*        System.out.println(in.next());
    If we want to print the inputted word we use this function.
 */

/*        System.out.println(in.next().trim());
    suppose we give an input data with spaces before it, the trim function automatically erases it while giving the output.
 */


/*        System.out.println(in.next().trim().charAt(0));
    Suppose we input a word "suiii" so using the function charAt(0),
    the letter at the 0th position will be printed.
    here the bracket() in charAt specifies which position should be printed

 */

        if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
