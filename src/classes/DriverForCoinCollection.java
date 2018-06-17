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
public class DriverForCoinCollection {
    public static void main(String[] args) {
        CoinCollection cc1 = new CoinCollection();
        cc1.quarters=10;
        cc1.dimes=10;
        cc1.nickels=10;
        cc1.pennies=10;
        System.out.println(cc1.ComputeValue());
    }
}
