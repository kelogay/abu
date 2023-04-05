import java.applet.*;
import java.awt.*;

/*<applet code="Q1" width=1000 height=1000></applet>*/

public class Q1 extends Applet
{
    public void paint(Graphics g)
    {
        // g.drawString("Duias", 400, 400);
             
        // g.drawLine(130,8,310,190);
        // g.drawRect(80,80,80,80);
        // g.drawOval(100,100,100,100);
        // g.drawArc();
        
        int[] lineX = {500,600,500,400};
        int[] lineY = {50,150,250,150};
        int s = 4;
        g.setColor(Color.yellow);
        g.fillPolygon(lineX,lineY,4);
        // g.setColor(Color.black);
        // g.drawPolygon(lineX,lineY,4);
        
        int[] lineXx = {500,560,440};
        int[] lineYy = {250,300,300};
        int ss = 3;
        
        g.setColor(Color.red);
        g.fillPolygon(lineXx,lineYy,3);
        // g.setColor(Color.black);
        // g.drawPolygon(lineXx,lineYy,3);
        
        
        g.setColor(Color.black);
        g.drawLine(500,50,500,250);
        
        g.drawArc(400,127,200,50,0,180);
    }
}