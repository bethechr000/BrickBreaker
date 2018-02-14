public class GAMESTATES {

    private static boolean isPlay = false;
    private static boolean isPause = false;
    private static boolean isMenu = true;
    private static boolean isEnd = false;
    private static Integer score = new Integer(0);

    //Gets and Sets score
    public static Integer getScore() {
        return score;
    }

    public static void increaseScore() {
        score++;
    }

    public static void setScore(int a) {
        score = a;
    }

    public static boolean isPlay() {
        return isPlay;
    }

    public static boolean isPause() {
        return isPause;
    }

    public static boolean isMenu() {
        return isMenu;
    }

    public static boolean isEnd() {
        return isEnd;
    }

    public static void startPlay() {
        isPlay = true;
    }

    public static void stopPlay() {
        isPlay = false;
    }

    public static void startMenu() {
        isMenu = true;
    }

    public static void stopMenu() {
        isMenu = false;
    }

    public static void startPause() {
        isPause = true;
    }

    public static void stopPause() {
        isPause = false;
    }

    public static void endGame() {
        isEnd = true;
    }

    public static void startGame() {
        isEnd = false;
    }

    /* METHODS FOR TOGGLING BETWEEN GAMESTATES

     */
    public static void togglePlay() {
        if (isPlay) {
            isPlay = false;
        } else {
            isPlay = true;
        }
    }

    public static void togglePause() {
        if (isPause)
            isPause = false;
        else
            isPause = true;
    }

    public static void toggleMenu() {
        if (isMenu)
            isMenu = false;
        else
            isMenu = true;
    }
}