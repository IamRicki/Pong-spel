package PongV2;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	int player, x; //player höger eller vänster, X och Y är positionen i för paddle
	
	public HumanPaddle(int player) {
		upAccel = false; downAccel = false;
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
	
		
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	
	public void setDownAccel(boolean input) {
		downAccel = input;
	}


	public int getY() {
		
		return (int)y;
	}

}
