package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first value");
        int x=s.nextInt();
        System.out.println("Enter first value");
        int y=s.nextInt();



        Calculator c = new Calculator();
        c.addition(x,y);
        c.subtraction(x,y);
        c.multiplication(x,y);
        c.Division(x,y);
    }
}
