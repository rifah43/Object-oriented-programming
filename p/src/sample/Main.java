package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Application");
        button = new Button();
        button.setText("Hi");
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
