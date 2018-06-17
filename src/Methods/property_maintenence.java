/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author lili
 */
public class property_maintenence {
    public static void print_properties (int mowed, int fertilized)
        {
        System.out.println(mowed + " properties were mowed");
        System.out.println(fertilized + " properties were fertilized");
        }
    
    public static void mower_income(double income)
        {
        double income_tax = income*1/4;
        double net_income = income-income_tax;
        System.out.println(income);
        System.out.println(income_tax);
        System.out.println(net_income);
        }
    public static void mower_report (double income, int fertilized, int mowed)
        {
        System.out.println("lawn Mower Monthly Report");
        System.out.println();
        print_properties(10, 12);
        mower_income(20);
        }
    public static void print_removal(int driveways, int sidewalks, boolean blower)
        {
        System.out.println(driveways);
        System.out.println(sidewalks);
        System.out.println("I used a snowblower" + blower);
        }
    public static void print_snow_income (double income)
        {
        System.out.println(income);
        }

}
