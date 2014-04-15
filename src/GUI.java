/**
 *This class will create the Gui interface for the application
 *
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class GUI extends Pizza
{
	
	  private JCheckBox[] veggies;
	  private JCheckBox[] cheeses;
	  private JCheckBox[] meats;
	  private ButtonGroup sizes;
	  private ButtonGroup crusts;
	  private ButtonGroup sauces;
	   
	  private JPanel veggiesPanel;
	  private JPanel cheesesPanel;
	  private JPanel meatsPanel;
	  private JPanel sizesPanel;
	  private JPanel crustsPanel;
	  private JPanel saucesPanel;
	   
	  private JLabel grandTotal;
	
	   
	   public GUI()
	   {		  
		      JFrame frame = new JFrame();      
		      frame.setTitle("Pizza Ordering Application");
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		      frame.setSize(600, 600);
		      frame.setVisible(true);
		        
		      frame.add(veggiesPanel);
		      frame.add(cheesesPanel);
		      frame.add(meatsPanel);
		      frame.add(sizesPanel);
		      frame.add(crustsPanel);
		      frame.add(saucesPanel);
		     
		      frame.add(grandTotal);
	 
	   }
	   
	   /**
	    * Creating the Veggies panel
	    * @return veggiesPanel
	    */
	   
	  public JPanel createVeggiesPanel()
	   {  
		 
		  veggiesPanel = new JPanel(new GridLayout(0,1));
		  veggiesPanel.setLayout(new BoxLayout(veggiesPanel, BoxLayout.Y_AXIS));
		  veggiesPanel.setBackground(Color.green);
		  veggiesPanel.setBorder(new TitledBorder(new EtchedBorder(), "Veggies"));

		  // add meatsfrom class Pizza
		  
		  veggiesPanel.add();
		  JCheckBox checkBox;
		  veggies = new JCheckBox[VEGGIES.length];
       
       for (int i = 0; i < VEGGIES.length; i++)
       {
          checkBox = new JCheckBox ();
          checkBox.setActionCommand(String.valueOf(i));
          veggies[i] = checkBox;
          veggiesPanel.add(checkBox);
       }
       
       return veggiesPanel;

	   }
	  
	  /**
	   * Creating the Cheese panel
	   * @return cheesesPanel
	   */
	  
	  public JPanel createCheesePanel()
	   {
		   cheesesPanel = new JPanel();
	       cheesesPanel.setLayout(new BoxLayout(cheesesPanel, BoxLayout.X_AXIS));
	       cheesesPanel.setBackground(Color.yellow.darker());
	       cheesesPanel.setBorder(new TitledBorder(new EtchedBorder(), "Cheeses"));

	       // add meat toppings from class Pizza
	       
	       JCheckBox checkBox;
	       cheeses = new JCheckBox[CHEESES.length];
	       
	       for (int i = 0; i < CHEESES.length; i++)
	       {
	          checkBox = new JCheckBox ();
	          checkBox.setActionCommand(String.valueOf(i));
	          cheeses[i] = checkBox;
	          cheesesPanel.add(checkBox);
	       }
	       
	       return cheesesPanel; 
	   }
	  
	  /**
	   * Creating the Meats panel
	   * @return meatsPanel
	   */
	  
	  public JPanel createMeatPanel()
	   {
		  JPanel meatsPanel = new JPanel();
	       meatsPanel.setLayout(new BoxLayout(meatsPanel, BoxLayout.Y_AXIS));
		   meatsPanel.setBackground(Color.cyan);

	       meatsPanel.setBorder(new TitledBorder(new EtchedBorder(), "Meats"));

	       // add meats toppings from class Pizza
	       
	       JCheckBox checkBox;
	       meats = new JCheckBox[MEATS.length];
	       
	       for (int i = 0; i < MEATS.length; i++)
	       {
	          checkBox = new JCheckBox ();
	          checkBox.setActionCommand(String.valueOf(i));
	          meats[i] = checkBox;
	          meatsPanel.add(checkBox);
	       }
	       
	       return meatsPanel;
	   }
	  
	  /**
	   * Creating the Size panel
	   * @return sizesPanel
	   */
	  
	  public JPanel createSizePanel()
	   {
		   sizes = new ButtonGroup();
	       sizesPanel = new JPanel();
	       sizesPanel.setBorder(new EtchedBorder());
	       sizesPanel.setBackground(Color.white);
	       sizesPanel.add(new JLabel("Sizes"));

	       // add sizes from class Pizza
	       
	       JRadioButton rButton;
	       
	       for (int i = 0; i < SIZES.length; i++)
	    	   for (int j = 0; j <SIZES.length; j++)
	    	   {
	    		   rButton = new JRadioButton ();
	    		   rButton.setActionCommand(String.valueOf(i));
	    		   sizes.add(rButton);
	    		   sizes.add(rButton);
	    		   
	    		   if (i==0)
	    			   rButton.setSelected(true);
	    	   }
	       
	       return sizesPanel;
  
	   }
	  
	  /**
	   * Creating the Crust panel
	   * @return crustsPanel
	   */
	  
	  public JPanel createCrustPanel()
	   {
		       crusts = new ButtonGroup();
		       crustsPanel = new JPanel();
		       crustsPanel.setBorder(new EtchedBorder());
		       crustsPanel.setBackground(Color.white);
		       crustsPanel.add(new JLabel("Crusts"));

		       // add cruts from class Pizza
		       
		       JRadioButton rButton;
		       
		       for (int i = 0; i < CRUSTS.length; i++)
		       {
		          rButton = new JRadioButton ();
		          rButton.setActionCommand(String.valueOf(i));
		          crusts.add(rButton);
		          crusts.add(rButton);
		          if (i==0)
		             rButton.setSelected(true);
		       }
		       return crustsPanel;
	  
		   
	   }
	  
	  
