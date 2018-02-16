import java.awt.*;

public class Ball {

    final int diameter = 40;
    final int Speed = 3;
    int x,y;
    double dx = Speed, dy = Speed;

    public Rectangle getBounds(){
        return new Rectangle(x, y, diameter, diameter);
    }
    public void paint(Graphics g){
        g.fillOval(x, y, diameter, diameter);
    }

}
