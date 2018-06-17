/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author lili
 */
public class Month_day {
     public static void main (String[] args)
    {
        final int feb = 2;
        final int june = 6;
        final int sept = 9;
        final int dec = 12;
        int monthday1 = feb*32+1;
        int monthday2 = june*32+15;
        int monthday3 = sept*32+4;
        int monthday4 = sept*32+7;
        int monthday5 = dec*32+31;
        System.out.println(monthday1);
        System.out.println(monthday2);
        System.out.println(monthday3);
        System.out.println(monthday4);
        System.out.println(monthday5);
    }

}
