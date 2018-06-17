/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author lili
 */
public class person 
{
    String name;
    int ssn;
    public static void main (String [] args)
    {
    person p1=new person ();
    person p2=new person ();
    person p3=new person ();
    p1.name="Cyndy";
    p1.ssn=123;
    p2.name="Aaron";
    p2.ssn=456;
    p3.name="Albert";
    p3.ssn=789;
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    }
}