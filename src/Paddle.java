import java.awt.*;

public class Paddle {

    private int x, y;
    private final int WIDTH = 100, HEIGHT = 20;
    Board board;
    Game game;
    Ball ball;

    public Paddle(Board board, Game game, Ball ball){
        x = 0;
        y = 0;
    }

    public void move(){
        if(game.isLeftPressed()){
            if(x > 0){
                x -= 5;
            }
        }

        if(game.isRightPressed()){
            if (x + WIDTH < board.getWidth()){
                x += 5;
            }
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public void setPosition(int x, int y){

    }

    public void paint (Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
