/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        System.out.printf("What is the first number? ");
        Scanner scanner = new Scanner(System.in);
        String firstnum = scanner.nextLine();
        int first = Integer.parseInt(firstnum);
        System.out.printf("What is the second number? ");
        Scanner scanner1 = new Scanner(System.in);
        String secondnum = scanner1.nextLine();
        int second = Integer.parseInt(secondnum);
        System.out.printf(first + " + " + second + " = " + (first + second)+"\n");
        System.out.printf(first + " - " + second + " = " + (first - second)+"\n");
        System.out.printf(first + " * " + second + " = " + (first * second)+"\n");
        System.out.printf(first + " / " + second + " = " + (first / second)+"\n");
    }
}