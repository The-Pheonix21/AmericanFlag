import java.awt.*;
import java.applet.*;


public class Rectangle {

	private Point topLeft;
	private int width;
	private int height;
	private Color color;

	public Rectangle(int x, int y, int width, int height, Color color){
		this.topLeft = new Point(x,y);
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(this.topLeft.x(),this.topLeft.y(),this.width,this.height);
	}
}
