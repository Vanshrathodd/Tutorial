package com.vansh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//  find the largest of the three numbers
 /* Method 1:-
    suppose we have the values like,
                a = 10
                b = 20
                c = 30
          here we first Assume 'a' as the max value.  Max = 10.
          then the program will check if 'a>b' if it is greater than 'b' will become max value.  If b>Max then Max=b, Max = 20.
          same check will happen with 'c', If c>Max then Max=c, Max=30.

    program:-
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int Max = a;
        if (b>Max) {
            Max=b;
        }
        if (c>Max) {
            Max=c;
        }
        System.out.println(Max);
*/

/*  Method 2:-
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int Max = 0;
        if (a>b) {
            Max = a;
        }
        if (b>a) {
            Max = b;
        }
        if (c>Max) {
            Max = c;
        }
        System.out.println(Max);
 */

/*  Method 3:- Using Math.max
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
 */


    }
}
