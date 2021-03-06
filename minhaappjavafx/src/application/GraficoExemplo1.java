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
import javafx.stage.Stage;

public class GraficoExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Layout
		FlowPane noRaiz = new FlowPane();

		// Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);

		// Cria o eixo X
		CategoryAxis eixoX = new CategoryAxis();

		// Cria o eixo Y
		NumberAxis eixoY = new NumberAxis();

		// Criar o grafico
		//BarChart<String, Number> grafico = new BarChart<>(eixoX, eixoY);
		
		LineChart<String, Number> grafico = new LineChart<>(eixoX, eixoY);

		// Cria as series para o grafico
		XYChart.Series<String, Number> maria = new XYChart.Series<>();
		maria.setName("Maria");
		XYChart.Series<String, Number> joao = new XYChart.Series<>();
		joao.setName("Jo�o");
		XYChart.Series<String, Number> pedro = new XYChart.Series<>();
		pedro.setName("Pedro");

		// Adiciona os dados as s�ries
		maria.getData().add(new XYChart.Data<String, Number>("Janeiro", 2500));
		joao.getData().add(new XYChart.Data<String, Number>("Janeiro", 2000));
		pedro.getData().add(new XYChart.Data<String, Number>("Janeiro", 1000));

		maria.getData().add(new XYChart.Data<String, Number>("Fevereiro", 500));
		joao.getData().add(new XYChart.Data<String, Number>("Fevereiro", 5000));
		pedro.getData().add(new XYChart.Data<String, Number>("Fevereiro", 2000));

		maria.getData().add(new XYChart.Data<String, Number>("Mar�o", 2500));
		joao.getData().add(new XYChart.Data<String, Number>("Mar�o", 100));
		pedro.getData().add(new XYChart.Data<String, Number>("Mar�o", 3000));

		// Adiciona as s�ries ao gr�fico
		grafico.getData().addAll(maria, joao, pedro);

		// Adiciona o grafico ao frafo de cena
		noRaiz.getChildren().add(grafico);

		// Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);

		// Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
