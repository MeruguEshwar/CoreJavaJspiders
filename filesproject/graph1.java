import java.awt.*;
import java.applet.*;
class graph1 extends Applet
{
	String str=" ";
	public void init()
	{
		str="init()....";
	}
	public void start()
	{
		str=str+"start().....";
	}
	public void paint(Graphics g)
	{
		str=str+"paint()...";
		g.drawString(str,100,100);
	}
	public void stop()
	{
		str=str+"stop()...";
	}
	public void destory()
	{
		str=str+"destory().....";
	}
}