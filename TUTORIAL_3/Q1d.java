/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_3;

/**
 *
 * @author yifah
 */
import java.util.*;
public class Q1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String s1 = sc.nextLine();

    System.out.print("Enter the second string: ");
    String s2 = sc.nextLine();

    if (s1.compareToIgnoreCase(s2) <= 0) {
        System.out.println(s1);
        System.out.println(s2);
    } else {
        System.out.println(s2);
        System.out.println(s1);
    }
        
    }
    
}
