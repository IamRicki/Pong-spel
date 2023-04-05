package PongV2;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
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
		if(upAccel) {
			yVel -= 2; // upp
		}
		else if(downAccel) {
			yVel += 2; // ner 
		}
		else if(!upAccel && !downAccel){
			yVel *= GRAVITY;
		}
		
		if(yVel >5) 
			yVel = 5; //snabbheten, om den går över 5 går den tbx till 5
		else if(yVel <= -5)
			yVel = -5;
		
		y += yVel;
		
		if(y < 0)   // så att den inte åker utanför Applet (uppe)
			y = 0;
		if(y > 420)
			y = 420; // så att den inte åker utanför Applet (nere)
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
