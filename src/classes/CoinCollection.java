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
public class CoinCollection {
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    int ComputeValue ()
        {
            int value = quarters*25+dimes*10+nickels*5+pennies;
            return value;
        }
}

