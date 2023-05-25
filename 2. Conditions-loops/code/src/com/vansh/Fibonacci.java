package com.vansh;

import java.util.Scanner;

/*
Fibonacci number: basically means the sum of previous two numbers.
example: (0,1) so the next number will be 0+1=1 (0,1,1)
the next number will be sum of previous two that is 1+1=2 (0,1,1,2....)
and so on the list continues.
 */

/*  Question; find the n^th fibonacci number
    1) we find for n=7 that is the seventh place number
    0,1,1,2,3,5,8,13,21
    so here on the seventh position we have '13' that is the answer.
    (the count starts from 0th to nth)
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        Input value till how many positions we want the fibonacci num
        int a = 0;
//        Specifies first number at 0th position.
        int b = 1;
//        Specifies second number at 1st position.
        int count = 2;
//        Specifies that the count should start from 2nd position.
        while(count <= n) {
            int temp = b;
//      Storing "b" in the temporary
            b = b + a;
//      Now in the temporary "b" we store "a+b"
            a = temp;
//      Now this temp value will be stored in "a"
            count++;
//      and then the loop continues till the "nth" value is reached.
        }
        System.out.println(b);
//        then finally we get the value at the "nth" position.
    }
}



