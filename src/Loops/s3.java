/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
A divisor is evenly divisible by a quotient if the operation divisor % quotient results in zero.
Write a for loop that counts the numbers from 1 through 100 that are evenly divisible by 4. 
*/
package Loops;

/**
 *
 * @author lili
 */
public class s3 {
    public static void main (String [] args){
    int x;
        for (x=0;x<=100;x++)
        {
            if (x%4==0)
            {
            System.out.println(x);
            }
        }
    } 
}
