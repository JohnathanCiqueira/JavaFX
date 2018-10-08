package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoMouseExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		minhaCena.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {

				switch (event.getButton()) {
				case MIDDLE:
					event.consume();
					break;
				case SECONDARY:
					event.consume();
					break;
				}
			}
		});

		minhaCena.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("Primeiro botão pressionado");

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
