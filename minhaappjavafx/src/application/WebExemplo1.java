package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		// Cria um webview
		WebView wv = new WebView();
		
		// Obtem o weenfine
		WebEngine engine = wv.getEngine();
		
		//Carrega a página
		engine.load("https://www.wikipedia.org/");
		
		//Adiciona o webview ao grafo de cena
		noRaiz.getChildren().add(wv);
		

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
