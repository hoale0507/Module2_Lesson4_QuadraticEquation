package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a;
        do{
        System.out.println("Enter a:");
        a = input.nextDouble();
        } while (a == 0);

        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        QuadraticEquation myEquation = new QuadraticEquation(a,b,c);
        double delta = myEquation.getDiscriminant();
        if(delta > 0){
            System.out.println("The equation has 2 roots: " + myEquation.getRoot1() + ", "+ myEquation.getRoot2());
        } else if(delta == 0){
            System.out.println("The equation has 1 root: " + myEquation.getRoot1());
        } else {
            System.out.println("There is no root");
        }


    }
}
