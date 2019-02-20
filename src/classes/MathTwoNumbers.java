/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Albert
 */
public class MathTwoNumbers {
    public static void main(String[] args) {
        // B = 2*A, A is abcd, B is 1efgh
        //
        //
        ArrayList<Integer> resA = new ArrayList<Integer>();
        ArrayList<Integer> resB = new ArrayList<Integer>();
        
        for(int a=6;a<=9;a++) {
            for(int b=2;b<=9;b++) {
                if(b!=a && b!=5) {
                    for(int c=2;c<=9;c++) {
                        if(c!=b && c!=a && c!=5) {
                            for(int d=2;d<=9;d++) {
                                if(d!=c && d!=b && d!=a && d!=5) {
                                    for(int e=2;e<=9;e++) {
                                        if(e!=d && e!=c && e!=b && e!=a) {
                                            for(int f=2;f<=9;f++) {
                                                if(f!=e && f!=d && f!=c && f!=b && f!=a) {
                                                    for(int g=2;g<=9;g++) {
                                                        if(g!=f && g!=e && g!=d && g!=c && g!=b && g!=a) {
                                                            for(int h=2;h<=9;h++) {
                                                                if(h!=g && h!=f && h!=e && h!=d && h!=c && h!=b && h!=a && h%2==0) {
                                                                    System.out.println("A is "+Integer.toString(1000*a+100*b+10*c+d)+"; B is "+Integer.toString(10000+1000*e+100*f+10*g+h));
                                                                    if(2*(1000*a+100*b+10*c+d)==10000+1000*e+100*f+10*g+h) {
                                                                        resA.add(1000*a+100*b+10*c+d);
                                                                        resB.add(10000+1000*e+100*f+10*g+h);
                                                                        System.out.println("!!!! found !!!! A is "+Integer.toString(1000*a+100*b+10*c+d)+"; B is "+Integer.toString(10000+1000*e+100*f+10*g+h));
                                                                    }
                                                                }
                                                                
                                                            }
                                                            }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    
}
