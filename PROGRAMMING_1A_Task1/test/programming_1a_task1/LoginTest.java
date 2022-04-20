package programming_1a_task1;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class LoginTest 
{
    //our object for the class which contains metods to be tested
    
    Login getMethod;

    public LoginTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        getMethod=new Login();
    }
    
    @After
    public void tearDown() 
    {
        
    }
  
    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() 
    {
        
        String testUserName="ky1_1";
        boolean r;
        getMethod= new Login();
        r=getMethod.checkUserName(testUserName);
        
        assertEquals(true,r);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() 
    {
        String testPassword="Ch&&sec@ke99!";
        boolean result;
        getMethod= new Login();
        result=getMethod.checkPasswordComplexity(testPassword);
        
        assertEquals(true,result);
      
    }
    @Test
    public void testLoginUser() 
    {
        
        String UserName="ky1_1";
        String passw="Ch&&sec@ke99!";
        
        boolean r;
        getMethod= new Login();
        r=getMethod.LoginUser(UserName,passw);
        
        assertEquals(false,r); 
    }
    
}
