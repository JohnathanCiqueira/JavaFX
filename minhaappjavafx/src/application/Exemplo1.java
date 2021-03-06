package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Exemplo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Layout
		FlowPane noRaiz = new FlowPane();
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//No
		Label label = new Label();
		label.setText("Ol� Mundo");
		
		//Adicionar elementos em cena
		noRaiz.getChildren().add(label);
		
		//Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
