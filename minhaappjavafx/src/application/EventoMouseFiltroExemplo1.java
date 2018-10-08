package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoMouseFiltroExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		minhaCena.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				int qtdeClick = event.getClickCount();

				switch (event.getButton()) {
				case PRIMARY:
					System.out.println("Primeiro botão pressionado");
					break;
				case MIDDLE:
					System.out.println("Terceiro botão pressionado");
					break;
				case SECONDARY:
					System.out.println("Segundo botão pressionado");
					break;
				}

				System.out.println(qtdeClick);
			}
		});

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
