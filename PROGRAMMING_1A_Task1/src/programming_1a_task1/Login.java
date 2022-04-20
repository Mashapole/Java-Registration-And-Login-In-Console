
package programming_1a_task1;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Login 
{
   public String Name,Pass,first,last="";
     
   public Login()
   {
       
   }
   
   public Login(String firstName,String lastName)
   {
      this.first=firstName;
      this.last=lastName;
   }
   
    public  boolean checkUserName(String userName) 
    {
       //errorList=new ArrayList<>();
      
       Pattern underScore=Pattern.compile("[_]");

       if(underScore.matcher(userName).find() && userName.length()==5)
       {
           
           System.out.println("Username is  correctly formatted");
           Name=userName;
           return true;
       }
       else
       {
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        
        return false;
       }
     
    
    }
    public boolean checkPasswordComplexity(String password) 
    {
        
        Pattern character=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
        Pattern upperLetter=Pattern.compile("[A-Z]");
        Pattern lowerLetter=Pattern.compile("[a-z]");
        Pattern number=Pattern.compile("[0-9]");
        
        if(password.length()>8 && character.matcher(password).find() && upperLetter.matcher(password).find() && lowerLetter.matcher(password).find() && number.matcher(password).find())
        {
        Pass=password;
        System.out.println("Password Successfully captured"); 
        System.out.println("Password meets complexity requirements");
        
        return true;
        }
        else
        {
         System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character ");
         
         return false;
        }
        

    }

  public static void RegisterUser(Scanner scan) 
    {
        PROGRAMMING_1A_Task1 getMethod=new PROGRAMMING_1A_Task1();
        
        while(true)
        {
            try
            {
               getMethod.prompt(scan);
            }
            catch(Exception e)
            {
             System.out.println("You entered wrong entry, Please enter 1 to continue or any key to exit.");
             String key=scan.next();
             
             if("1".equals(key))
             {
               getMethod.prompt(scan);
             }
             else
             {
                 System.exit(0);
             }
                
            } 
            break;
        }
    }
    public boolean LoginUser(String userName, String logPassword) 
    {
        
        if(userName.equals(Name) || logPassword.equals(Pass))
        {
        
        System.out.println("The username or password matched");
        System.out.println(LoginStatus(userName,logPassword));
        System.out.println("Welcome <"+first+"> ,<"+last+"> it is great to see you again.\n\n ");
       
            
        return true;
        }
        
         System.out.println("The username or password does not match what is been Registered");
        return false;
    }
    
    public String LoginStatus(String userName, String logPassword)
    {
        String status="";
        
        if(!userName.equals(Name) || !logPassword.equals(Pass))
        {
            status="\nLogin Failed";
        }
        else
        {
            status="\nA successful login";
        }
        
        return status;
    }
    

   
}
