/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
public class Q1e {
    public static void main(String[] args) {
        double num = 25.0;
        double sum = 0.0;
        for(double i=1.0 ; i<=25.0 ; i++){
            sum += i/num;
            num--;
        }
        System.out.printf("The sum of the series is: %.2f%n" , sum);
    }
}
