import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Game extends JPanel implements KeyListener{

    private Board board;
        public Game (){
            //accents in the game
            board = new board();
            add(board);
            board.Begin();
        }
     public static void main(String[] args){
            new Game();
     }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            rightPressed = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            leftPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            rightPressed = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            leftPressed = false;
        }

    public boolean RightPressed(){
            return rightPressed;
        }
    public boolean LeftPressed(){
            return leftPresed;
        }
    }
}
