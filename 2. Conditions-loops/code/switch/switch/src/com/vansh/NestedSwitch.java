package com.vansh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Vansh");
                break;
            case 2:
                System.out.println("Rathod");
                break;
            case 3:
                System.out.println("Role of the employee:");
                switch (Department) {
                    case "Nerd" -> System.out.println("IT dept");
                    case "Hustler" -> System.out.println("Civil dept");
                }
                break;
            case 4:
                System.out.println("Samosa");
                break;
        }
    }
}
