package PongV2;

import java.awt.Color;
import java.awt.Graphics;

public class AIPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
	int player, x; //player höger eller vänster, X och Y är positionen i för paddle
	Ball b1; // trackar mängden av bollen
	
	public AIPaddle(int player, Ball b) {
		upAccel = false; downAccel = false;
		b1 = b;
		y = 210; yVel = 0;
		if (player == 1)
			x = 20;
		else                            //placering vart spelaren ska vara beronde på vilken Player man blir
			x = 660;
	} 
	
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int)y, 20, 80);
	}

	public void move() {
		y = y + (b1.getY() - y - 40) * 0.06; // hur snabbt AIPaddle ska röra på sig (svårighetsgrad SVÅR: y= b1.getY() - 40;)
		
		if(y < 0)   // så att den inte åker utanför Applet (uppe)
			y = 0;
		if(y > 420)
			y = 420; // så att den inte åker utanför Applet (nere)
	}
	
	public int getY() {
		
		return (int)y;
	}

}
