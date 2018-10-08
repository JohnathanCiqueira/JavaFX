package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout
		BorderPane noRaiz = new BorderPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//Barra de menu
		MenuBar mb = new MenuBar();
		
		//Criar o menu Arquivo
		Menu menuArquivo = new Menu("Arquivo");
		
		//Itens do menu Arquivo
		MenuItem novo = new MenuItem("Novo");
		MenuItem abrir = new MenuItem("Abrir");
		MenuItem sair = new MenuItem("Sair");
		
		sair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
		});
		
		//Adiciona os itens ao menu Arquivo
		menuArquivo.getItems().addAll(novo, abrir, sair);
		
		//Adiciona o menu Arquivo à barra de menu
		mb.getMenus().add(menuArquivo);
		
		//Adiciona o meu bar ao nó raiz
		noRaiz.setTop(mb);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
