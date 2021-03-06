package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EffectsDemo extends Application{

	private Reflection reflection;
	private BoxBlur blur;
	private Glow glow;
	private Button btnBlur;
	private Button btnGlow;
	private Label reflect;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Layout
		FlowPane noRaiz = new FlowPane();
		
		//Cena
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		//Create the effects
		reflection = new Reflection();
		blur = new BoxBlur(1.0, 1.0, 1);
		glow = new Glow(0.0);
		
		//Create push buttons
		btnBlur = new Button("Blur off");
		btnGlow = new Button("Glow");
		
		//Set the blur and glow effects
		btnGlow.setEffect(glow);
		btnBlur.setEffect(blur);
		
		//Create the reflection label
		reflect = new Label("Reflection Adds Visual Sparkle");
		
		//Set the reflection effect on the reflection label
		reflection.setTopOpacity(0.7);
		reflection.setBottomOpacity(0.3);
		reflect.setEffect(reflection);
		
		
		//Handle the action events for the Blur button		
		btnBlur.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			}
			
			
		});
		
		//Adicionar elementos em cena
		noRaiz.getChildren().add(btnBlur);
		
		//Adicionar a cena ao palco
		primaryStage.setScene(minhaCena);
		
		//Exibir o palco e sua(s) cena(s)
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
