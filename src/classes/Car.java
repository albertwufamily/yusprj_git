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
public class Car {
    String make;
    String model;
    double gm;
    double td;
    double tgu;
    void drive (int dd){
        td=td+dd;
        tgu = td/gm;
        System.out.println(td);
        System.out.println(tgu);
    }
}
