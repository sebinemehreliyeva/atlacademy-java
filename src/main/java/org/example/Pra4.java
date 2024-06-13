package org.example;

import java.util.Scanner;

public class Pra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (x >= a && x <= b) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}
