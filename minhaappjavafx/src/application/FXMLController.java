package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
	
	@FXML
	private Label label;
	
	public void digaOla() {
		label.setText("Olá Mundo 2!");
	}

}
