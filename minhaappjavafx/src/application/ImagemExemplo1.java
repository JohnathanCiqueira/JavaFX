package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImagemExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//Criar imagem
		Image img = new Image("http://goo.gl/YsuGV");
		
		//Criar um image view
		ImageView iv = new ImageView(img);
		
		//Adiciona image view ao grafo de cena
		noRaiz.getChildren().add(iv);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
