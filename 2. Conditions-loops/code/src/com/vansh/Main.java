package com.vansh;

public class Main {
    public static void main(String[] args) {
        int salary = 25000;
        if (salary > 20000) {
            salary += 2000;
        } else if (salary > 10000) {
            salary += 3000;
        } else {
            salary += 3000;
        }
        System.out.println(salary);
/*
 the code will be performed in descending order, so first it will check the 'if' statement. if it is true then it will
 execute it and won't check other conditions, only if the first statement is false it will check below and the same applies
 to the rest.
*/
    }
}
