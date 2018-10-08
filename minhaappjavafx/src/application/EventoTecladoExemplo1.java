package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoTecladoExemplo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Layout
		FlowPane noRaiz = new FlowPane();
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//No
		Button botao = new Button();
		botao.setText("Olá Mundo");
		
		botao.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				System.out.println("Ola Mundo!");
			}
			
		});
		
		//Adicionar elementos em cena
		noRaiz.getChildren().add(botao);
		
		//Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
