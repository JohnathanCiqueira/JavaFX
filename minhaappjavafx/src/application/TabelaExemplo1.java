package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TabelaExemplo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Layout
		BorderPane noRaiz = new BorderPane();
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//Cria a tabela
		TableView<Contato> tabela = new TableView<>();
		
		//List dos dados
		ObservableList<Contato> dados = FXCollections.observableArrayList();
		
		//Adiciona contatos a lista
		dados.add(new Contato("Jo�o", "Silva", "silva@silva.com"));
		dados.add(new Contato("Maria", "Souza", "ms@souza.com"));
		dados.add(new Contato("Pedro", "Silva", "pedro@silva.com"));
		
		tabela.setItems(dados);
		
		//Cria as colunas para a tabela
		TableColumn<Contato, String> colunaNome = new TableColumn<>("First name");
		colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tabela.getColumns().add(colunaNome);
		
		TableColumn<Contato, String> colunaSobrenome = new TableColumn<>("Last name");
		colunaSobrenome.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
		tabela.getColumns().add(colunaSobrenome);
		
		TableColumn<Contato, String> colunaEmail = new TableColumn<>("Email");
		colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tabela.getColumns().add(colunaEmail);
		
		
		//Adiciona a tabela a cena
		noRaiz.setCenter(tabela);
		
		//Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
