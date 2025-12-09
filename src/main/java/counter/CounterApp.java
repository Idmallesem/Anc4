package counter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CounterApp extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Label("ANC is fun!"));
        stage.setTitle("Counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}