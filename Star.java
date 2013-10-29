import java.applet.*;
import java.awt.* ;
import java.lang.Math ;
public class Star {
private int sides, x, y, w, h;
private Color c;
private double halfPI = Math.PI/2.;

public double circleX(int sides, int angle) {
    double coeff = (double)angle/(double)sides;
    return Math.cos(2*coeff*Math.PI-halfPI);
}

public double circleY(int sides, int angle) {
    double coeff = (double)angle/(double)sides;
    double halfPI= Math.PI/2.;
    return Math.sin(2*coeff*Math.PI-halfPI);
}
public Star(int sides, int x, int y, int w, int h, Color c) {
    this.w = w;
    this.h = h;
    this.c = c;
    this.x = x;
    this.y = y;
    this.sides=sides;
    }

public void draw(Graphics g) {
    g.setColor(c);
    for(int i = 0; i < sides; i++) {
        int x1 = (int)(circleX(sides,i) * (double)(w)) + x;
        int y1 = (int)(circleY(sides,i) * (double)(h)) + y;
        int x2 = (int)(circleX(sides,(i+2)%sides) * (double)(w)) + x;
        int y2 = (int)(circleY(sides,(i+2)%sides) * (double)(h)) + y;
        g.drawLine(x1,y1,x2,y2);
    }
}
}