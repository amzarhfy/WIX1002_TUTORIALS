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
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int biggest = num1;
        
        if (num2 > biggest){
            biggest = num2;
        }
        
        if (num3 > biggest){
            biggest = num3;
    }
        System.out.println("The biggest number is: " + biggest);
        
        
    }
    
}
