package com.github.padlaboris.basic.Varargs;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
