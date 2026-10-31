/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL_4;

/**
 *
 * @author yifah
 */
import java.util.Random;
public class Q1c {
    public static void main(String[] args) {
        Random rd = new Random();
        for(int i=0 ; i<5 ; i++){
            for(int j=0; j<4 ; j++){
                int num = rd.nextInt(0, 101);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }    
}
