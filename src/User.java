
public class User extends Accounts
{
   String userName,passWord; //changed password to string so we can use the
                             //equals() method
   final String accountType = "user";
   public void createAccount(String name, String pass)
   {
       userName = name;
       passWord = pass;
       super.userNames.add(userName);
       super.passWords.add(passWord);
       System.out.println("User Account Created");
   }
    public boolean signIn(String name, String pass)//changed return type
    {
        int i = 0;
        while(i <= super.userNames.size() )
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
   
    public void placeOrder()
    {
        //Waiting on pizza class
        //Pizza pizzaOrder = new Pizza();
    }
}


