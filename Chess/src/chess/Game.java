package chess;
import javax.swing.*;
/*Most of this project were copied from u/jlundstedt*/
public class Game implements Runnable {
    public void run() {
        SwingUtilities.invokeLater(new StartMenu());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());
    }
}
