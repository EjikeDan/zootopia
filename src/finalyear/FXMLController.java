/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

public class FXMLController  extends FinalYear {
    
    @FXML
    private AnchorPane root;
//    private Button exit;
//    private Button mm;
    
//    @FXML
//            void btn (ActionEvent event) {
//                try {
//            System.out.println("Hello World!");
//                }
//              catch(Exception e){
//        e.printStackTrace(); 
//        }  
//            }
            
       @FXML         
    void gtm (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Mammals/FXML1.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML         
    void amphibians (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Amphibians/FXML.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML         
    void birds (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Birds/FXML.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML         
    void fishes (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Fishes/FXML.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML         
    void reptiles (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Reptiles/FXML.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML         
    void zootopia (ActionEvent event) {
        try{  
         System.out.println("Hello World!");
         Stage stage1 = (Stage) root.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
        
        
        
    }

    
    @FXML
      void exit (ActionEvent event) {
          Platform.exit();
                System.exit(0);
          
          Stage stage = (Stage) root.getScene().getWindow();
          stage.close();
//          new EventHandler<WindowEvent>() {
//            @Override
//          public void handle(WindowEvent we) {
//              System.out.println("Hello World!");
//           Stage stage = (Stage) root.getScene().getWindow();
//              we.consume();
//              Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                    alert.setTitle("Computer-aided Learning for Kids");
//                    alert.setContentText("Do you want to exit?");
//                    alert.setOnCloseRequest(event1 -> {alert.close();});
//
//            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
//
//            alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO , buttonTypeCancel);
//            
//            Optional<ButtonType> result = alert.showAndWait();
//            if (result.get() == ButtonType.YES){
//                alert.close();
//                stage.close();
//            } else if (result.get() == ButtonType.NO) {
//             alert.close();
//            }
//          }
//      };
              }
}

