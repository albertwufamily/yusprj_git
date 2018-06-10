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
public class Mower_redo {
    public static void monthlyReport (int earn, int gas, int garbagebags, int repairs, int sneakers)
    {
        double mateirials = gas+garbagebags;
        double additional_ex = sneakers + repairs ;
        double total_costs = mateirials+additional_ex;
        double gross_income = earn - total_costs;
        double gross_tax = gross_income*0.25; //tax rate is 0.25
        double net_income=gross_income-gross_tax;
        System.out.println("mower buisness first month report");
        System.out.println("I made $" + earn + " mowing lawns");
        System.out.println("I spent $" + gas + " on gasoline");
        System.out.println("I spent "+garbagebags+ " on garbage bags");
        System.out.println("I spent $" + repairs + " to repair my mower");
        System.out.println("I spent $" + sneakers + " on sneakers");
        System.out.println("I spent $" + mateirials + " on matierial");
        System.out.println("I spent $" +  additional_ex + " on aditional expenses");
        System.out.println( "my gross incom is " + gross_income);
        System.out.println( "my gross income tax is " + gross_tax);
        System.out.println( "my final net incom is " + net_income);
    } 
    public static void main (String [] args)
    {
    monthlyReport(500, 20, 5, 50, 50);
    }
}
