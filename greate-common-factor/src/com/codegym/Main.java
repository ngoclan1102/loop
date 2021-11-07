package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a : ");
        int a = scanner.nextInt();
        a = Math.abs(a);
        System.out.println("nhap so b : ");
        int b = scanner.nextInt();
        b = Math.abs(b);
        if ( a == 0 || b == 0 ){
            System.out.println("No greatest common factor");
        }else {
            while ( a != b) {
                if ( a > b ){
                    a = a - b ;
                }else {
                    b = b - a ;
                }
            }
        }
        System.out.println("Greatest common factor : " + a);
    }
}
