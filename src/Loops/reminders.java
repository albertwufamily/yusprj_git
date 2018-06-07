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
public class reminders {

    public static void main(String[] args) {
        int d = 1;
        int m = 1;
        while (m <= 12) {
            d = 1;
            while (d <= 31) {
                switch (m) {
                    case 1:
                        if (d == 1) {
                            System.out.println("it is "+m+", "+d+" its new year's day");
                        }
                        break;
                    case 2:
                        if (d == 2) {
                            System.out.println("it is "+m+", "+d+" its groundhogs day");
                        } else if (d == 14) {
                            System.out.println("it is "+m+", "+d+" its valentines day");
                        }
                        break;
                    case 3:
                        if (d == 14) {
                            System.out.println("it is "+m+", "+d+" its time for the wedding anniversary");
                        } else if (d == 15) {
                            System.out.println("it is "+m+", "+d+" its time for my mothers birthday");
                        }
                        break;
                    case 7:
                        if (d == 4) {
                            System.out.println("it is "+m+", "+d+" its independence day");
                        }
                        break;
                    case 10:
                        if (d == 1) {
                            System.out.println("it is "+m+", "+d+" its Halloween");
                        }
                        break;
                }
                d++;
            }
            m++;
        }
    }
}
