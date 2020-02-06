package calculatrice;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	private JPanel pan = new JPanel();
	
		Graph tableau = new Graph();
	
	
	
	public Fenetre(){
		
	    this.setTitle("Ma premi�re fen�tre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    
	    this.setLayout(null);
	    this.setContentPane(tableau);
	    int tab[][]= {{0,1,0},{0,1,0},{0,1,0}};
	    tableau.drawTab(tab);
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
	    
	    this.run();
	  }
	private void run()
	{
		for(;;)
		{
			this.
		}
	}
}