package tetris;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Alert;
import javafx.concurrent.Task;

import java.net.URL;

public class Main extends Application {//Main class includes the main method for tetris game

    private static MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TetrisGameLogic.getInstance().startGame();
    }

    public void start() {
        TetrisGameLogic.getInstance().startGame();
    }

}
