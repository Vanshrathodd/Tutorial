package com.vansh;

import java.util.Scanner;
/* how to use switch, case & default.
instead of using 'if & else' statements we use 'switch'
we can use the enhanced switch statements also which is in a much simpler syntax.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

/*  Using normal switch case default.   */
//        switch (fruit) {
//            case "Mango":
//                System.out.println("Sweetest");
//                break;
//            case "Orange":
//                System.out.println("cheaper");
//                break;
//            default:
//                System.out.println("Enter valid fruit name");


//  Using Enhanced switch, here we don't need to specify the break.
        switch (fruit) {
            case "Mango" -> System.out.println("Sweetest");
            case "Orange" -> System.out.println("cheaper");
            default -> System.out.println("Enter valid fruit name");
        }
    }
}