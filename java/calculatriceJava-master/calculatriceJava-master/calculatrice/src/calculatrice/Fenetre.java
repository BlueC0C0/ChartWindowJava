package calculatrice;


import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	
		Graph tableau = new Graph();
	
	
	public Fenetre(){
		int tab[][]= {{0,1,0},{1,1,1},{1,1,1}};
		
	    this.setTitle("Ma première fenètre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(null);
	    tableau.sendTab(tab);
	    this.setContentPane(tableau);
	    this.setVisible(true);
	    
	 }
	
	public Fenetre(String name, int xRes, int yRes){
		
	    this.setTitle(name);
	    this.setSize(xRes, yRes);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	    	
	    this.setLayout(null);
	    this.setContentPane(tableau);
	    this.setVisible(true);
	    
	    //this.run();
	  }
	private void run()
	{
		for(;;)
		{
		}
	}
}