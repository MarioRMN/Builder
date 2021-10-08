package builder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BuilderController {

	@FXML
	private TextField inputText;
	
	@FXML
	private Text text;
	
	@FXML
	private void handlerBuilder(ActionEvent event) {
		text.setText("Bienvenido "+ inputText+"");
		
	}
}
