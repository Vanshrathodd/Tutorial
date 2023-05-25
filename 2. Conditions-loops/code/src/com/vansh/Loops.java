package com.vansh;

import java.util.Scanner;
// Tip:- Ctrl+W keep on pressing to select multiple lines
public class Loops {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        /* Print numbers from 1 to 5
         Syntax for, FOR LOOP:-
         for (initialization; condition; increment/decrement) {
              // body }
        */

//        for (int a = 1; a < 6; a++) {
//            System.out.println(a);
//        }


//        Shortcut for, For loop= fori



/*  While Loop example:-
        int num = 1;
        while (num<=5) {
            System.out.println(num);
            num++;
        }
 */


 /*  Printing numbers from '1 to n' OR 'any sentence for n times' using FOR loop.
    basically we create a loop  where we specify "n" that from 1 to how many times the loop should run.
    n is the number we must input to specify the limit.
    Whatever the command is given in the bracket{} will be printed n times.
    suppose we want to print "Hello World" n times:-
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World");
        }

    printing from 1 to n:-
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
 */



// When to use 'While & For' Loops
/* Suppose when we have a defined set of how much time the loop should run we will use the 'For' loop.
   For loop example:- suppose we have to take inputs for five times only i.e. we know the defined times the loop will run.
 */
/* So, for 'While' loop we need not know for how many times the loop needs to run, we just need to know what value is required
        to stop the loop or else it will be running infinitely.
   While loop example:- The letter "X" should be inputted, or else the loop will not stop.
 */



/*  When to use "do while" or "while" loop
    So in "do while" it will first execute the body, and then it will perform the checks, basically it means that one statement
    will always be executed.
    suppose we have a code :-
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n!=1);
 */

    }
}
