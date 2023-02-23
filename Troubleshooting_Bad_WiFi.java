/**
* The program leads a person fixing a bad Wi-Fi connection
* @author Mohammad Seeam
*/

//Importing the below libraries to take input from user and display output.
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Troubleshooting_Bad_WiFi{

    /* 
        The below is main function. 
        Inside the main(), we take input from user, and display the output and suggestion.
    */

    public static void main(String[] args) {

        //The s object will allow us to take input from user
        Scanner s = new Scanner(System.in);

        //answer_from_user is the string where we store input from user
        String answer_from_user;

        System.out.println("Reboot the computer and try to connect.");
        System.out.print("Did that fix the problem?: ");

        //Using answer_from_user string and s object to take input from user
        answer_from_user=s.next();

        //In the below statements, when answer_from_user is Yes, problem solved, the program ends.
        //In the below statements, when answer_from_user is no, problem NOT solved, the program runs and asks to take next necessary steps/actions.

        if(answer_from_user.equals("YES") || answer_from_user.equals("Yes") || answer_from_user.equals("yes")){
            System.exit(0);
        }else if(answer_from_user.equals("NO") || answer_from_user.equals("No") || answer_from_user.equals("no")){
            System.out.println("Reboot the router and try to connect.");
            System.out.print("Did that fix the problem?: ");  
            answer_from_user=s.next();
            if(answer_from_user.equals("YES") || answer_from_user.equals("Yes") || answer_from_user.equals("yes")){
                System.exit(0);
            }else if(answer_from_user.equals("NO") || answer_from_user.equals("No") || answer_from_user.equals("no")){
                System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
                System.out.print("Did that fix the problem?: ");  
                answer_from_user=s.next();
                if(answer_from_user.equals("YES") || answer_from_user.equals("Yes") || answer_from_user.equals("yes")){
                    System.exit(0);
                }else if(answer_from_user.equals("NO") || answer_from_user.equals("No") || answer_from_user.equals("no")){
                    System.out.println("Move the router to a new location.");
                    System.out.print("Did that fix the problem?: ");  
                    answer_from_user=s.next();
                    if(answer_from_user.equals("YES") || answer_from_user.equals("Yes") || answer_from_user.equals("yes")){
                        System.exit(0);
                    }else if(answer_from_user.equals("NO") || answer_from_user.equals("No") || answer_from_user.equals("no")){
                        System.out.print("Get a new router.");  
                    }
                }
            }
        }                
    }
}