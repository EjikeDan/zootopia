/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear;

import java.io.IOException;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Danni
 */
public class Test extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
        StackPane root = new StackPane();
        StackPane root1 = new StackPane();
        
        Parent rt = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(rt, 800, 600);
        Scene scene1 = new Scene(root1, 800, 600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        PauseTransition delay;
        delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished( event -> primaryStage.setScene(scene1));
        delay.play();
        
        Button btn = new Button();
        btn.setText("Say" );
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
            }
        });
        
        Button btn1 = new Button();
        btn1.setText("Say 'Hello World'");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Say 'Hello World'");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Say 'Hello World'");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("Say 'Hello World'");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
       
        Button btn5 = new Button();
        btn5.setText("Say 'Hello World'");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        VBox vbox = new VBox(btn, btn1, btn2, btn3, btn4);
        VBox vbox1 = new VBox(btn5);
        
        root.getChildren().add(vbox);
        root1.getChildren().add(vbox1);
        
        }
        catch(IOException e){
        e.printStackTrace();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
