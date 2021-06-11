/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear.Mammals;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class Test2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
private AnchorPane root5;
    
    @FXML
  void gb (ActionEvent event){
      try {
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/Mammals/FXML1.fxml").toURI().toURL();
//          root1 = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root1);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        }
        catch (Exception e){
        e.printStackTrace(); 
        }
  }
  
  @FXML
    void menu (ActionEvent event){
      try {
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/FXML.fxml").toURI().toURL();
//          root1 = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root1);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        }
        catch (Exception e){
        e.printStackTrace(); 
        }
  }
  
    @FXML
    void wrong (ActionEvent event){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Computer-aided Learning for Kids");
            alert.setHeaderText("You are wrong");
            alert.setContentText("Try again");
            alert.setOnCloseRequest(event1 -> {alert.close();});

            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.show();
    }
    
    @FXML
    void right (ActionEvent event){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Computer-aided Learning for Kids");
            alert.setHeaderText("You are right");
            alert.setContentText("Congratulations");
            alert.setOnCloseRequest(event1 -> {alert.close();});

            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.show();
    }
    
    @FXML
    void previous (ActionEvent event){
      try {
          
                    AnchorPane root5 = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/Test1.fxml"));
        Scene scene = new Scene(root5);
        Stage stage = (Stage) this.root5.getScene().getWindow();
        stage.setScene(scene);
          
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/Mammals/Test1.fxml").toURI().toURL();
//          root1 = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root1);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        }
        catch (Exception e){
        e.printStackTrace(); 
        }
  }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
