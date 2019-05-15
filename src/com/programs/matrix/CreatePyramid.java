package com.programs.matrix;
import java.util.Collections;

public class CreatePyramid {

    public static void main(String[] args) {

        int rows = 5;

        System.out.println("\n1. Half Pyramid\n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n2. Full Pyramid\n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        //java 8 , one line
        System.out.println("\n3. Full Pyramid (Compact)\n");
        for (int i = 0; i < rows; i++) {

            System.out.println(String.join("", Collections.nCopies(5 - i - 1, " "))
                    + String.join("", Collections.nCopies(2 * i + 1, "*")));

        }

        // java 8
        System.out.println("\n4. Inverted Pyramid\n");
        for (int i = rows; i > 0; i--) {

            System.out.println(String.join("", Collections.nCopies(5 - i, " "))
                    + String.join("", Collections.nCopies(2 * i - 1, "*")));

        }

    }

}