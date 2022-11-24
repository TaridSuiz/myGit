package main;
import javax.swing.*;

import java.awt.*;
public class GamePanel extends JPanel{
	//screen setting
	final int originalTileSize = 16;//16*16 tile
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale;//48*48
	final int maxScreenCol = 16;
	final int maxScreenRow = 12; //
	final int screenWidth = tileSize*maxScreenCol; //768pix
	final int screenHeight = tileSize * maxScreenRow;// 576pix
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
