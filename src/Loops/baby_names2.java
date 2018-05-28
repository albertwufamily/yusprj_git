/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author lili
 */
public class baby_names2 {
    public static void main (String[] args)
    {
/*
Pick three friends and help them name their daughters by creating a variable for each and
assigning one of the girl name constants to it. Pick three other friends and help them
name their sons by doing the same with the boy name constants.*/
        int x = 1;
         String daughter1= "khloe"; final String friend1 = "andy";     
         String daughter2= "Mary"; final String friend2 = "bob";
         String daughter3= "Marissa"; final String friend3 = "sean";
         String son1 = "Robert"; final String friend4 = "daniel";
         String son2 = "Michel"; final String friend5 = "charlie";
         String son3 = "Zach"; final String friend6 = "ollie";
         String changefriend1 = friend1;
         String changefriend2 = friend2;
         String changefriend3 = friend3;
         String child1=daughter1;
         String child2=daughter2;
         String child3=daughter3;
        while (x<=2)
        {System.out.println(friend1+" your child could be called "+ child1);
        System.out.println(friend2+" your child could be called "+ child2);
        System.out.println(friend3+" your child could be called "+ child3);
        child1=son1;
        child1=son2;
        child1=son3;     
        changefriend1 = friend4;
        changefriend2 = friend5;
        changefriend3 = friend6;
        x++;
        }
    }       
}
