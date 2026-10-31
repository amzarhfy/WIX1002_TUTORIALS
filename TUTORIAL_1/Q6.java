/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_1;

/**
 *
 * @author yifah
 */
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the diameter: ");
        double diameter = sc.nextDouble();

        double circumference = Math.PI * diameter;

        System.out.printf("Circumference = %.3f%n",
                          circumference);
    }
}

    
}
