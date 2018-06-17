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
public class Driver_for_monthday {
    public static void main (String [] args)
    {
    MonthDayRedo mdr1 = new MonthDayRedo();
    mdr1.month=1;
    mdr1.day=1;
    mdr1.validate ();
    
    MonthDayRedo mdr2 = new MonthDayRedo();
    mdr2.month=2;
    mdr2.day=2;
    mdr2.validate ();
    }
}
