package shootfeedFish;

import java.awt.Rectangle;

public class Fire extends Thread{ 
	
	
	Bullet bullet;
	Level1design g1;
	Level1[][] level1;
	public static int score = 0;
	
	Fire(Bullet bullet, Level1design g1, Level1[][] level1){
		this.bullet = bullet;
		this.g1 = g1;
		this.level1 = level1;
	}
	
	
	@Override
	public void run() {
		while(bullet.getyAxis() > -100) {
			bullet.setyAxis(bullet.getyAxis() - 40);  // set speed of bullet ban ra
			checkColl();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g1.repaint();
		}
	}
	public void checkColl() {
		Rectangle bulletRec = new Rectangle(bullet.getxAxis(), bullet.getyAxis(), 14, 20); 
		
		for(int i = 0; i < level1.length; i++) {
			for(int j = 0; j < level1[i].length; j++) {
				Rectangle level1Rec = new Rectangle(level1[i][j].getxAxis(), level1[i][j].getyAxis(), 25, 25);
				if(bulletRec.intersects(level1Rec)) {
					level1[i][j].setxAxis(1000000);
					bullet.setxAxis(-10000);
					score += 10 ;

				}
			}
		}
	}
}
