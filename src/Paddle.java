import java.awt.*;

public class Paddle {

    private int x, y;
    private final int WIDTH = 20, HEIGHT = 100;
    Board board;
    Game game;
    Ball ball;

    public Paddle(Board board, Game game, Ball ball){
        x = 0;
        y = 0;
    }

    public void paint (Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
