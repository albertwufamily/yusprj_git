/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author Albert
 */
public class L2 {
    public static void main (String [] args)
    {
    int y=1;
    int x=1;
    int z;
    while (y<=12){
        x= 1;
        System.out.println("");
        while (x<=12)
            {
            z = y*x;
            System.out.print(z+", ");
                x++;
            }
        y++;
        }
    }
}
