/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
public class Q1a {
    public static void main(String[] args) {
        
        int number = 0;
        int n = 1;
        while(number<2000){
            number = n*n*n;
            if(number<2000){
                n++;
            }
           
        }
        System.out.println("The largest integer n is " + (n-1)); 
    }
}   