/**
 * Creating the Sauce panel
 * @return saucesPanel
 */
	  
	  public JPanel createSaucePanel()
	   {
			   sauces = new ButtonGroup();
		       saucesPanel = new JPanel();
		       saucesPanel.setBorder(new EtchedBorder());
			   saucesPanel.setBackground(Color.red);
		       saucesPanel.add(new JLabel("Sauces"));

		       // add sauces from class Pizza
		       
		       JRadioButton rButton;
		       
		       for (int i = 0; i < SAUCES.length; i++)
		       {
		          rButton = new JRadioButton ();
		          rButton.setActionCommand(String.valueOf(i));
		          sauces.add(rButton);
		          
		          if (i==0)
		             rButton.setSelected(true);
		       }
		       
		       return saucesPanel;
	  
		   }
	
	  
	  class OrderButtonListener implements ActionListener
	    {
	       public void actionPerformed(ActionEvent evt)
	       {
	          try
	          {
	            // get pizza size
	             String cmdString = sizes.getSelection().getActionCommand();
	              currentPizza.size = Integer.parseInt(cmdString);

	             // get crust type
	             cmdString = crusts.getSelection().getActionCommand();
	             currentPizza.crust = Integer.parseInt(cmdString);

	             // get sauce type
	             
	             cmdString = sauces.getSelection().getActionCommand();
	             currentPizza.sauce = Integer.parseInt(cmdString);
	             
	             // get selected cheeses
	             for (int i=0; i < cheeses.length; i++)
	                if (cheeses[i].isSelected())
	                {
	                   cmdString = cheeses[i].getActionCommand();
	                   currentPizza.cheeses.add(new Integer(cmdString);
	                }

	             // get selected meat toppings
	             for (int i=0; i < meats.length; i++)
	                if (meats[i].isSelected())
	                {
	                   cmdString = meats[i].getActionCommand();
	                   currentPizza.meats.add(new Integer(cmdString);
	                }

	             // get selected veggie toppings
	             for (int i=0; i < veggies.length; i++)
	                if (veggies[i].isSelected())
	                {
	                   cmdString = veggies[i].getActionCommand();
	                   currentPizza.veggies.add(new Integer(cmdString);
	                }

	          }
	          catch (NumberFormatException e)
	          {
	          }

	       }
	       
	    }         

}

