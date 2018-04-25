 /*Lane 1 : Lane 2: Lane 3: Lane 4: Lane 5:
Less than 4 items Either 5 or 7 items Either 6, 9, or 10 items 8 items
All others
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author Albert
 */
public class supermarket {
    public static void main (String [] args){
    int items = 4;
    switch(items){
        case 0: case 1: case 2: case 3: case 4:
            System.out.println("lane 1");
            break;
        case 5: case 7:
            System.out.println("lane 2");
            break;
        case 6: case 9: case 10:
            System.out.println("lane 3");
            break;
        case 8:
            System.out.println("lane 4");
            break;
        default:
            System.out.println("lane 5");
    }
    }
}
