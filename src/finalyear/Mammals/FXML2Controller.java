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
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class FXML2Controller implements Initializable {

    @FXML
private AnchorPane root;
    
   @FXML
    void menu (ActionEvent event){
      try {
          
          AnchorPane root = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/FXML1.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
          
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/FXML.fxml").toURI().toURL();
//          root = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root);
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
          
          
          
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/Mammals/Test.fxml").toURI().toURL();
//          root = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root);
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
    void next (ActionEvent event) {
        
        try{  
            
            AnchorPane root = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/FXML3.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
            
//         System.out.println("Hello World!");
//         URL url = new File("src/finalyear/Mammals/FXML3.fxml").toURI().toURL();
//          root = FXMLLoader.load(url);
//        Scene scene = new Scene(root);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML
    void previous (ActionEvent event) {
        
        try{  
            
            AnchorPane root = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/FXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
            
//         System.out.println("Hello World!");
//         URL url = new File("src/finalyear/Mammals/FXML.fxml").toURI().toURL();
//          root = FXMLLoader.load(url);
//        Scene scene = new Scene(root);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        
        }
        catch(Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML
    void sound (ActionEvent event) {
    MediaPlayer audio = new MediaPlayer( new Media (new File("src/finalyear/Mammals/lion.mp3").toURI().toString()));
    audio.play();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
