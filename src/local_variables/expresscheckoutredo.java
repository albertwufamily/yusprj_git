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
public class expresscheckoutredo {
    public static void Overlimit (int a, String b)
    {
    switch (b)
    {
        case "produce":
            if (a>15)
                System.out.println("you have purchaced too many");            
        
        case "meat":
            if (a>5)
                System.out.println("you have purchaced too many");
        
        case "seafood":
            if (a>10)
                System.out.println("you have purchaced too many");
    
        case "bakery":
            if (a>5)
                System.out.println("you have purchaced too many");    
    }
    }
    public static void main (String [] args)
    {
    Overlimit(17, "meat");
    }
}