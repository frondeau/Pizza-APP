
	public class Admin extends Accounts
	{
	    String userName,passWord;
	    final String accountType = "admin";
	    
	    public void createAdminAccount(String name, String pass)
	   {
	       userName = name;
	       passWord = pass;
	       super.userNames.add(userName);
	       super.passWords.add(passWord);
	       System.out.println("Admin Account Created");
	   }
	    
	    public boolean adminSignIn(String name, String pass)//Made boolean return type
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
	    
	    public void retrieveOrder()
	    {
	        //Waiting on Pizza class
	        //Get Pizza object from arraylist of recorded orders in Account
	    }
	    
	    public void updateStock()//This is going to need a stock object passed in
	    {                       
	        //Still thinking about this part
	    }
	}


