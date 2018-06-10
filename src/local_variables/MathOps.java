/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Write a method called  mathOps  that takes a single int argument. Declare local variables of type int inside method  mathOps  that do the following:
- Compute the square of the argument
- Subtract 10 from the argument
- Multiply the argument by 10 
*/
package local_variables;

/**
 *
 * @author Albert
 */
public class MathOps {
    public static void MathOps(int a)
    {
    int square=a*a;
    int subtract=a-10;
    int times=a*10;
    System.out.println(a+" squared is "+square);
    System.out.println(a+" -10 is "+subtract);
    System.out.println(a+" times 10 is "+times);
    }
    public static void main (String [] args)
    {
    MathOps(15);
    }
}
