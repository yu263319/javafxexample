package org.openjfx.fxtest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		//Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("Stage Demo Program");
		stage.setHeight(420);
		stage.setWidth(420);
		stage.setResizable(false);
//		stage.setX(50);
//		stage.setY(50);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("YOU CAN'T ESCAPE, Press X to exit");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("X"));
		
		stage.setScene(scene);
		stage.show();
		
	}

    public static void main(String[] args) {
        launch();
        System.out.print("Hello!");
    }

}