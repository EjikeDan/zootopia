/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear.Birds;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class FXMLController implements Initializable {

    @FXML
    private AnchorPane root6;
    
    @FXML
    void menu (ActionEvent event){
      try {
          System.out.println("Hello World!");
          
        AnchorPane root6 = FXMLLoader.load(getClass().getResource("/finalyear/FXML.fxml"));
        Scene scene = new Scene(root6);
        Stage stage = (Stage) this.root6.getScene().getWindow();
        stage.setScene(scene);
          
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
  void test (ActionEvent event){
      try {
          System.out.println("Hello World!");
          
//          URL url = new File("src/finalyear/Birds/Test.fxml").toURI().toURL();
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
  void next (ActionEvent event){
      try {
          System.out.println("Hello World!");
          
          AnchorPane root6 = FXMLLoader.load(getClass().getResource("/finalyear/Birds/FXML1.fxml"));
        Scene scene = new Scene(root6);
        Stage stage = (Stage) this.root6.getScene().getWindow();
        stage.setScene(scene);
          
//          URL url = new File("src/finalyear/Birds/FXML1.fxml").toURI().toURL();
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
