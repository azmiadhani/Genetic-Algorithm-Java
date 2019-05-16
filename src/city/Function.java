/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

import java.util.Scanner;

/**
 *
 * @author Az
 */
public class Function {
    public static double getRandomIntegerBetweenRange(int min, int max){
        int x = (int) (Math.random()*((max-min)+1)+min);
        return x;
    }
    public static boolean getEnter(String what_next){
        Scanner keyIn = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.print("Tekan enter untuk melanjutkan ke proses " + what_next);System.out.println("");
        System.out.println("--------------------------------------------------------------");
        keyIn.nextLine();
        return true;
    }
    public static boolean newline(){
        System.out.println("");
        return true;
    }
    
}
