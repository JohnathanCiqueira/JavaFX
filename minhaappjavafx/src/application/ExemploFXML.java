package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Layout
		VBox noRaiz = new VBox();

		// Cria um objeto URL para um documento FXML
		URL fxmlUrl = this.getClass().getClassLoader().getResource("minhainterface.fxml");

		// Carrega o arquivo no FXML
		noRaiz = FXMLLoader.<VBox>load(fxmlUrl);

		// Cena
		Scene minhaCena = new Scene(noRaiz);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
