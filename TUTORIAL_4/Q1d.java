/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
import java.util.Scanner;
public class Q1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num ; i++){
            sum += i;
        }
        System.out.println("The sum of numbers is: " + sum);
    }
    
}
