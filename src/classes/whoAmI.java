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
public class whoAmI {
    String firstname;
    String lastname;
    int age;
    String gender;
    void SetFirstName(String who) {
        firstname = who;
    }
    void setLastname(String who) {
        lastname = who;
    }
    void setAge(int who) {
        age = who;
    }
    void setGender(String who) {
        gender = who;
    }
    void printMe() {
        System.out.println(firstname + " " + lastname + " "  + age + " " + gender);
    }
    
    
    public static void main (String [] args){
    
        whoAmI p1 = new whoAmI();
        p1.SetFirstName("albert");
        p1.setLastname("wu");
        p1.setAge(10);
        p1.setGender("male");
        p1.printMe();
        
        whoAmI p2 = new whoAmI();
        p2.SetFirstName("rosie");
        p2.setLastname("wu");
        p2.setAge(4);
        p2.setGender("female");
        p2.printMe();
    }
}
