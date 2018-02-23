import javax.swing.*;
import javax.swing.text.EditorKit;
import java.awt.*;

public class Board extends JPanel{

    Ball ball;
    Paddle paddle;
    Bricks bricks;

    public Board(Game game){
        setPreferredSize(new Dimension(800,600));
        setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
    }

    private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
        //returns the LENGTH of the STRING parameter to the variable stringLen
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        //determines the center of the WIDTH parameter and subtracts the center of the length
        //to determine the X value to start the string
        int start = width/2 - stringLen/2;
        //prints s at the desired X position with adjustment and the desired y.
        g2d.drawString(s, start + XPos, YPos);
    }

}
