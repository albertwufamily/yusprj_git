/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Write the following methods:
- sum: takes two double arguments, returns the sum as a double
- diff: takes two double arguments, returns the difference as a double
- prod: takes two double arguments, returns the product as a double
- quot: takes two double arguments, returns the quotient as a double
Call each several times with several different arguments from a main program. 
*/
package Methods;

/**
 *
 * @author lili
 */
public class s4 {
    public static void sum (double i1, double i2)
    {
    double sum = i1 +i2;
    System.out.println("the sum is "+sum);
    }
     public static void difference (double i1, double i2)
    {
    double difference = i1 - i2;
    System.out.println("the difference is "+difference);
    }
      public static void quotient (double i1, double i2)
    {
    double quotient = i1/i2;
    System.out.println("the quotient is "+quotient);
    }
     public static void product (double i1, double i2)
    {
    double product = i1 *i2;
    System.out.println("the product is "+product);
    }
    public static void main (String [] args)
    {
        sum(15.5, 15.5);
        difference(15.5, 15.5);
        product(15.5, 15.5);
        quotient(15.5, 15.5);
    }
}
