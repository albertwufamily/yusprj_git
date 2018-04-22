/*a== 1 , b++ , c--
a == 2 , c--
a == 3 or 5 , b-- , c++
a == 6 , b+=2
all others , c+=2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements;

/**
 *
 * @author lili
 */
public class ASwitch {
    public static void main (String [] args){
        int a = 1;
        int b = 4;
        int c = 7;
        switch (a){
            case 1:
                b++;
            case 2:
                c--;
                break;
            case 3: case 5:
                b--;
                c++;
                break;
            case 6:
                b+=2;
                break;
            default:
                c+=2;
        }
        System.out.println ("a is "+a+" b is "+b+" c is "+c);
    }
}
