package builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Builder extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		
		FXMLLoader loader = new FXMLLoader(Builder.class.getResource("Builder.fxml"));
		StackPane sp =(StackPane) loader.load();
		
		
		Scene scene = new Scene(sp);
		stage.setScene(scene);
		stage.setTitle("Builder");
		stage.show();
		
	}
}
