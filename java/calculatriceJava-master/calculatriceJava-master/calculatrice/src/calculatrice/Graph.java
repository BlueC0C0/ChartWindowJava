package calculatrice;
import java.awt.*;
import java.util.Random;

import javax.swing.JPanel;

public class Graph extends JPanel {


	public void paintComponent(Graphics g){                
	             
	}
	
	public void drawTab(int[][] tab)
	{
		
		int tab2[][] = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
		
		for(int i=0; i<3; i++)
		{
			for(int y=0; y<3; y++) {
				if(tab[i][y]==1)
				{
					if(tab2[i][0]==0)
					{
						tab2[i][0]= nombreAlea(50, this.getWidth()-50);
						tab2[i][1]= nombreAlea(50, this.getHeight()-50);
					}
					if(tab2[y][0]==0)
					{
						tab2[i][0]= nombreAlea(50, this.getWidth()-50);
						tab2[i][1]= nombreAlea(50, this.getHeight()-50);
					}
					
					this.graphDraw(tab2[i][0], tab2[i][1], tab2[y][0], tab2[y][1]);
				}
			}
		}
	}
	
	private void graphDraw(int x1,int y1,int x2,int y2)
	{
		this.draw
	}
	
	private int nombreAlea(int min,int max)
	{
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}