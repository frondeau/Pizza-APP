/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaapplication;

import java.io.Console;
import java.io.Reader;
import static java.lang.System.console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author michaelgordon
 */

/**
 * The Account class handles all the storing of information regarding accounts.
 * Ie. Passwords,
 * userNames, orders, account Creation, etc...
 * @author michaelgordon
 */
public class Account
{
     ArrayList<String> userNames = new ArrayList();
     ArrayList<String> passWords = new ArrayList();//add password arraylist
     ArrayList<Integer> orderHistory = new ArrayList();
     ArrayList<Pizza> orderList = new ArrayList();
    
    
 /**
  * This method checks to see if a user exist.  If it does not, it prompts
  * the user to create an account. If the user says yes, it prompts for a username
  * and password, then adding that info to the ArrayList.  If the user says no,
  * The method returns.
  * @return 
  */
    public boolean verifyUserAccount()//Changed return type
    {   
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter UserName to verify: ");
        String userToVerify = keyboard.nextLine();
        
        
        for(String user : userNames)
        {
            if(user.equals(userToVerify))
            {
                System.out.println("User verification successful!");
                return true;
            }
        }
        //Create user object if desired then return true
       System.out.println("User not found, would you like to create an account: Y/N?");
       String input = keyboard.nextLine();
      
       
       if(input.equals("y") || input.equals("Y"))
       {
      
           System.out.println("Enter New UserName: ");
           String nuser = keyboard.nextLine();
           System.out.println("Enter New Password: ");
           String npass = keyboard.nextLine();
           userNames.add(nuser);
           passWords.add(npass);
           
            for(String user : userNames)
            {
                if(user.equals(nuser))
                {
                    System.out.println("Account created!");
                    return true;
                }
            }          
       }      
       return false;    
    }
    
    /**
     * This method adds pizza orders to the ArrayList which keeps track of orders.
     * @param order 
     */
    public void recordOrders(Pizza order)//Need more info
    {
        //Call whenever user places order with PlaceOrder() and stores
        //order info inside ArrayLIst<Pizza>
        orderList.add(order);
    }  
}
