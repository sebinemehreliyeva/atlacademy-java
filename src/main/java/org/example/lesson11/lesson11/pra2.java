package org.example.lesson11.lesson11;

import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x%10+x/10)*(x%10+x/10));

    }
}
