import java.util.ArrayList;

/**
 * 	Declaration of the different components that will make up a pizza
 */

public class Pizza 
{
	static final float PIZZA_PRICE = 4.00f;
    static final float SIZE_INCREMENT_PRICE = 1.0f;
	static final float TOPPING_PRICE = 0.25f;
	
	private int [] small = new int [10];
	private int [] medium = new int [10];
	private int [] large = new int [10];
	  
	public int[][] SIZES = new int [][] {small, medium, large};
	
	private int [] glutenFree = new int [15];
	private int [] wholeWeat = new int [15];
	private int [] classic = new int [15];
	
	public int [][] CRUSTS = new int [][] {glutenFree, wholeWeat, classic};
	
	private int [] tomatoSauce = new int [15];
	private int [] alfredo = new int [15];
	private int [] barbecue = new int [15];  
	
	public int [][] SAUCES = new int [][] {tomatoSauce, alfredo, barbecue};
	
	private int [] mozzarella = new int [15];
	private int [] parmesan = new int [15];
	private int [] provolon = new int [15];
	
	public int [][] CHEESES = new int [][] {mozzarella, parmesan, provolon};
	
	private int [] pepperoni = new int [20];
	private int [] sausage = new int [20];
	private int [] chicken = new int [20];
	  
    public int [][] MEATS = new int [][] {pepperoni, sausage, chicken};
    
    private int [] garlic = new int [15];
    private int [] peppers = new int [15];
    private int [] onion = new int [15];
    private int [] tomato = new int [15];
    private int [] olive = new int [15];
    
    public int [][] VEGGIES = {garlic, peppers, onion, tomato, olive};
    
    int quantity;
    int crust;
    int sauce;
    int size;
    int orderNumber;
    float partialPrice;
    
    ArrayList<int[]> cheeses;
    ArrayList<int[]> meats;
    ArrayList<int[]> veggies;
    
    /**
     * Creating a pizza object
     */
    public Pizza() 
    {
    	int cr = 0;
    	int sc = 0;
    	int sz = 0;
    	int pnum = 0;
    	
        cheeses = new ArrayList<int[]>();
        meats = new ArrayList<int[]>();
        veggies = new ArrayList<int[]>();
        crust = cr;
        sauce = sc;
        size = sz;
        orderNumber = pnum;
    }
    
    public int chooseSize()
    {
    	return size;
    }
    
    public int[] chooseCheeses()
    {
    	int [] cheese = null;
    	for (int i = 0; i < cheeses.size(); i++)
    	
    	cheese = cheeses.get(i);
    	
    	return cheese;
    	   
    }
    
    public int[] chooseMeats()
    {
    	int [] meat = null;
    	for (int i = 0; i < meats.size(); i++)
    	
    	meat = meats.get(i);
    	
    	return meat;
     }
    
    public int[] chooseVeggies()
    {
    	int [] veg = null;
    	for (int i = 0; i < veggies.size(); i++)
    	
    	veg = veggies.get(i);
    	
    	return veg;
    	   
    }
    
    public int chooseCrust()
    {
    	return crust;
    }
    
    public int chooseSauce()
    {
    	return sauce;
    }
    
    public ArrayList<Pizza> createPizza()
    {
    	ArrayList <Pizza> pizzaOrder = new ArrayList<Pizza>();
    	
    	
    	currentPizza.chooseCheeses();
    	currentPizza.chooseCrust();
    	currentPizza.chooseSauce();
    	currentPizza.chooseMeats();
    	currentPizza.chooseSize();
    	currentPizza.chooseVeggies();
    	
    	pizzaOrder.add(currentPizza);
    	
    return pizzaOrder;
    	
    }
    
    public float partialTotal()
 
    {   //This method will calculate the current pizza order price	
    	//It will return the partial price before tax
    	
    	return 	partialPrice;
    }
    
public Pizza currentPizza;
}
