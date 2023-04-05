import java.applet.*;
import java.awt.*;

/*<applet code="Q2" width=1000 height=1000></applet>*/

public class Q2 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(500,500,180,180);
		
		
		g.setColor(Color.yellow);
		Font f = new Font("Times New Roman", Font.BOLD, 20);
		g.setFont(f);
		g.drawString("Mahipal",565,590);
	}
}