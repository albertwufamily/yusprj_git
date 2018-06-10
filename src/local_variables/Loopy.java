/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local_variables;

/**
 *
 * @author Albert
 */
public class Loopy {
    public static void Loopy (String a)
    {
       int x; 
    for (x=0; x<10; x++)
    {
    String b = a+x;
    String c = b+x;
    System.out.println(b);
    System.out.println(c);
    }
    }
    public static void main (String [] args)
    {
    Loopy ("Awesome Albert");
    }
}
