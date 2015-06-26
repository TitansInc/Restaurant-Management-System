import java.applet.*;
import java.awt.*;
public class ms extends Applet implements Runnable{
	Graphics offscreen;
	Image i,background,foreground[];
	Thread animation;
	int width,height,j,current=0;
	MediaTracker m;
	public void init()
	{
		m=new MediaTracker(this);
		foreground = new Image[5];
		width=bounds().width;
		height=bounds().height;
		setBackground(Color.black);
		i=createImage(width, height);
		offscreen = i.getGraphics();
		background = getImage(getCodeBase(), "bg.png");
		m.addImage(background, 0);
		for(j=0;j<5;j++)
		{
			foreground[j]=getImage(getCodeBase(), "ms/"+(j+1)+".jpg");
			m.addImage(foreground[j],0);
		}
		try{
			m.waitForAll();
		}
		catch(Exception e){
			
		}
	}
	public void start()
	{
		animation = new Thread(this);
		animation.start();
	}
	public void paint(Graphics g)
	{
		
		
		offscreen.drawImage(background, 0, 0, this);
		offscreen.drawImage(foreground[current], 10, 10,170,170, this);
		g.drawImage(i,0,0,width,height,this);
	}
	public void update()
	{
		if(current>3)
				current=0;
		else
			current++;
			
	}

	public void run()
	{
		while(true)
		{
			update();
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}
