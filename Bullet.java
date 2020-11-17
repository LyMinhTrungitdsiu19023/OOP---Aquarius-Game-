package shootfeedFish;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Bullet {
	private int xAxis;
	private int yAxis; 
	private String imageBullet;
	public Bullet(int xAxis, int yAxis, String imageBullet) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.imageBullet = imageBullet;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImageBullet() {
		return imageBullet;
	}
	public void setImageBullet(String imageBullet) {
		this.imageBullet = imageBullet;
	}
	
	public void drawBullet(Graphics a) {
		ImageIcon Bullet = new ImageIcon(imageBullet);
		a.drawImage(Bullet.getImage(), xAxis, yAxis, null); 
		
	}

}
