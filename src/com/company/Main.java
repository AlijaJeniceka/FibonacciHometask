package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position at Fibonacci sequence to know it's value: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }

        public static int fibonacci(int n) {
            if(n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }



    }

//Write a program that takes a value from the user and
//print out that number's position in fibonacci sequence.
//fibonacci sequence is a series of numbers where the previous two numbers sum up
// to make the next number
//In this case, take the first two numbers of the sequence to be 1, 1
// e.g. 1, 1, 2, 3, 5, 8...
// Enter the position you want: 5
// return 5, the sixth return 8 and etc.