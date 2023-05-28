package com.vansh;

import java.util.Scanner;
// Days in a week
public class Day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Days = in.next();


//   Normal week days
//        switch (Days) {
//            case "1" -> System.out.println("Monday");
//            case "2" -> System.out.println("Tuesday");
//            case "3" -> System.out.println("Wednesday");
//            case "4" -> System.out.println("Thursday");
//            case "5" -> System.out.println("Friday");
//            case "6" -> System.out.println("Saturday");
//            case "7" -> System.out.println("Sunday");
//            default -> System.out.println("Invalid input");


//   Weekdays & Weekends.
//    So, here basically monday to friday are weekdays and sat & sunday are weekends.
//    Here we see the use of break function by Traditional method.
//        switch (Days) {
//            case "1":
//            case "2":
//            case "3":
//            case "4":
//            case "5":
//                System.out.println("Weekday");
//                break;
//            case "6":
//            case "7":
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid input");
//                break;


//        Enhanced version
        switch (Days) {
            case "1", "2", "3", "4", "5" -> System.out.println("Weekday");
            case "6", "7" -> System.out.println("Weekend");
            default -> System.out.println("Invalid input");
        }
    }
}
