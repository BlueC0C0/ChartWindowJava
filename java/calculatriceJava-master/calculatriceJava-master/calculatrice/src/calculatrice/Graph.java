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
	
	public void paintComponent(Graphics g){                
		for(int i=0; i<5; i++)
		{
			for(int y=0; y<5; y++) {
				if(this.tab[i][y]==1)
				{
					if(this.tab2[0][i]==0)
					{
						this.tab2[0][i]= nombreAlea(50, this.getWidth()-50);
						this.tab2[1][i]= nombreAlea(50, this.getHeight()-50);
					}
					if(this.tab2[0][y]==0)
					{
						this.tab2[0][y]= nombreAlea(50, this.getWidth()-50);
						this.tab2[1][y]= nombreAlea(50, this.getHeight()-50);
					}
						g.drawLine(tab2[0][i], tab2[1][i], tab2[0][y], tab2[1][y]);
						g.drawString(String.valueOf(i+1), tab2[0][i]-10, tab2[1][i]-10); 
						g.drawString(String.valueOf(y+1), tab2[0][y]-10, tab2[1][y]-10);  
				}
			}
		}
	}
	
	public void sendTab(int[][] tab)
	{
		this.tab = tab.clone();
	}
	
	private int nombreAlea(int min,int max)
	{
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}