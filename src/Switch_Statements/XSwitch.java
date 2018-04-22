/*
x == 2 , y = 7
x == 3 , y = 6
x == 4 , y = 5
x == 5 , y = 4
all others , y = 3

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author lili
 */
public class XSwitch {
    public static void main (String[]args){
        int y;
        int x = 10;  
        switch (x){
        case 2:
            y=7;
            break;    
        case 3:
            y=6;
            break;
        case 4:
            y=5;
            break;
            case 5:
            y=4;
            break;
        default :
            y=3;
        }
        System.out.println("x is "+x+" "+"y is"+y);
    }
}