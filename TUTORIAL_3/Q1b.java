/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_3;

/**
 *
 * @author yifah
 */
import java.util.Scanner;
public class Q1b {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
         System.out.println("Even number");
    } else {
         System.out.println("Odd number");
    }
    }
    
}
