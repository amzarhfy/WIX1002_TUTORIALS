/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
public class Q3 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        System.out.println("f1 = " + first);
        System.out.println("f2 = " + second);
        
        for (int i=3 ; i<=10 ; i++){
            int next = first + second;
            System.out.println("f"+i + " = " + next);
            first = second;
            second = next;
        }
            
            
        }
}


