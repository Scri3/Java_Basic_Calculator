/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;

import java.util.Scanner;
public class Calc {
    
    public static void main(String[] args) {
        

        System.out.println("Welcome! ");
        System.out.println("Addition = 1");
        System.out.println("Subtraction = 2");
        System.out.println("Multiplication = 3");
        System.out.println("Division = 4");

        Scanner OC = new Scanner(System.in);
        int Operation_Command = OC.nextInt();

        System.out.println("Enter First Number: ");
        Scanner n1 = new Scanner(System.in);
        float num1 = n1.nextFloat();
        System.out.println("Enter Second Number: ");
        Scanner n2 = new Scanner(System.in);
        float num2 = n2.nextFloat();
        switch (Operation_Command) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
