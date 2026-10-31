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
public class Q1c {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a character: ");
    
    char ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <= 'Z') {
        System.out.println("Capital letter");
    } else {
        System.out.println("Not a capital letter");
    }
    }
}
