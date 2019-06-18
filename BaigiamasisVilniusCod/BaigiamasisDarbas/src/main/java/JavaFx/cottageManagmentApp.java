package JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class cottageManagmentApp {

	public void start(Stage primaryStage) {
		primaryStage.setTitle("");
		Button btn = new Button();
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		btn.setText("Insert New Customer into Database");
		btn1.setText("Delete Customer From Database");
		btn2.setText("Input Order Into Database");
		btn3.setText("Delete Order From Database");

		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Insert New Customer into Database");
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

	public static void main(String[] args) {
		// launch(args);
	}
}
