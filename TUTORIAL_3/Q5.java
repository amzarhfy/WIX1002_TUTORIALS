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
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        else if (year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap ");
        }
    }
    
}
