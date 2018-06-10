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
public class parameterOps {
    public static void ParameterOps (double a, double b)
    {
    double sum = a+b;
    double product = a*b;
    double quotient1 =a/b;
    double quotient2 =b/a;
    System.out.println(sum);
    System.out.println(product);
    System.out.println(quotient1);
    System.out.println(quotient2);
    }
    public static void main (String [] args)
    {
    ParameterOps (1.5, 0.5);
    }
}
