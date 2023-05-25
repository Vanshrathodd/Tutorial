package com.vansh;

import java.util.Scanner;
// temperature conversion Celsius to Fahrenheit:-
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Therefore temp in fahrenheit: " + tempF);
    }
}
