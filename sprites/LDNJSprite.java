import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LDNJSprite implements DisplayableSprite, MovableSprite {

	Image image = null;
	private double centerX = 0;
	private double centerY = 0;
	private double width = 128;
	private double height = 128;
	public LDNJSprite() {
		super();

		if (image == null) {
			try {
				image = ImageIO.read(new File("res/ldnj/avatar.png"));
				
			}
			catch (IOException e) {
				System.out.println(e.toString());
			}
			
			
		}		
	}

	@Override
	public void setCenterX(double centerX) {
		// TODO Auto-generated method stub
		this.centerX = centerX;
	}

	@Override
	public void setCenterY(double centerY) {
		// TODO Auto-generated method stub
		this.centerY = centerY;
	}

	@Override
	public void setVelocityX(double pixelsPerSecond) {
	}

	@Override
	public void setVelocity(double pixelsPerSecond) {
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}

	@Override
	public boolean getVisible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double getMinX() {
		// TODO Auto-generated method stub
		return this.centerX - (this.width / 2);
	}

	@Override
	public double getMaxX() {
		// TODO Auto-generated method stub
		return this.centerX + (this.width / 2);
	}

	@Override
	public double getMinY() {
		// TODO Auto-generated method stub
		return this.centerY - (this.height / 2);
	}

	@Override
	public double getMaxY() {
		// TODO Auto-generated method stub
		return this.centerY + (this.height / 2);
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public double getCenterX() {
		// TODO Auto-generated method stub
		return this.centerX;
	}

	@Override
	public double getCenterY() {
		// TODO Auto-generated method stub
		return this.centerY;
	}

	@Override
	public boolean getDispose() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Universe universe, KeyboardInput keyboard, long actual_delta_time) {
		// TODO Auto-generated method stub
		//distance - velocity * time
		//deltaX = ??
		//deltaY = ??
		this.centerX += deltaX;
	}




	
	
}
