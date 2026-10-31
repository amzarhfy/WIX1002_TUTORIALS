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

public class Q7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();

        double meters = inches * 2.54 / 100;

        System.out.printf("Meters = %.2f%n", meters);

    }
}

    }
    
}
