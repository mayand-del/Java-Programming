import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
public class CircleMove extends Frame{
    public CircleMove(){
        super("MyFrame");
        setVisible(true);
        setSize(1000,1000);
        setLocation(400,300);
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(500,400,200,200);
        g.drawLine(100,100,500,500);
    }
    public static void main(String args[]){
        new CircleMove();
    }

}