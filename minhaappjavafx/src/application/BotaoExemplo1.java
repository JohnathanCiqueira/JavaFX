package application;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BotaoExemplo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Layout
		FlowPane noRaiz = new FlowPane();
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		minhaCena.setOnKeyTyped(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				System.out.println(event.getCharacter());
			}
			
		});
		
		//Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
