/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author lili
 */
public class HexDigit {
    public static void main (String [] args){
    int x = 15;
    switch (x){
        case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
           System.out.println(x);
           break;
        case 10:
            System.out.println ("a");
            break;
        case 11:
            System.out.println ("b");
            break;
        case 12:
            System.out.println ("c");
            break;
        case 13:
            System.out.println ("d");
            break;
        case 14:
            System.out.println ("e");
            break;
        case 15:
            System.out.println ("f");
            break;
        default:
            System.out.println("ERROR: number out of range ");
        }
    }
}
