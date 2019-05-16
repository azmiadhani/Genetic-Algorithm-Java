/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

/**
 *
 * @author Az
 */
public class Function {
    public static double getRandomIntegerBetweenRange(int min, int max){
        int x = (int) (Math.random()*((max-min)+1)+min);
        return x;
    }
}
