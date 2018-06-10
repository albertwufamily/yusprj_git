/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local_variables;

/**
 *
 * @author lili
 */
public class s1 {
    public static double greatestdouble (float f1,int i1, double d1)
    {
        if (i1>f1)
            {
            d1=i1;
            }
            else    
        {
        d1=f1;
        }
        return d1;
    }
    public static void main (String [] args)
    {
        double greatestdouble = greatestdouble (15, 23, 234);
        System.out.println(greatestdouble);
    }
}
