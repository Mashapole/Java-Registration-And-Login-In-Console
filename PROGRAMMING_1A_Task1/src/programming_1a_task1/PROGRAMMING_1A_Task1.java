package programming_1a_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class PROGRAMMING_1A_Task1 
{

    public static void main(String[] args)
    {
      
        System.out.println("*******************************************");
        System.out.println("--------WELCOME TO MY APPLICATION----------");
        Scanner scan = new Scanner(System.in);
        startUp(scan);

        
        
    }

    private static void startUp(Scanner scan) 
    {
        System.out.println("\nPress (1) to Create Account(Sign-up) Before log-in");
        System.out.println("1. Create Account");
        System.out.println("0. Exit");
        Login getMethod= new Login();
        while(true)
        {
         
             int selection=scan.nextInt();
             
            switch (selection) 
            {
                case 1:
                    getMethod.RegisterUser(scan);
                    break;
                default:
                    System.exit(0);
                    break;
            }
      
        }
        
    }
    public static void prompt(Scanner scan) 
    {
        //Create an account by entering username, password, first name and last name.
        String userName,firstName,lastName,password="";
        
        Login getMethods= new Login();
        System.out.println("-------------WELCOME TO REGISTRATION-------------------------");
        System.out.println("Please enter the following to register.");
        
        System.out.print("Please enter your first name: ");
        firstName=scan.next();
        System.out.print("Please enter your last name: ");
        lastName=scan.next();
        getMethods= new Login(firstName,lastName);
        
        System.out.print("Please enter your username: ");
        userName=scan.next();
        while(!getMethods.checkUserName(userName))
        {
            System.out.println("The username entered is invalid");
            
            System.out.print("Please enter your username: ");
            userName=scan.next();
        }
        System.out.println("Username Successfully captured\n");
        System.out.print("Please enter your password: ");
        password=scan.next();


        while(!getMethods.checkPasswordComplexity(password))
        {
            System.out.println("The password entered is invalid");
            

            System.out.print("Please enter your password: ");
            password=scan.next();
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nPress (1) to Sign-in(Login)");
        System.out.println("1. Login");
        System.out.println("0. Exit");
        Login getMethod= new Login();
        while(true)
        {
         
             int selection=scan.nextInt();
             
            switch (selection) 
            {
                case 1:
                    String logUser,logPassword="";
                    List<String> List=new ArrayList<>();
                    
                    System.out.println("-------------WELCOME TO LOGIN-------------------------");
                    System.out.println("Please enter the following to Login.");
                    System.out.print("Please enter your username: ");
                    logUser=scan.next();
                    System.out.print("Please enter your password: ");
                    logPassword=scan.next();
                    
                    while(!getMethods.LoginUser(logUser,logPassword))
                    {
                        System.out.println("The username or Password entered is invalid");

                        System.out.print("Please enter your username: ");
                        logUser=scan.next();
                        System.out.print("Please enter your password: ");
                        logPassword=scan.next();
                    }
             
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("--------------------Application End--------------------------");
                    Quit();
                    break;
                default:
                    System.exit(0);
                    break;
            }
      
        }

         
       
    } 

    private static void Quit() 
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any key to exit the application");
        String key=scan.next();
        
        if(key!="")
        {
            System.exit(0);
        }
    }
}
