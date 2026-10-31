/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
public class Q2a {
    public static void main(String[] args) {
        
    //    for (x = 10; x > 0; x++) // loop will run infinitely
    //        sum += x;
    
        int sum = 0;
        for (int x = 10; x > 0; x--){
            sum += x;
        }
        System.out.println(sum);
    }
}