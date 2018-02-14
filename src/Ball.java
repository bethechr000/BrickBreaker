import java.awt.*;

public class Ball {

    final int diameter = 50;
    final int speed = 3;
    int x,y;


    public Rectangle getBounds(){
        return new Rectangle(x, y, diameter, diameter);
    }
    public void paint(Graphics g){
        g.fillOval(x, y, diameter, diameter);
    }

}
