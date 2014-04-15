import java.util.ArrayList;


public class Accounts 
{
	ArrayList<String> userNames = new ArrayList<String>();
    ArrayList<String> passWords = new ArrayList<String>();//add password arraylist
    ArrayList<Integer> orderHistory = new ArrayList<Integer>();
   
   

   public boolean verifyUserAccount(String name)//Changed return type
   {
       for(String user : userNames)
       {
           if(user.equals(name))
           {
               return true;
           }
       }
       //Create user object if desired then return true
       return false;
   }
   
   public void storeUserAccount()//Delete this and update doc
   {
       
   }
   
   public void recordOrders()//Need more info
   {
       //Call whenever user places order with PlaceOrder() and stores
       //order info inside ArrayLIst<Pizza>
   }
   
 
}


