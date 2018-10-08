package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		// No
		ObservableList<String> frutas = FXCollections.observableArrayList("Maça", "Banana", "Laranja", "Pera",
				"Melancia");
		ComboBox combo = new ComboBox(frutas);
		combo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println(newValue);

			}

		});

		// Adicionar elementos em cena
		noRaiz.getChildren().add(combo);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
