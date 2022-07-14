package com.al3ncar.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        VBox temp = new VBox();
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        temp.getChildren().add(new Quadrado());
        Scene principal = new Scene(temp, 800, 600);

        stage.setScene(principal);
        stage.setTitle("Gerenciadores de Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
