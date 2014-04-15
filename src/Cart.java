/**
 * This class will implement the payment process
 *
 */
public class Cart extends Pizza
{
	float finalPrice;
	private float TAX = finalPrice *0.07f; 
	
	public float computeGrandTotal()
	{
		return finalPrice = partialPrice + TAX;
	}
	
	public void makePayment (int cardNumber)
	{
	//This method will implement the process to receive payment
	}
	
	public void printConfirmation()
	{
		System.out.println ( "Your total price is: " + finalPrice);
	}
	
}
