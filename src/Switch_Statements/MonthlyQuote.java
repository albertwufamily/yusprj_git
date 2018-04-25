/*January:“Shoveling snow is bad for your back.”
February: “Chocolates on Valentine’s Day.”
March:“March comes in like a lion and goes out like a lamb.”
April:“April showers bring May flowers.”
May:“I’m queen of the May.”
June:“Schools out, kids.”
July:“By golly, it’s hot outside.”
August:“The dog days of August.”
September:“Back to school, kids.”
October:“Happy Halloween.”
November:“Don’t eat too much turkey.”
December:“It’s cold and flu season.”
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author Albert
 */
public class MonthlyQuote {
    public static void main (String [] args){        
        String the_month = "June";
        switch (the_month){
            case "January":
                    System.out.println("Shoveling snow is bad for your back.");
                    break;
            case "Febuary":
                    System.out.println("Chocolates on Valentine’s Day.");
                    break;
            case "March":
                    System.out.println("March comes in like a lion and goes out like a lamb.");
                    break;
            case "April":
                    System.out.println("April showers bring May flowers.");
                    break;
            case "May":
                    System.out.println("I’m queen of the May.");
                    break;
            case "June":
                    System.out.println("Schools out, kids.");
                    break;
            case "July":
                    System.out.println("By golly, it’s hot outside.");
                    break;
            case "August":
                    System.out.println("The dog days of August.");
                    break;
            case "September":
                    System.out.println("Back to school, kids.");
                    break;
            case "October":
                    System.out.println("Happy Halloween.");
                    break;
            case "November":
                    System.out.println("Don’t eat too much turkey.");
                    break;
            case "December":
                    System.out.println("It’s cold and flu season.");
                    break;
            
        }
    }
}
