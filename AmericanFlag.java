import java.awt.*;
import java.applet.*;

public class AmericanFlag{

	private Rectangle union;
	private Rectangle[] stripes;
	private double scale;
	private Star[][] wstars;
	
	public AmericanFlag(int x, int y, double scale){
		this.scale = scale;
		this.union = new Rectangle(x,(y+(int)(this.scale*10)),(int)(this.scale*99),(int)(this.scale*70), Color.blue);
		this.stripes = new Rectangle[13];
		this.wstars = new Star[9][6];
		// this.wstars = new Stars[9][6];
		
		for (int i = 0; i < 13 ; i++ ) {
			if (i % 2 == 0) {
				stripes[i] = new Rectangle(x, (int)((i + 1) * this.scale*10 + y), (int)(this.scale * 247),(int)(this.scale * 10), Color.red);
						
			}else{
				stripes[i] = new Rectangle(x, (int)((i + 1) * this.scale*10 + y), (int)(this.scale * 247),(int)(this.scale * 10), Color.white);
			}		
		}
		for (int i = 0; i < 9; i++){
			for (int j = 0; j < 6; j++){
				if (i%2 ==0){
					// wstars[i][j] = new Stars((int)(2*8.19*this.scale*(j+1)+(x-8.94*this.scale)), (int)((i+1)*this.scale*6.50 + y+this.scale*10), (int)(this.scale * 4),(int)(this.scale * 4), Color.white);
					wstars[i][j] = new Star(5,(int)(2*8.19*this.scale*(j+1)+(x-8.0*this.scale)), (int)((i+1)*this.scale*6.5 + y+this.scale*13), (int)(this.scale * 4),(int)(this.scale * 4), Color.white);
				}else{
					wstars[i][j] = new Star(5,(int)(2*8.19*this.scale*(j+1)+x), (int)((i+1)*this.scale*6.5 + y+this.scale*13), (int)(this.scale * 4),(int)(this.scale * 4), Color.white);
					}
			}
		 }

	}
	public void draw(Graphics g){
		for (int i = 0; i < 13; i++) {
			stripes[i].draw(g);
		}
		this.union.draw(g);
		for (int i = 0 ; i < this.wstars.length; i++){
				for (int j = 0; j< 6; j++){
					if (i%2 ==0){
				     this.wstars[i][j].draw(g);
					}else {
						if (j<5){
							this.wstars[i][j].draw(g);
						}
					}
				}
		}
	}	
}