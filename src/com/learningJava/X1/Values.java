package com.learningJava.X1;

import java.util.Scanner;

public class Values {
    public double value(){
        Scanner scanner = new Scanner(System.in);

        final double tax = .04;
        double value;
        double finalValue;

        System.out.println("Enter Value: ");
        value = scanner.nextDouble();
        finalValue = value*(1+tax);
        System.out.println(finalValue);

        return value;
    }
}
