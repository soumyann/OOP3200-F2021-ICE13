/*
 * File : OOP3200_F2021_ICE 13
 * Created by: Tom Tsiliopoulos
 * Edited by: Soumya Narayanamandiram Narayananunni
 * Date: Dec 17, 2021
 */


package ca.durhamcollege.oop3200f2021week13;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    public HelloApplication() {
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        final Label helloLabel = new Label("Hello, World");
        Label goodByeLabel = new Label("Good Bye!");
        Button clickMeButton = new Button("Click me");
        Font font = Font.font("Consolas", FontWeight.BOLD, 20.0D);
        clickMeButton.setFont(font);
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");
                helloLabel.setText("Clicked!");
            }
        });
        GridPane gridPane = new GridPane();
        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);
        Scene scene = new Scene(gridPane, (double)WIDTH, (double)HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}