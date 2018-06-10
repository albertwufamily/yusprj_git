/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Enhance the CheckEnrollment class from the if Statements lesson by adding a method
named canEnroll to it. The method canEnroll has the following parameters:
monthDeadline: an int containing the month after which you cannot enroll in the
course.
dayDeadline: an int containing the day of month after which you cannot enroll in
the course.
numStudents: an int containing the number of students currently enrolled in the
Class.
The method canEnroll returns a boolean which is true if you can enroll in the class. The
conversion of month and day to a single integer should be performed inside canEnroll .
Call canEnroll for Java, European History, and Contemporary Art. Print whether or not you
can register for each class.
Course              Deadline                Number of Students Enrolled
Java                February 1st            35
European History    January 20th            28
Contemporary Art    February 1st            42 
*/
package Methods;

/**
 *
 * @author lili
 */
public class check_enrollment_redo {
    public static void CanEnroll (int md, int dd, int ns, String classname)
    {
        int today = (1<<5)+25;
        int deadline = (md<<5)+dd;
        if (deadline<=today)
            {
            if (ns<40)
                {
                System.out.println("can enroll in "+ classname);
                }
            }
    }
    
    
    public static void main (String [] args)
    {
    CanEnroll (2, 1, 35, "java");
    CanEnroll (1, 20, 28, "European History");
    CanEnroll (2, 1, 42, "Contemporary Art");
    }
}
