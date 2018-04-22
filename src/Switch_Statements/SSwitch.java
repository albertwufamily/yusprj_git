/*s1 is “Hello” , concatenate “ is fun” to s2
s1 is “Goodbye” , concatenate “ rocks” to s2
s1 is “Morning” , concatenate “ rocks” to s2
s1 is “Mom” , concatenate “ is easy” to s2, concatenate “ when I study” to s2
s1 is “Dad” , concatenate “ when I study” to s2
all others , concatenate “ supports switches” to s2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author lili
 */
public class SSwitch {
    public static void main (String [] args){
    String s1 = "Hello";
    String s2 = "java";
    switch (s1)
        {
        case "Hello":
            s2+="is fun";
            break;
        case "Goodbye": case "Morning":
            s2+="rocks";
            break;
        case "Mom":
            s2+="is easy";
        case "Dad":
            s2 += "when I study";
            break;
        default:
            s2 += "supports switches";
        }    
    }
}
