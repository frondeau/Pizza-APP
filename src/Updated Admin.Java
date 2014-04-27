/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaapplication;

import java.util.Scanner;

/**
 *
 * @author michaelgordon
 */

/**
 * The Admin account is a special type of Account that has higher functionality.
 * Its main purpose is to Retrieve orders.
 * 
 * @author michaelgordon
 */
public class Admin extends Account
{
    String userName,passWord;
    final String accountType = "admin";
    
    /**
     * Creates a new Admin Account.  Adds the account username and password
     * to the ArrayList in the Account class.
     * @param name
     * @param pass 
     */
    public void createAdminAccount(String name, String pass)
   {
       userName = name;
       passWord = pass;
       super.userNames.add(userName);
       super.passWords.add(passWord);
       System.out.println("Admin Account Created");
   }
    
    /**
     * Handles the sign in process.  The username must match the Password
     * at specific indexes in the ArrayList from the Account class.
     * Returns true if successful, false if invalid.
     * @param name
     * @param pass
     * @return 
     */
    public boolean adminSignIn(String name, String pass)//Made boolean return type
    {
        int i = 0;
        while(i < super.userNames.size() )
        {
            if(super.userNames.get(i).equals(name))
            {
                if(super.passWords.get(i).equals(pass))
                {
                    return true;
                }
            }
            i++;
        }
        return false;
        
    }
    
    /**
     * This method retrieves Pizza orders from the ArrayList in the Account class
     * based on the userName provided.
     * @return 
     */
    public Pizza retrieveOrder(User user) //Get Pizza object from arraylist of recorded orders in Account
    {
        Scanner keyboard = new Scanner(System.in);    
        System.out.println("Enter customer UserName to retrieve order: ");
        String userToSearch = keyboard.nextLine();
        
       
        for(int i = 0; i < user.orderList.size();i++)
        {
            if(user.orderList.get(i).userWhoOwnsPizza.equals(userToSearch))
            {
                System.out.println("Order found");
                return user.orderList.get(i);
            }
        }
       System.out.println("Order not found"); 
       return null;
    }
    
    /*public void updateStock()
    {                    
        I believe this method should be removed.  We dont have
        a class to keep track of stock.  All we have is a pizza
        class that, when instantiated, each have its own set of
        stock/ingrediants.  Implementing this class would require
        us to make a Stock class, atleast thats what I think.
    
        Everytime we do Pizza newPizza = new Pizza(); a whole new list
        of ingrediants is also created.  That would require us to remove
        all the ingredents from the pizza class and put them in an ingredents
        class.
    }*/
}
