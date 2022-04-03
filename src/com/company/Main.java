package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // input a word
        Scanner rice = new Scanner (System.in);
        System.out.println("give me a word");
        String y = rice.nextLine();
        // input an integer
        System.out.println("give me a number");
        int x = rice.nextInt();
        // print the word integer times
        for (int i = 1; i <= x; i++)
        {
            System.out.println(y);
        }

    }
}
