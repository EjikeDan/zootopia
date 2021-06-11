/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear.Mammals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class FXMLController implements Initializable {

    
    @FXML
    private AnchorPane root1;

      @FXML
    private Button gt1;
      @FXML
    private VBox liontext;
      
    @FXML
    void action (ActionEvent event) throws IOException {
        
        try {
//            URL url = new File("src/finalyear/FXML.fxml").toURI().toURL();
//            root = FXMLLoader.load(url);
//            // Stage stage1 = new Stage();
//         Stage stage1 = (Stage) root.getScene().getWindow();
//        
//        
//        //root = FXMLLoader.load(getClass().getClassLoader().getResource("/../FXML.fxml"));
//        
//        stage1.setScene( new Scene (root, 800, 600));
//        stage1.show();
        }
        catch (Exception e){
        e.printStackTrace(); 
        }
    }
    
    @FXML
    void menu (ActionEvent event){
      try {
          
          AnchorPane root1 = FXMLLoader.load(getClass().getResource("/finalyear/FXML.fxml"));
        Scene scene = new Scene(root1);
        Stage stage = (Stage) this.root1.getScene().getWindow();
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
          
          AnchorPane root1 = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/Test.fxml"));
        Scene scene = new Scene(root1);
        Stage stage = (Stage) this.root1.getScene().getWindow();
        stage.setScene(scene);
          
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
            
            AnchorPane root1 = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/FXML2.fxml"));
        Scene scene = new Scene(root1);
        Stage stage = (Stage) this.root1.getScene().getWindow();
        stage.setScene(scene);
            
//         System.out.println("Hello World!");
//         URL url = new File("src/finalyear/Mammals/FXML2.fxml").toURI().toURL();
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
            
            AnchorPane root1 = FXMLLoader.load(getClass().getResource("/finalyear/Mammals/FXML1.fxml"));
        Scene scene = new Scene(root1);
        Stage stage = (Stage) this.root1.getScene().getWindow();
        stage.setScene(scene);
            
//         System.out.println("Hello World!");
//         URL url = new File("src/finalyear/Mammals/FXML1.fxml").toURI().toURL();
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
