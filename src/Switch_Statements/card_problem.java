/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author Albert
 */
public class card_problem {
    public static void main (String [] args){
    int card_face = 13;
    switch (card_face){
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        case 4:
            System.out.println("four");
            break;
        case 5:
            System.out.println("five");
            break;
        case 6:
            System.out.println("six");
            break;
        case 7:
            System.out.println("seven");
            break;
        case 8:
            System.out.println("eight");
            break;
        case 9:
            System.out.println("nine");
            break;
        case 10:
            System.out.println("jack");
            break;
        case 11:
            System.out.println("queen");
            break;
        case 12:
            System.out.println("king");
            break;
        case 13:
            System.out.println("ace");
            break;
        default:
            System.out.println("invalid");
    }
    }
}
