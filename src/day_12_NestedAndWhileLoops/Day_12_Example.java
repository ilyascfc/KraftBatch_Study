package day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class Day_12_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(1);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();


        }
    }
}
