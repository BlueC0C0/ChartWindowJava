package calculatrice;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.*;

public class Graph extends JPanel {
	private int tab[][]=   {{1,1,1,1,1},
							{1,1,1,1,1},
							{1,1,1,1,1},
							{1,1,1,1,1},
							{1,1,1,1,1}};
	
	private int tab2[][] = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
	
	private int totalPoints = 5;
	
	public void paintComponent(Graphics g){
		this.setCoordonnees();
		for(int i=0; i<this.totalPoints; i++)
		{
			for(int y=0; y<this.totalPoints; y++)
			{
				if(this.tab[i][y]==1 && i!=y)
				{
						g.drawLine(tab2[0][i], tab2[1][i], tab2[0][y], tab2[1][y]);
						g.drawString(String.valueOf(i+1), tab2[0][i]-10, tab2[1][i]-10); 
						g.drawString(String.valueOf(y+1), tab2[0][y]-10, tab2[1][y]-10);  
				}
				else if(this.tab[i][y]==1 && i==y)
				{
					g.drawOval(tab2[0][i], tab2[1][i]-this.getHeight()/40, (int) ((this.getWidth()/20)-Math.cos(Math.PI *0.75)), (int) ((this.getHeight()/20)-Math.sin(Math.PI *0.75)));
					g.drawString(String.valueOf(i+1), tab2[0][i]-10, tab2[1][i]-10); 
				}
			}
		}
	}
	
	public void setTab(int[][] tab)
	{
		System.out.println("appel de set Tab");
		this.tab = tab.clone();
	}
	
	public void setTotalPoints(int var)
	{
		this.totalPoints = var;
	}
	
	private void setCoordonnees()
	{
		
		double varEc =  (2*Math.PI)/this.totalPoints;

		double deca = varEc;
		for(int i=0; i<this.totalPoints; i++)
		{
			this.tab2[0][i]=  (int) (this.getWidth()/2 + Math.cos(deca)*(this.getWidth()/2-this.getWidth()/20));
			
			this.tab2[1][i]= (int) (this.getHeight()/2 + Math.sin(deca)*(this.getHeight()/2-this.getHeight()/20));
			
			System.out.println("deca = "+deca+"  n°"+i+" coord X : "+ this.tab2[0][i]+ "  coord Y : "+ this.tab2[1][i]);
			deca+= varEc;
		}
		System.out.println("");
	}
	
	private int nombreAlea(int min,int max)
	{
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}