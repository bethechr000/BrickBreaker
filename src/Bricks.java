import javax.swing.*;
import java.awt.*;

public class Bricks extends JPanel{

    private final int HEIGTHT = 5 , WIDTH = 10;



    public Bricks(){

    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH,HEIGTHT);
        }

    }



}

