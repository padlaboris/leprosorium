package com.github.padlaboris.basic.loop;

public class BreakLoops3 {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // terminate loop if i is 10
                System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}