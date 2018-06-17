/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Albert
 */
public class MonthDayRedo {
    int month;
    int day;
    int value;
    void compute ()
    {
    value = month *32+day;
    System.out.println(value);
    }
    void validate (){
            if (1<=month && month<=12)
            {
            if (1<=day && day<=31)
            {
            compute ();
            }
            }
    }
}
