package com.vansh;
// *Check Excalidraw file for detailed explanation.
// Here "n%" gives us remainder.
// "n/" gives us quotient
public class CountingOccurrenceOfANumber {
    public static void main(String[] args) {
        int n = 455556789;
        int count = 0;
        while (n > 0) {
//  'n > 0' means that when the last remaining digit from the n gets divided by 10 the answer will be in '0.something'
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;    // can also write as "n /= 10"
        }
        System.out.println(count);
    }
}
// here we make two data type containers that is "n" & "rem"
// in "rem" we store modulo that is remainder.