package application;
	


import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class HelloWorld extends Application {
	private SimpleStringProperty text = new SimpleStringProperty();
	public static void main(String[] args) {
		
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
	primaryStage.setTitle("Hello World!");
	BorderPane root = new BorderPane();
	VBox vb=new VBox();
	vb.setPrefSize(400, 100);
	Button btn = new Button();
	TextField tf = new TextField();
	Label lb=new Label();
	lb.setText("");
	btn.setText("Say 'Hello World'");
	btn.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent event) {
			System.out.println("Hello World");
		}
	});
	root.setCenter(vb);
	vb.getChildren().add(btn);
	vb.setAlignment(Pos.CENTER);
	vb.getChildren().add(tf);
	vb.getChildren().add(lb);
	lb.textProperty().bind(tf.textProperty());
	vb.setSpacing(10);
	primaryStage.setScene(new Scene(root, 300, 250));
	primaryStage.show();
	}
}
