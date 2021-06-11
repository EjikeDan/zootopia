/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalyear;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.util.Duration;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ButtonBar.ButtonData;
import java.util.Optional;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.WindowEvent;

public class FinalYear extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        Parent root1 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root, 500, 400);
        Scene scene1 = new Scene(root1, 800, 600);
        
        Stage stage = new Stage();
        stage.setScene(scene1);
        stage.setTitle("Computer-aided Learning for Kids");
        stage.setMaximized(true);
        Platform.setImplicitExit(false);
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
          public void handle(WindowEvent we) {
              we.consume();
              Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Computer-aided Learning for Kids");
            alert.setContentText("Do you want to exit?");
            alert.setOnCloseRequest(event1 -> {alert.close();});

            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO , buttonTypeCancel);
            
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.YES){
                alert.close();
                Platform.exit();
                System.exit(0);
            } else if (result.get() == ButtonType.NO) {
             alert.close();
            }
          }
          
        });
        
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        
        PauseTransition delay;
        delay = new PauseTransition(Duration.seconds(10));
        delay.setOnFinished( event -> stage.show());
        delay.play();
        
        PauseTransition delay2;
        delay2 = new PauseTransition(Duration.seconds(10));
        delay2.setOnFinished( event -> primaryStage.close());
        delay2.play();
//       
//        Button btn5 = new Button();
//        btn5.setText("Say 'Hello World'");
//        btn5.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        VBox vbox = new VBox(btn, btn1, btn2, btn3, btn4);
//        VBox vbox1 = new VBox(btn5);
//        
//        root.getChildren().add(vbox);
//        root1.getChildren().add(vbox1);
                
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}


