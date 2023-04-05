package PongV2;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	double xVel, yVel, x, y;
	
	public Ball() {
		x = 350;
		y = 250;
		xVel = -1;
		yVel = 1;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval((int)x-10, (int)y-10, 20, 20); // den ritar cirklen från mitten
	}
	
	public void checkPaddleCollision(Paddle p1, Paddle p2) {
		if(x <= 50) {
			 if(y >= p1.getY() && y <= p1.getY() + 80)
				 xVel = -xVel;
					 
		}
		else if(x >= 650){
			if(y >= p2.getY() && y <= p2.getY() + 80)
				xVel = -xVel;
		}
	}
	
	public void move() {
		x += xVel;
		y += yVel;
		
		if (y < 10) // om den nuddar längst upp ska den åker ner 
			yVel = -yVel; 
		if (y > 490)// om den nuddar längst ner ska den åka upp (spelplan 500)
			yVel = -yVel; 
	}
	
	public int getX() {
		return (int) x;
	}
	
	public int getY() {
		return (int) y;
	}
}
