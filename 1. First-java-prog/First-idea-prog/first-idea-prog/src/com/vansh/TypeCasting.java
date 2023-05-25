package com.vansh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        System.out.println(number);

/* Here we understand the conditions for TypeCasting, firstly we put a float scanner and input an int number in the keyboard
* the result is we don't get an error because float is a value that is greater than int,
* in the next phase we write a int scanner and input a float value in it, the result will be error because int can't store float
* which is a greater value. */

//Now to store a large value into a small container we have to do it forcefully for that we use :-
//Narrowing Conversion:- Basically we compress the bigger number in a smaller type explicitly, here we narrow the float into an integer.

//        int num = (int)(67.79f);
//        System.out.println(num);

//  Now we want to store a int number in a byte value, the number is greater than 256, we know that byte can only store numbers
//  equal to or smaller than 256, So we do this process by :-

//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);
//  Here what happens is that 257>256 so the machine divides the two numbers and take its remainder value that is modulo 257%256=1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b / c;
//        System.out.println(d);
//   the system directly converts the byte to int after calculation,
//  Now here we can see that 40x50=2000 which is greater than 256 so how is this value gettin stored in a byte format,
//  because we later use int to convert these byte values to int.

//        byte b = 50;
//        b = b * 2;
//  so here it will give an error because the system directly converts the byte to int after calculation, so we
//    need to always store it in int, so after calculation when the byte value is converted to int how can we store an int
//        value in byte so this is not possible so it will give an error.


//        int number = 'a';
//        System.out.println(number);
//        System.out.println("こんにちは");
// Java uses the unicode principal:- basically all the languages such as hindi,chinese,japanese etc. can be written in java.



// Rules for TYPE PROMOTION :- 1) All the byte, short, character values are promoted to integer.
//                             2) if we have multiple data types such as int, float, double, so the answer will
//                                    be converted into the biggest data type that is double.
        byte b = 42;
        int i = 50000;
        char c = 'a';
        double d = 0.1234;
        short s = 1024;
        float f = 5.67f;
// Here we have different data types
        double result = (f * b) + (i / c) - (d * s);
//  here in first bracket we have float and byte so answer will be the bigger value that is byte.
//  in second bracket integer and char so answer in int.
//  third bracket double and short so answer double.
//  float + int - double = Double (biggest value from all the brackets.)
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
//           OR
        System.out.println(f * b);
        System.out.println(i / c);
        System.out.println(d * s);
// Doing this step to get individual answers for the brackets.
        System.out.println(result);



    }
}