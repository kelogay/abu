import java.awt.*;
import java.applet.*;

/*<applet code="Q3" width=1000 height=1000></applet>*/

public class Q3 extends Applet
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.red);
		g.fillPolygon(new int[] {300,320,382,332,352,300,250,270,216,280},
						new int[] {40,92,92,132,195,156,190,132,92,92}, 10);
						
		g.setColor(Color.yellow);
		g.fillPolygon(new int[] {500,520,582,532,552,500,450,470,416,480},
						new int[] {40,92,92,132,195,156,190,132,92,92}, 10);
						
		g.setColor(Color.green);
		g.fillPolygon(new int[] {700,720,782,732,752,700,650,670,616,680},
						new int[] {40,92,92,132,195,156,190,132,92,92}, 10);
	}
}