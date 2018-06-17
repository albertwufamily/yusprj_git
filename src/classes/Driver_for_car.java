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
public class Driver_for_car {
    public static void main (String [] args)
    {
    Car c1 = new Car();
        c1.make="mustang";
        c1.model="shellby 500";
        c1.gm=10;
        c1.td=10;
        c1.tgu=100;
        c1.drive(100);
    }
}
